/******************************************************************************

2544. Alternating Digit Sum
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
		int[] arr={5,2,1};
	    int len=arr.length-1;
	    for(int i=1;i<=len;i++){
	        if(i%2!=0){
	            arr[i]=arr[i-1]-arr[i];
	        }
	        else{
	        arr[i]=arr[i-1]+arr[i];
	        }
	    }
	    for(int nums:arr){
	        System.out.print(nums+" ");
	    }
	}
}