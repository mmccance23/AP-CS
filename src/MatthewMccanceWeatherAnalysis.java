import com.sun.corba.se.spi.orbutil.fsm.Input;
//this program takes the temperatures of each day you would like to input and calculates the average and tells you how many dyas were above it
import java.util.Scanner;

public class MatthewMccanceWeatherAnalysis {
    public static void main(String args[]) {
        //step 1:make main method

        int days = day();
        int[] numbers = new int[days];
        double sum =temp(days, numbers);
        count(sum, days, numbers);
    }
    public static int day() {
        //step 2: figure out amount of days
        Scanner input = new Scanner(System.in);
        System.out.print("How many days' temperatures?");
        int days = input.nextInt();
        return days;
    }
    public static double temp(int days, int[] numbers){
        //step 3: figure out temp of each day and put in array
        Scanner input = new Scanner(System.in);
        double sum=0;
        for (int i = 1; i <= days; i++) {
            System.out.print("Day " + i + "'s high temp:");
            int a = input.nextInt();
            numbers[i - 1] = a;
            sum += a;
        }
        return sum;
    }
    public static void count(double sum, int days, int[] numbers){
        //step 4: figure out what average temp was
        int above = 0;
        double average= Math.round(sum / days*10)/10.0;
        System.out.println("average temp was: " + average);
        for (int i = 1; i <= days; i++) {
            if (average < numbers[i-1]) {
                above += 1;
            }

        }
        System.out.print(above+" days were above average");
    }
}