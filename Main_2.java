import java.lang.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int x1 = in.nextInt ();
    int y1 = in.nextInt ();
    Ball a1 = new Ball ();
      a1.move (x1, y1);
      a1.toString ();
      in.close ();
  }
}
