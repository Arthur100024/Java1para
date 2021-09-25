import java.lang.*;
import java.lang.Math.*;
import java.util.*;
public class Ball
{
  private double x = 0.0, y = 0.0;
  private String vyvod;
  public Ball (double x1, double y1)
  {
    x = x1;
    y = y1;
  }

  public Ball ()
  {
  }

  public double getX ()
  {
    return x;
  }

  public double getY ()
  {
    return y;
  }

  public void setX (double x)
  {
    this.x = x;
  }

  public void setY (double y)
  {
    this.y = y;
  }

  public void setXY (double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public void move (double xDisp, double yDisp)
  {
    this.x = x + xDisp;
    this.y = y + yDisp;
  }

  public String toString ()
  {
    vyvod = ("Координаты мяча: " + x + " " + y);
    System.out.println (vyvod);
    return vyvod;
  }
}
