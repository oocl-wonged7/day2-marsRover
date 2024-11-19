
public class MarsRover {
    public static final String[] DirectionLoop= {"N", "E", "S", "W"};

    public int x;
    public int y;
    public String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public MarsRover() {
        this(0, 0, "N");
    }

    public String getStatus() {
        return x + ":" + y + ":" + direction;
    }

    public void executeCommand(String command) {
    }

    public void moveForward() {
    }

    public void turnRight() {
    }

    public void turnLeft() {
    }
}
