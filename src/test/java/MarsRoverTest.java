import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    @Test
    void should_initialize_mars_rover() {
        MarsRover rover = new MarsRover();

        String status = rover.getStatus();

        assertEquals("0:0:N", status);
    }

    @Test
    void should_face_east_when_turned_right_from_north() {
        MarsRover rover = new MarsRover();

        rover.executeCommand("R");

        String status = rover.getStatus();

        assertEquals("0:0:E", status);
    }

    @Test
    void should_face_south_when_turned_right_from_east() {
        MarsRover rover = new MarsRover(0,0,Direction.E);

        rover.executeCommand("R");

        String status = rover.getStatus();

        assertEquals("0:0:S", status);
    }

    @Test
    void should_face_west_when_turned_right_from_south() {
        MarsRover rover = new MarsRover(0,0,Direction.S);

        rover.executeCommand("R");

        String status = rover.getStatus();

        assertEquals("0:0:W", status);
    }

    @Test
    void should_face_north_when_turned_right_from_west() {
        MarsRover rover = new MarsRover(0,0,Direction.W);

        rover.executeCommand("R");

        String status = rover.getStatus();

        assertEquals("0:0:N", status);
    }

    @Test
    void should_face_west_when_turned_left_from_north() {
        MarsRover rover = new MarsRover();

        rover.executeCommand("L");

        String status = rover.getStatus();

        assertEquals("0:0:W", status);
    }

    @Test
    void should_face_north_when_turned_left_from_east() {
        MarsRover rover = new MarsRover(0,0,Direction.E);

        rover.executeCommand("L");

        String status = rover.getStatus();

        assertEquals("0:0:N", status);
    }

    @Test
    void should_face_east_when_turned_left_from_south() {
        MarsRover rover = new MarsRover(0,0,Direction.S);

        rover.executeCommand("L");

        String status = rover.getStatus();

        assertEquals("0:0:E", status);
    }

    @Test
    void should_face_south_when_turned_left_from_west() {
        MarsRover rover = new MarsRover(0,0,Direction.W);

        rover.executeCommand("L");

        String status = rover.getStatus();

        assertEquals("0:0:S", status);
    }

    @Test
    void should_move_forward_when_facing_north() {
        MarsRover rover = new MarsRover();

        rover.executeCommand("M");

        String status = rover.getStatus();

        assertEquals("0:1:N", status);
    }

    @Test
    void should_move_forward_when_facing_east() {
        MarsRover rover = new MarsRover(0,0,Direction.E);

        rover.executeCommand("M");

        String status = rover.getStatus();

        assertEquals("1:0:E", status);
    }

    @Test
    void should_move_forward_when_facing_south() {
        MarsRover rover = new MarsRover(0,0,Direction.S);

        rover.executeCommand("M");

        String status = rover.getStatus();

        assertEquals("0:-1:S", status);
    }

    @Test
    void should_move_forward_when_facing_west() {
        MarsRover rover = new MarsRover(0,0,Direction.W);

        rover.executeCommand("M");

        String status = rover.getStatus();

        assertEquals("-1:0:W", status);
    }

    @Test
    void should_move_backward_when_facing_north() {
        MarsRover rover = new MarsRover();

        rover.executeCommand("B");

        String status = rover.getStatus();

        assertEquals("0:-1:N", status);
    }

    @Test
    void should_move_backward_when_facing_east() {
        MarsRover rover = new MarsRover(0,0,Direction.E);

        rover.executeCommand("B");

        String status = rover.getStatus();

        assertEquals("-1:0:E", status);
    }

    @Test
    void should_move_backward_when_facing_south() {
        MarsRover rover = new MarsRover(0,0,Direction.S);

        rover.executeCommand("B");

        String status = rover.getStatus();

        assertEquals("0:1:S", status);
    }

    @Test
    void should_move_backward_when_facing_west() {
        MarsRover rover = new MarsRover(0,0,Direction.W);

        rover.executeCommand("B");

        String status = rover.getStatus();

        assertEquals("1:0:W", status);
    }

    @Test
    void should_move_correctly_with_batch_commands() {
        MarsRover rover = new MarsRover();

        rover.executeCommand("MRBLM");

        String status = rover.getStatus();

        assertEquals("-1:2:N", status);
    }
}
