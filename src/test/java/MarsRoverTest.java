import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    @Test
    void should_initialize_mars_rover() {
        MarsRover rover = new MarsRover();

        String Status = rover.getStatus();

        assertEquals("0:0:N", Status);
    }

    void should_face_east_when_turned_right_from_north() {
        MarsRover rover = new MarsRover();

        rover.executeCommand("R");

        String Status = rover.getStatus();

        assertEquals("0:0:E", Status);
    }
}
