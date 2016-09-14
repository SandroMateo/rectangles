import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {
  private Rectangle firstRectangle;
  private Rectangle secondRectangle;

  @Before
  public void initialize() {
    firstRectangle = new Rectangle(3,3);
    secondRectangle = new Rectangle(17,17);
  }

  @Test
  public void isSquare_instantiatesRectangleObject() {
    assertEquals(true, firstRectangle instanceof Rectangle);
  }

  @Test
  public void getWidth_returnsWidth_int() {
    assertEquals(3, firstRectangle.getWidth());
  }

  @Test
  public void getLength_returnsLength_int() {
    assertEquals(3, firstRectangle.getLength());
  }

  @Test
  public void isSquare_comparesLengthAndWidthOfAQuadrilateral_true(){
    assertEquals(true, firstRectangle.isSquare());
  }

  @Test
  public void all_ReturnsAllInstancesOfRectangle_true() {
    assertTrue(Rectangle.all().contains(firstRectangle));
    assertTrue(Rectangle.all().contains(secondRectangle));
  }
}
