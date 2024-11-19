
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
        if (command.equals("M")){
            moveForward();
        } else if (command.equals("R")) {
            turnRight();
        } else if (command.equals("L")) {
            turnLeft();
        }
    }

    public int getCurrentDirect(){
        return java.util.Arrays.asList(DirectionLoop).indexOf(direction);
    }

    public void moveForward() {
        if (direction.equals("N")) {
            y++;
        } else if (direction.equals("E")) {
            x++;
        } else if (direction.equals("S")) {
            y--;
        } else if (direction.equals("W")) {
            x--;
        }
    }

    public void turnRight() {
        this.direction = DirectionLoop[(getCurrentDirect() + 1) % 4];
    }

    public void turnLeft() {
        this.direction = DirectionLoop[((getCurrentDirect() - 1) + 4) % 4];
    }
}
