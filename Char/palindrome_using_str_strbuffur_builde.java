public class palindrome_using_str_strbuffur_builder {
    public static void main(String []args){
        String a="aag";
        no_buildin_inStr(a);
       Strgbuild(a);
       strbuffer(a);
    }
static void no_buildin_inStr(String a){
    int n=a.length();
    String s=new String();
     for(int i=n-1;i>=0;i--){
       s+=a.charAt(i);
     }
if(s.equals(a)){
    System.out.println("palindrome");
 }
 else
 System.out.println("not");
}
static void Strgbuild(String a){
        String rev=new StringBuilder(a).reverse().toString();
        if(rev.equals(a)){
            System.out.println("palindrome");
         }
         else
         System.out.println("not");
}
static void strbuffer(String a){
    String rev=new StringBuffer(a).reverse().toString();
    if(rev.equals(a)){
        System.out.println("palindrome");
     }
     else
     System.out.println("not");
}
}
