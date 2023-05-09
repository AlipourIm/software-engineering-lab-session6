import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeTest {
    @Test
    public void testClone() {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        assertEquals("Square", clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        assertEquals("Circle", clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        assertEquals("Rectangle", clonedShape3.getType());
    }
}