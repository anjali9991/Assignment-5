import java.util.Scanner;
public class Arraylargest {
public static void main(String[] args)
{
	int i,temp,large,sec_large;
	int[] arr=new int[10];
	Scanner sc=new Scanner(System.in);
	for(i=0;i<10;i++)
	{
		arr[i]=sc.nextInt();
	}
	sc.close();
	if(arr[0]>arr[1])
	{
		large=arr[0];
	sec_large=arr[1];
	}
	else
	{
		large=arr[1];
		sec_large=arr[0];
	}
	for(i=0;i<10;i++)
	{
		if(arr[i]>large)
		{
		large=arr[i];
		}
	}
	for(i=0;i<10;i++)
	{
		if(arr[i]>sec_large&&arr[i]!=large)
		{
			sec_large=arr[i];
		}
	}
	System.out.print("Second largest number is "+sec_large);
}
}
