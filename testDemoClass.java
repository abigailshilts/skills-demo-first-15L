import static org.junit.Assert.*;
import org.junit.*;

public class testDemoClass {
    private demoClass test1;

    @Before
    public void setUp(){
        test1 = new demoClass();
    }

    @Test
    public void testAddToY(){
        test1.addToY(4);
        assertEquals(test1.x, 4);
    }
}
