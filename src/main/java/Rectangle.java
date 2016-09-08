public class Rectangle {
  int mLength;
  int mWidth;

  public Rectangle(int length, int width) {
    mLength = length;
    mWidth = width;
  }

  public boolean isSquare(){
    if (mLength == mWidth) {
      return true;
    } else {
      return false;
    }
  }
}
