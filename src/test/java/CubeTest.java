import org.junit.*;
import static org.junit.Assert.*;

public class CubeTest {
  private Cube firstCube;
  private Cube secondCube;
  private Rectangle mRectangle;

  @Before
  public void initialize() {
    mRectangle = new Rectangle(4,4);
    secondCube = new Cube(mRectangle);
    firstCube = new Cube(mRectangle);
  }

  @Test
  public void Cube_instanceOf_true() {
    assertTrue(firstCube instanceof Cube);
  }

  @Test
  public void getFace_returnsFace_Rectangle() {
    assertEquals(mRectangle, firstCube.getFace());
  }

  @Test
  public void calculateVolume_multipliesLengthWidthHeight_int() {
    assertEquals(64, firstCube.calculateVolume());
  }

  @Test
  public void calculateSurfaceArea_combinesAreaOfAllSides_int() {
    assertEquals(96, firstCube.calculateSurfaceArea());
  }

  @Test
  public void all_ReturnsAllInstancesOfCube_true() {
    assertTrue(Cube.all().contains(firstCube));
    assertTrue(Cube.all().contains(secondCube));
  }

}
