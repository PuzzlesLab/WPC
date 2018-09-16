import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        HashMap<Character, Integer> press = new HashMap<>();
        press.put(' ', 1);
        int p = 1;
        for(char c = 'a'; c <= 'z'; c++) {
            if(p > 3 && c != 's' && c != 'z') {
                p = 1;
            }
            press.put(c, p);
            p++;
        }
        int z = 1;
        while(z <= n) {
            String text = s.nextLine();
            int l = text.length(), total = 0;
            for(int i = 0; i < l; i++) {
                total += press.get(text.charAt(i));
            }
            System.out.println("Case #" + z + ": " + total);
            z++;
        }
    }

}
