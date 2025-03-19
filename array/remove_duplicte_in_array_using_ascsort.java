import java.util.*;
public class remove_duplicte_in_array_using_ascsort {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
         int a[]=new int[n];
         int t[]=new int[n];
         for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
         }   
         int k=0;
         Arrays.sort(a);
         for(int i=0;i<n-1;i++){
             
             if(a[i]!=a[i+1]){
                 t[k++]=a[i];  
             }
             t[k]=a[n-1];
            }
          
          System.out.print(Arrays.toString(t));

          sc.close();
    }
    
}
