public class twistprime1 {
    public static void main(String []arg){
        int N=100;
       for(int n=1;n<N;n++){
        if(twistedprim(n))
        {
            System.out.print(n+"  ");
        }
        else{
            
        }
       }
    }
     static boolean twistedprim(int n)
    {
        int num=n;
        int count=0,sum=0;
        while(num!=0){
            num/=10;
            count++;
         }
         num=n;
        for(int i=0;i<count;i++){
            int rem=0;
                 rem=num%10;
                 sum=sum*10+rem;
                 num/=10;    
        } 
        if(prime(sum)&&prime(num)){
          return true;
        }
        return false;
    }

static boolean prime( int n){
    int num=n;
    for(int i=2;i<num;i++){
       if(num%i==0){
          return false;
       }
    }
    return true;
    
}
}
