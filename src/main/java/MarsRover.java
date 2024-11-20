import java.util.Arrays;

public class MarsRover {
    private static final Direction[] DIRECTION_LOOP = Direction.values();
    private static final Boolean FORWARD = true;
    private static final Boolean BACKWARD = false;
    private static final String MOVE_FORWARD = "M";
    private static final String MOVE_BACKWARD = "B";
    private static final String TURN_LEFT = "L";
    private static final String TURN_RIGHT = "R";
    private static final int FORWARD_STEP = 1;
    private static final int BACKWARD_STEP = -1;

    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public MarsRover() {
        this(0, 0, Direction.N);
    }

    public String getStatus() {
        return x + ":" + y + ":" + direction;
    }

    public void executeCommand(String command) {
        Arrays.stream(command.split("")).forEach(this::executeSingleCommand);
    }

    public void executeSingleCommand(String command) {
        switch (command) {
            case MOVE_FORWARD -> move(FORWARD);
            case MOVE_BACKWARD -> move(BACKWARD);
            case TURN_LEFT -> turnLeft();
            case TURN_RIGHT -> turnRight();
        }
    }

    public void move(Boolean isForward) {
        int step = isForward ? FORWARD_STEP : BACKWARD_STEP;
        switch (direction) {
            case N -> y += step;
            case E -> x += step;
            case S -> y -= step;
            case W -> x -= step;
        }
    }

    public void turnRight() {
        this.direction = DIRECTION_LOOP[(direction.ordinal() + 1) % 4];
    }

    public void turnLeft() {
        // Add DIRECTION_LOOP.length to avoid negative index
        this.direction = DIRECTION_LOOP[((direction.ordinal() - 1) + DIRECTION_LOOP.length) % 4];
    }
}
