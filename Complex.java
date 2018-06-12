import java.util.Scanner;
public class Complex {
	int real,imag;
Complex()
{
	Scanner sc=new Scanner(System.in);
	real=sc.nextInt();
	imag=sc.nextInt();
	sc.close();
}
public void Display()
{
	if(imag>0)
	System.out.print("Complex number is:"+real+"+"+imag+"i");
	else
		System.out.print("Complex number is:"+real+imag+"i");
}
public static void main(String[] args)
{
	Complex c=new Complex();
	c.Display();
}
}
