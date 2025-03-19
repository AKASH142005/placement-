
public class harshadnum
{
	public static void main(String[] args) {
	     int x=2500;
         for(int n=500;n<x;n++){
             if(harsh(n)){
              System.out.print(n+" ");
             }
         }
    }
static boolean harsh(int n){
	     int num=n;
	     int sum=0;
	 while(num!=0){
	        int rem=num%10;
	        sum+=rem;
	        num/=10;
	 }

	    if(n%sum==0){
	        return true;
		}
	       return false;
}
}
