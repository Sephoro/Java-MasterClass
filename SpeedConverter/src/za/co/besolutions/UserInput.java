package za.co.besolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    public static double getUserInput(int count){

        Scanner scanner = new Scanner(System.in);

         System.out.println("Please enter number #" + count + ":");

         if(scanner.hasNextInt()){
             return scanner.nextDouble();
         }  else{
             return 0.5;
         }
    }

    public static int sumTenNumbers(){

        int count = 1;
        int sum = 0;

        while(count <= 10){

            double i = getUserInput(count);

            if(!(i==0.5)){
                sum += (int) i;
                count++;
            }

        }
        return sum;
    }

    public static ArrayList<Integer> getMinMax(){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int input;

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Enter next number: ");

            if(scanner.hasNextInt()){

                input = scanner.nextInt();

                if(input < min){
                    min = input;
                }
                if(input > max){
                    max = input;
                }

            }
            else{
                break;

            }
        }

        scanner.close();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(min);
        arrayList.add(max);

        return arrayList;
    }

    public static void inputThenPrintSumAndAverage(){

        int sum = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){

            if(scanner.hasNextInt()){
                sum += scanner.nextInt();
                counter++;
            }
            else{
                break;
            }


            // scanner.nextLine();
        }
        scanner.close();

        System.out.println("SUM = " + sum + " AVG = " + ((double)sum/counter));

    }

}
