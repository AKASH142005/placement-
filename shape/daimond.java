public class daimond {
    public static void main(String[]args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int s=i;s<n;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>0;i--){
            for(int s=0;s<n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
