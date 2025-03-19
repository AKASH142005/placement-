import java.util.HashMap;
import java.util.*;
public class Solution{
    public static int romanToInt(String s){
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));
            if (i < s.length() - 1 && current < romanMap.get(s.charAt(i + 1))) {
                result -= current;
        } else {
                result += current;
        }
        }
        return result;
    }
    public static void main(String[] args) {
        
         Scanner ss =new Scanner(System.in);
         String roman1 =ss.nextLine();
        System.out.println("Output : " + romanToInt(roman1));
    ss.close();}

}
