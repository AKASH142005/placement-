public class automorfic {
    public static void main(String []args){
        int n=25;
        int num=n;
        int square=n*n;
        int rem=0,count=0,sum=0;
        while(num!=0){
           num/=10;
           count++;
        }
    
    for(int i=0;i<count;i++){
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
    if(rev==n){
        System.out.print("yes");
    }
    else{
    System.out.print("no");
    }
}
}
