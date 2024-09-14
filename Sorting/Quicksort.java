
public class Main
{  
    public static void Quicksort(int[] num,int l,int h){
       if(l<h){
           int pi=partion(num,l,h);
           Quicksort(num,l,pi-1);
           Quicksort(num,pi+1,h);
       } 
    }
    public static int partion(int[] num,int l,int h){
        int piv=num[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(num[j]<piv){
                i++;
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
                int temp=num[i+1];
                num[i+1]=piv;
                num[h]=temp;
                return i+1;
    }
	public static void main(String[] args) {
      int[] num={5,1,4,2,3,6,4,1,7,10,9};
      int l=0,h=num.length-1;
      Quicksort(num,l,h);
      
      for(int i:num){
          System.out.println(i);
      }
	}
}