package sangamone_pack;
import java.util.Scanner;
public class math_table {
	public static void main(String[] args) 
	{
		int result=1;
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("-------Tables-------");
		System.out.println("Enter Table number: ");
		int n=sc.nextInt();
		for(j=1;j<=10;j++)
		{
			for(i=j;i<=j;i++)//j=1
				result=n*i;//2*1=2
			{
				System.out.println(n+" * " +j+" = "+result);
			}
		}
	}
}