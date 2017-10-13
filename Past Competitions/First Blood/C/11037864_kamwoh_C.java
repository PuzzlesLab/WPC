import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void python_sort_is_better(Comparable[][] shits) {
        for (int i = 0; i < shits.length; i++) {
            for (int j = 0; j < shits.length - 1; j++) {
                if (shits[j][1].compareTo(shits[j + 1][1]) > 0) {
                    Comparable[] temp = shits[j];
                    shits[j] = shits[j + 1];
                    shits[j + 1] = temp;
                }
            }
        }
    }

    public static int bubble_sort(char[] letters) {
        int count = 0;

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length - 1; j++) {
                if (letters[j] > letters[j + 1]) {
                    char temp = letters[j];
                    letters[j] = letters[j + 1];
                    letters[j + 1] = temp;
                    count += 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        String s = f.readLine();
        String[] nm_split = s.split(" ");
        int n = Integer.parseInt(nm_split[0]);
        int m = Integer.parseInt(nm_split[1]);
        Comparable[][] sorts = new Comparable[m][3];
        for (int i = 0; i < m; i++) {
            s = f.readLine();
            char[] letters = s.toCharArray();
            int sort_count = bubble_sort(letters);
            sorts[i][0] = i;
            sorts[i][1] = sort_count;
            sorts[i][2] = s;
        }
        python_sort_is_better(sorts);

        for (int row = 0; row < sorts.length; row++) {
            System.out.println(sorts[row][2]);
        }
    }
}
