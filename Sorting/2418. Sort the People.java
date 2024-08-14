public class Main
{
	public static void main(String[] args) {
	  int[] heights={180,165,170};
	  int l=0;
	  String[] names={"Mary","John","Emma"};
	   int len=heights.length-1;//2
	  int min=0;
	  for(int i=0;i<=len;i++){
	      min=i;
	      for(int j=i+1;j<=len;j++){
	          if(heights[j]>heights[min]){
	              min=j;
	          }
	      }
	      int temp=heights[l];
	      heights[l]=heights[min];
	      heights[min]=temp;
	      l++;
	  }  
	  for(int i:heights){
	      System.out.println(i);
	  }
	  for(String k:names){
	      System.out.println(k);
	  }
	}
}

//O(n2)