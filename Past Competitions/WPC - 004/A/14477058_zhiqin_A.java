import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        StringBuilder st = new StringBuilder();
        while(sc.hasNextLine()){
            st.append(sc.nextLine()).append('\n');
        }
        String str = st.toString();
        str = str.replace('1', 'I');
        str = str.replace('2', 'Z');
        str = str.replace('3', 'E');
        str = str.replace('4', 'A');
        str = str.replace('5', 'S');
        str = str.replace('6', 'G');
        str = str.replace('7', 'T');
        str = str.replace('8', 'B');
        str = str.replace('9', 'P');
        str = str.replace('0', 'O');
        System.out.print(str);
    }
}