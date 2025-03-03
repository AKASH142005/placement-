
public class circularprime {
    public static void main(String[]args){
        int n=41;
         
         if(cp(n)){
            System.out.println("circularprime");
         }
         else
         {
            System.out.println("not");
         }
    }
    static boolean cp(int n){
        int num=n,count=0,sum=1,ss=0;
        while(num!=0){
            num/=10;
            count++;
            sum*=10;
         }
         sum/=10;
         num=n;
         for(int i=0;i<count;i++){
            int rem=0;
                 rem=num%10;
                 num/=10;
                 num=sum*rem+num;
                 if(prime(num)){
                    ss++;
                 }
         }
        if(ss==count)
        return true;
        else
        return false;
    }
    static boolean prime( int num){
          for(int i=2;i<num;i++){
             if(num%i==0){
                return false;
             }
          }
          return true;
    }
    
}
