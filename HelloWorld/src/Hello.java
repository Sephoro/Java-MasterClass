import java.util.ArrayList;

public class Hello {

    public static double getFinalScore(double bonus,double score){
        return bonus + score;
    }

    public static void displayHighSCore(String name, int score){
        System.out.println("Congrats " + name + " you managed to get " + score + " points");
    }

    public  static  int getPosition(int score){

        if(score >= 1000){
            return 1;
        }
        else if(score >= 500){
            return 2;
        }
        else if(score >= 100){
            return 3;
        }
        else {
            return 4;
        }
    }
    public static void main(String[] args){

        int[] scores = new int[4];
        scores[0] = 1500;
        scores[1] = 900;
        scores[2] = 400;
        scores[3] = 50;

        for(int i = 0; i < scores.length; i++){
            displayHighSCore("Elias", scores[i]);
            System.out.println(getPosition(scores[i]));
        }
    }
}
