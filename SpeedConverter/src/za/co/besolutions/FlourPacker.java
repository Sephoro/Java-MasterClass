package za.co.besolutions;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        return (((5*bigCount + smallCount <= goal) && (smallCount >= (goal - (5*bigCount%goal))))|| (5*bigCount%goal==0 && bigCount!=0)) && (bigCount*goal*smallCount >= 0);
    }
}
