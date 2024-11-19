import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {
    @Test
    public void should_initialize_mars_rover() {
        MarsRover rover = new MarsRover();

        String Status = rover.getStatus();

        assertEquals("0:0:N", Status);
    }
}
