import java.util.*;
public class IdentifyCharNum {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String s = ss.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
         if (Character.isDigit(ch)) {
            int count = Character.getNumericValue(c);
            if (r.length() > 0) {
             char last = r.charAt(r.length() - 1);
                  for (int j = 0; j < count - 1; j++) {
                 r.append(last);
                    }
                }
            } 
        else {
            r.append(c);
            }
        }

        System.out.println(r.toString());
        ss.close();
    }
}
