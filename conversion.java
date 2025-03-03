public class conversion {
    public static void main(String []args){
                int n=17;
                octal(n);
                System.out.println();
                binary(n);
                System.out.println();
                hexa(n);
    }
   static void binary(int n){
    int a[]=new int [10];
    int N=n;
    int i=0;
    while(N!=0){
       a[i]=N%2;
       N/=2;
      i++;
    }
    System.out.print("binary:");
    for(int j=i-1;j>=0;j--){
      System.out.print(a[j]);
    }
  
}

 static void octal(int n){
    int a[]=new int [10];
    int N=n;
    int i=0;
    while(N!=0){
       a[i]=N%8;
       N/=8;
      i++;
    }
    System.out.print("octal:");
    for(int j=i-1;j>=0;j--){
      System.out.print(a[j]);
    }
}
static void hexa(int n){
    int a[]=new int [10];
    int N=n;
    int i=0;
    while(N!=0){
       a[i]=N%16;
       N/=16;
      i++;
    }
    System.out.print("hexa:");
    for(int j=i-1;j>=0;j--){
      System.out.print(a[j]);
    }
}
}