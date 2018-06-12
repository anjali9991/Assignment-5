import java.util.Scanner;
public class Rectangle {
 float length,breadth,area;
 Rectangle()
 {
	 Scanner sc=new Scanner(System.in);
	 length=sc.nextFloat();
	 breadth=sc.nextFloat();
	 sc.close();
 }
 public void CalculateArea()
 {
	 area=length*breadth;
	 System.out.print("Area of rectangle is "+area);
 }
 public static void main(String[] args)
 {
	 Rectangle r=new Rectangle();
	 r.CalculateArea();
 }
}
