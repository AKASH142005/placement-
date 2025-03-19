public class AddLongNumbers {
    public static void main(String[] args) {
        String num1 = "74563244771";
        String num2 = "7456321";
        String result = addLongNumbers(num1, num2);
        System.out.println("The sum is: " + result);
    }
    public static String addLongNumbers(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        StringBuilder result = new StringBuilder();
        int i=len1 - 1;
        int j=len2 - 1;
        int carry=0;
        while (i >= 0||j>=0||carry!=0) {
            int d1=i>=0?num1.charAt(i)-'0':0;  
            int d2=j>=0?num2.charAt(j)-'0':0;  
            int sum=d1+d2+carry;
            carry=sum/10;
            result.append(sum%10);
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
