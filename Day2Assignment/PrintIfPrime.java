package Day2Assignment;

public class PrintIfPrime {
	public static void main(String[] args) {
		int num=11,t=0;
		for(int i=2;i<num/2;i++)
		{
		if(num%i==0)
		{
			System.out.println("The Number "+ num +" is not a Prime Number");
			t=1;
			break;
		}
		}
		if(t==0)
		{
			System.out.println("The Number "+ num +" is a Prime Number");
		}
		

	}

}
