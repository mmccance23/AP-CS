import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args){
        int x= 5;

        //step 1: declaring array
        int[] numbers= new int[10]; //array of 10 ints
        System.out.println(Arrays.toString(numbers));
        //step 2: initialize array
        for(int i=1; i< numbers.length; i++){
            numbers[i]= i+1;
        }
        System.out.println(Arrays.toString(numbers));
        //declare and initialize an array
        int[] num={1,2,3,4,5,6,7,8,9,10};
    }
}
