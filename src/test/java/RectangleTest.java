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

  @Test
  public void isSquare_comparesLengthAndWidthOfAQuadrilateral_false(){
    Rectangle testObj = new Rectangle(3,4);
    assertEquals(false, testObj.isSquare());
  }

  @Test
  public void isSquareOverloaded_comparesLengthAndWidthOfAQuadrilateral_true(){
    Rectangle testObj = new Rectangle(4,4);
    assertEquals(true, testObj.isSquare(5,5));
  }

  @Test
  public void isSquareOverloaded_comparesLengthAndWidthOfAQuadrilateral_false(){
    Rectangle testObj = new Rectangle(4,4);
    assertEquals(false, testObj.isSquare(3,5));
  }
}
