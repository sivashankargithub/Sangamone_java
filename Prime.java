package sangamone_pack;

public class Prime {

	public static void main(String[] args) {
		int num1=43;
		//2,3
		int temp=0;
		for(int i=2;i<=num1-1;i++)
		{
			if(num1%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("Is not a prime number");
		}
		else
		{
			System.out.println("It is prime number:");
		}
		

	}

}
