package pl.warsjawa;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloTest {

    @Test
    public void testMessage() {
        Hello hello = new Hello();
        assertEquals("Hello message", hello.getMessage());
    }
}
