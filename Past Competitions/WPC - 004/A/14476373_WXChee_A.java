import java.util.*;
import java.io.*;

/**
 *
 * @author thechee
 */
class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(in.readLine());
        for(int i = 0; i < times; i++){
            while(in.ready()){
                String line = in.readLine();
                String output = "";
                for(int j = 0; j < line.length(); j++){
                    char c = line.charAt(j);
                    if(c >= 48 && c <= 57){
                        //output += '~';
                        if(c == '0')
                            output += 'O';
                        else if(c == '1')
                            output += 'I';
                        else if(c == '2')
                            output += 'Z';
                        else if(c == '3')
                            output += 'E';
                        else if(c == '4')
                            output += 'A';
                        else if(c == '5')
                            output += 'S';
                        else if(c == '6')
                            output += 'G';
                        else if(c == '7')
                            output += 'T';
                        else if(c == '8')
                            output += 'B';
                        else
                            output += 'P';
                    }else{
                        output += c;
                    }
                }
                System.out.println(output);
            }
        }
    }
    
}