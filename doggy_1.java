import java.lang.*;
public class doggy
{
  private String name;
  private int age;

  public doggy (String n, int a)
  {
    name = n;
    age = a;
  }

  public doggy (String n)
  {
    name = n;
    age = 0;
  }

  public doggy ()
  {
    name = "Pup";
    age = 0;
  }

  public void setAge (int age)
  {
    this.age = age;
  }

  public void setName (String name)
  {
    this.name = name;
  }

  public String getName (String name)
  {
    return name;
  }

  public int getAge ()
  {
    return age;
  }

  public String toString ()
  {
    return this.name + ", age " + this.age;
  }

  public void vyvod ()
  {
    System.out.println ("A dog named " + name + " is " + age + " years old");
  }
}
