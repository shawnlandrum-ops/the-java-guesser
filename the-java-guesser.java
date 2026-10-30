import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int cpuNum, guessNum, cpuGuessNum;
        boolean progActive=true;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        
        while(progActive){
            System.out.println("0) Exit\n1) human guesser\n2) computer guesser");
            
            //Scanner input = new Scanner(System.in);
            //System.out.println();

            int select =input.nextInt();
            
            if (select==1){
                cpuNum= random.nextInt(101);
                boolean correct=false;
                while(!correct){
                    System.out.println("Please guess a number between 1 and 100");
                    guessNum = input.nextInt();
                    if (guessNum<cpuNum){
                        System.out.println("too low");
                        
                    } else if (guessNum>cpuNum){
                        System.out.println("too high");
                        
                    } else {
                        System.out.println("correct!");
                        correct=true;
                    }
                }
            } else if (select==2){
                int maximum=100;
                cpuGuessNum= 50;
                boolean correct=false;
                String response;
                while(!correct){
                    System.out.println("My guess is: " + cpuGuessNum+"\nh) too high | l) too low | c) correct");
                    //System.out.println("h) too high | l) too low | c) correct");
                    response=input.nextLine();
                    if (response.equals("c")){
                        correct=true;
                        
                    } else if(response.equals("h")){
                        cpuGuessNum/=2;
                        
                        
                    } else if(response.equals("l")){
                        cpuGuessNum=cpuGuessNum/2+cpuGuessNum;
                    }
                }
                
            } else if (select==0){
                break;
            }
            //menu();
        }
