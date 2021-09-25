import java.lang.*;
public class book
{
  private String name;
  private int year;

  public book (String n, int y)
  {
    name = n;
    year = y;
  }

  public book (String n)
  {
    name = n;
    year = 0;
  }

  public book ()
  {
    name = "Harry Potter";
    year = 1997;
  }

  public void setYear (int year)
  {
    this.year = year;
  }

  public void setName (String name)
  {
    this.name = name;
  }

  public String getName (String name)
  {
    return name;
  }

  public int getYear ()
  {
    return year;
  }

  public String toString ()
  {
    return this.name + ", year " + this.year;
  }

  public void vyvod ()
  {
    System.out.println ("A book named " + name + " was writed in " + year);
  }
}
