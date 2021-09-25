import java.lang.*;
public class ball
{
  private String color;
  private int radius;

  public ball (String c, int r)
  {
    color = c;
    radius = r;
  }

  public ball (String c)
  {
    color = c;
    radius = 20;
  }

  public ball ()
  {
    color = "Red";
    radius = 15;
  }

  public void setRadius (int radius)
  {
    this.radius = radius;
  }

  public void setColor (String color)
  {
    this.color = color;
  }

  public String getColor (String color)
  {
    return color;
  }

  public int getRadius ()
  {
    return radius;
  }

  public String toString ()
  {
    return this.color + ", year " + this.radius;
  }

  public void vyvod ()
  {
    System.out.println ("A " + color + " ball has " + radius + " radius");
  }
}
