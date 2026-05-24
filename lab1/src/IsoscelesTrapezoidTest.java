import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsoscelesTrapezoidTest {

    @Test
    public void testGetMidline() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(4, 10, 4);
        // (4 + 10) / 2 = 7
        assertEquals(7.0, trapezoid.getMidline(), 0.0001);
    }

    @Test
    public void testGetArea() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(4, 10, 4);
        // S = 7 * 4 = 28
        assertEquals(28.0, trapezoid.getArea(), 0.0001);
    }

    @Test
    public void testGetLeg() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(4, 10, 4);
        // єгип трик 4 3 5
        assertEquals(5.0, trapezoid.getLeg(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(4, 10, 4);
        // P = 4 + 10 + 5 + 5 = 24
        assertEquals(24.0, trapezoid.getPerimeter(), 0.0001);
    }

    @Test
    public void testGetDiagonal() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(4, 10, 4);
        // D = sqrt(4^2 + 7^2) = sqrt(16 + 49) = sqrt(65)
        double expectedDiagonal = Math.sqrt(65);
        assertEquals(expectedDiagonal, trapezoid.getDiagonal(), 0.0001);
    }
}