package za.co.besolutions;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){

        if(hourOfDay >= 0 && hourOfDay < 24){

            return isBarking && (hourOfDay < 8 || hourOfDay > 22);
        }

        return false;
    }
}
