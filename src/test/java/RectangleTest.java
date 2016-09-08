import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {

  @Test
  public void isSquare_instantiatesRectangleObject() {
    Rectangle testObj = new Rectangle(3,4);
    assertEquals(true, testObj instanceof Rectangle);
  }

  @Test
  public void isSquare_comparesLengthAndWidthOfAQuadrilateral_true(){
    Rectangle testObj = new Rectangle(4,4);
    assertEquals(true, testObj.isSquare());
  }
}
