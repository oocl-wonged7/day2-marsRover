
public class MarsRover {
    private static final Direction[] DIRECTION_LOOP = {Direction.N, Direction.E, Direction.S, Direction.W};

    public int x;
    public int y;
    public Direction direction;

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
        if (command.equals("M")){
            move(true);
        }else if (command.equals("B")){
            move(false);
        }else if (command.equals("R")) {
            turnRight();
        } else if (command.equals("L")) {
            turnLeft();
        }
    }

    public int getCurrentDirectIndex(){
        return java.util.Arrays.asList(DIRECTION_LOOP).indexOf(direction);
    }

    public void move(Boolean isForward) {
        int step = isForward ? 1 : -1;
        switch (direction) {
            case N -> y += step;
            case E -> x += step;
            case S -> y -= step;
            case W -> x -= step;
        }
    }

    public void turnRight() {
        this.direction = DIRECTION_LOOP[(getCurrentDirectIndex() + 1) % 4];
    }

    public void turnLeft() {
        // Add DIRECTION_LOOP.length to avoid negative index
        this.direction = DIRECTION_LOOP[((getCurrentDirectIndex() - 1) + DIRECTION_LOOP.length) % 4];
    }
}
