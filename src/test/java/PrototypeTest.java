import org.junit.Test;
import prototype.shapes.Circle;
import prototype.shapes.Rectangle;

import static org.junit.Assert.*;
public class PrototypeTest {
    @Test
    public void testCircleClone() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        Circle anotherCircle = (Circle) circle.clone();

        assertEquals(anotherCircle, circle);
    }
    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";

        Rectangle anotherRectangle = (Rectangle) rectangle.clone();

        assertEquals(rectangle, anotherRectangle);
    }
    @Test
    public void testCircleNotEquals() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        Circle circle2 = new Circle();
        circle.x = 220;
        circle.y = 200;
        circle.radius = 10;
        circle.color = "blue";

        assertNotEquals(circle2, circle);
    }
}