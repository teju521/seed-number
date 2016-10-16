import java.util.*;
class seed
{
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i,a;
		int sum=num;
		for(i=0;num!=0;i++)
		{
		
			a = num%10;
			num=num/10;
			sum=sum*a;
		}
		System.out.println("Seed number is:" + sum);
	}
}
