/******************************************************************************

2544. Alternating Digit Sum without Array
Easy
Topics
Companies
Hint
You are given a positive integer n. Each digit of n has a sign according to the following rules:

The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n=10,sum=0;
		String str=Integer.toString(n);
	    for(int i=0;i<str.length();i++){
	        int temp =Character.getNumericValue(str.charAt(i));
	        if(i%2!=0){
	            sum-=temp;
	        }
	        else{
	            sum+=temp;
	        }
	    }
		System.out.print(sum);
	}
}