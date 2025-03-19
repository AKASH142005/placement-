
public class automorfic1 {
    
    public static void main(String []args){
                 int N=1000;
                for(int i=0;i<N;i++){
                    if(auto(i)){
                        System.out.println(i);
                    }
                }
            }
static boolean auto(int i){
    
        
        int num=i;
        int square=i*i;
        int rem=0,count=0,sum=0;
        while(num!=0){
           num/=10;
           count++;
        }
    
    for(int j=0;j<count;j++){
           rem=square%10;
           sum=sum*10+rem;
           square/=10;      
    }
    int rev=0;
      while(sum!=0){
       rem=sum%10;
       rev=rev*10+rem;
       sum/=10;
      }
      if(rev==i)
    return true;
    else
      return false;
    }
}


