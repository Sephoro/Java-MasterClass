package za.co.besolutions;

public class JavaFavourites {

    public static boolean isPalindrome(int original){

        int reverse = 0;
        original = original < 0 ? original*-1: original;
        int temp = original;

        while(temp > 0){

            reverse = (reverse*10) + temp%10;
            temp/=10;
        }

        return reverse == original;
    }

    public static void printSquare(int size){

        for(int i = 1; i <= size; i++){

            for(int j = 1; j <= size; j++){

               if( i == j || j == size - i + 1 || i == 1 || i == (size) || j == 1 || j == size) {
                   System.out.print("*");
               }
               else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    
}
