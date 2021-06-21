package za.co.besolutions;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

        double diffA = a - (int) a;
        double diffB = b - (int) b;

        System.out.println(a);
        System.out.println(b);

        System.out.println(((diffA*1)));
        System.out.println(((diffB*1)));

        return ((int)(diffA*1000)) == ((int)(diffB*1000));
    }

    public static boolean hasTeen(int a,int b,int c){

        return (a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20);
    }

}
