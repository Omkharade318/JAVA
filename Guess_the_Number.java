import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputnumber;
    public int noOfGuesses;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
     
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void  takeuserInput(){
        System.out.println("Guess the no.: ");
        Scanner sc = new Scanner(System.in);
        inputnumber =  sc.nextInt();
    }

    boolean isCorrectNumber(){
        if(inputnumber == number){
            return true;
        }
        else if(inputnumber<number){
            System.out.println("Too low");
        }
        else if(inputnumber>number){
            System.out.println("Too High");
        }
        return false;
    }
}

public class Guess_the_Number {
    public static void main(String[] args) {
        Game g = new Game();
        // boolean b = false;
        boolean b = g.isCorrectNumber();
        while(!b){
        g.takeuserInput();
        g.isCorrectNumber();
        // System.out.println(b);

        if(b){
            System.out.println("correct number");
        }
    }
    
}
}
