
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            String line = input.nextLine();
            if(line.equals("Game Over"))
            {
                break;
            }
            String[] scores = line.split(" ");
            int score = 0, j = 0;
            int[] round = new int[10];
            for(int i = 0; i < round.length-1; i++)
            {
                if(scores[j].equals("X"))
                {
                    round[i] = 10;
                    if(j+2 < scores.length && scores[j+2].equals("/"))
                    {
                        round[i] += 10;
                    }
                    else if(j+1 < scores.length && scores[j+1].equals("X"))
                    {
                        round[i] += 10;
                        if(j+2 < scores.length && scores[j+2].equals("X"))
                        {
                            round[i] += 10;
                        }
                        else
                        {
                            round[i] += Integer.parseInt(scores[j+2]);
                        }
                    }
                    else if(j+1 < scores.length && !scores[j+1].equals("X"))
                    {
                        round[i] += Integer.parseInt(scores[j+1]) + Integer.parseInt(scores[j+2]);
                    }
                    j++;
                    score+=round[i];
                }
                else if(!scores[j].equals("X"))
                {
                    if(j+1 < scores.length && scores[j+1].equals("/"))
                    {
                        round[i] = 10;
                        if(j+2 < scores.length && scores[j+2].equals("X"))
                        {
                            round[i]+=10;
                        }
                        else
                        {
                            round[i] += Integer.parseInt(scores[j+2]);
                        }
                    }
                    else
                    {
                        round[i] += Integer.parseInt(scores[j]) + Integer.parseInt(scores[j+1]);
                    }
                    j+=2;
                    score += round[i];
                }
            }
            if(scores[j].equals("X"))
            {
                round[9] = 10;
                if(j+2 < scores.length && scores[j+2].equals("/"))
                {
                    round[9] += 10;
                }
                else if(j+1 < scores.length && scores[j+1].equals("X"))
                {
                    round[9] += 10;
                    if(j+2 < scores.length && scores[j+2].equals("X"))
                    {
                        round[9] += 10;
                    }
                    else
                    {
                        round[9] += Integer.parseInt(scores[j+2]);
                    }
                }
                else if(j+1 < scores.length && !scores[j+1].equals("X"))
                {
                    round[9] += Integer.parseInt(scores[j+1]) + Integer.parseInt(scores[j+2]);
                }
            }
            else if(!scores[j].equals("X"))
            {
                if(j+1 < scores.length && scores[j+1].equals("/"))
                {
                    round[9] = 10;
                    if(j+2 < scores.length && scores[j+2].equals("X"))
                    {
                        round[9]+=10;
                    }
                    else
                    {
                        round[9] += Integer.parseInt(scores[j+2]);
                    }
                }
                else
                {
                    round[9] += Integer.parseInt(scores[j]) + Integer.parseInt(scores[j+1]);
                }
            }
            score += round[9];
            System.out.println(score);
        }
    }
}
