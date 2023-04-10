package tutorialpoint;

public class Programs {
	
	private void isPrimeNumber(int num) {
	
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("Not a prime number");
				break;
			}
			if(i==(num-1))
			{
				System.out.println("It is a prime number");
				break;
			}
		} 	
	}
	
	
	private void isPalindromeString(String str) {
		String str1 = "";
		for (int j = str.length()-1; j >=0 ; j--) {
			str1 = str1 + str.charAt(j);
		}
		if(str1.equalsIgnoreCase(str))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not a palindrome");
		}
	}
	
	
	private void isPalindromeNumber(int num) {
		int temp = num; //234
		int rem = 0; //2
		int sum = 0; //432
		//num=2
		while(num>0)
		{
			rem = num % 10;
			sum = (sum*10) + rem;
			num = num / 10;
		}
		
		if(temp==sum)
		{System.out.println("Palindrome");}
	}
	
	
	private void armstrongNumber(int num) {
		
	}
	public static void main(String[] args) {
		Programs programs = new Programs();
		programs.isPrimeNumber(9);
		programs.isPalindromeString("malayalam");
		programs.isPalindromeNumber(234);
	}
}























