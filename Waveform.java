import java.util.Scanner;

public class Waveform {
	public static void main(String[] args)
	{
		int[]arr=new int[10];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<10;i+=2)
		{
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for(i=0;i<10;i++)
			System.out.print(arr[i]+" ");
	}
}
