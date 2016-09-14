import java.util.List;
import java.util.ArrayList;

public class Cube {
  private Rectangle mFace;
  private int mVolume;
  private static List<Cube> instances = new ArrayList<Cube>();

  public Cube(Rectangle rectangle) {
    mFace = rectangle;
    instances.add(this);
  }

  public Rectangle getFace() {
    return mFace;
  }

  public int calculateVolume() {
    int width = mFace.getWidth();
    return width * width * width;
  }

  public int calculateSurfaceArea() {
    return mFace.area() * 6;
  }

  public static List<Cube> all() {
    return instances;
  }

}
