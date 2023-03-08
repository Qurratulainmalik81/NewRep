import java.util.*;

public class Rectangle{
private int length;
private int width;

public void area(int l, int w)
{
    this.length = l;
    this.width = w;
    double a = length * width;
    System.out.println("Area of the rectangle = " + a);
}
public static void main (String args[])
{
    Rectangle r1 = new Rectangle();
    r1.area(4, 3);

}

}