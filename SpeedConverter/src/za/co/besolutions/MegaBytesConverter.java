package za.co.besolutions;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{

            final int CONSTANT = 1024;

            int mb = kiloBytes / CONSTANT;
            int kb = kiloBytes % CONSTANT;

            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");

        }
    }
}
