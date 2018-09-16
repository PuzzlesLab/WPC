import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> plurals = new HashMap<>();
        int l = s.nextInt(), n = s.nextInt();
        while(l-- > 0) {
            plurals.put(s.next(), s.next());
        }
        while(n-- > 0) {
            String tmp = s.next();
            if(plurals.containsKey(tmp)) {
                System.out.println(plurals.get(tmp));
            }
            else {
                System.out.println(toPlural(tmp));
            }
        }
    }
    
    public static String toPlural(String word) {
        int last = word.length() - 1;
        char[] consonants = {'a', 'e', 'i', 'o', 'u'};
        String plural = "";
        switch(word.charAt(last)) {
            case 'o':
            case 's':
            case 'x':
                plural += word + "es";
                break;
            case 'h':
                if(word.charAt(last - 1) == 'c' || word.charAt(last - 1) == 's') {
                    plural += word + "es";
                    break;
                }
            default:
                if(word.charAt(last) == 'y' && isConsonant(word.charAt(last - 1))){
                    plural += word.substring(0, last) + "ies";
                }
                else {
                    plural += word + "s";
                }
        }
        return plural;
    }
    
    public static boolean isConsonant(char c) {
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }
}
