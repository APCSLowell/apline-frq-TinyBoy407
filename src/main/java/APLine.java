public class APLine
{
  /* your code here */
  private int x, y, ca;
  public APLine(int a, int b, int c){
    x = a;
    y = b;
    ca = c;
  }
  pubilic douuble getSlope(){
    return -(double)x/y;
  }
  public boolean isOnLine(int x1, int y1){
    return x*x1 + y*y1 + c ==0;
  }
}
