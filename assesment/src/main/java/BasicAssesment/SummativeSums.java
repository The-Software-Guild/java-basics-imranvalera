package main.java.BasicAssesment;


public class SummativeSums {
    private static int[] firstArray = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
    private static int[] secondArray = { 999, -60, -77, 14, 160, 301 };
    private static int[] thirdArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };

    public static void main(String[] args){
        System.out.println("The sum of the first Array is: " + addArray(firstArray));
        System.out.println("The sum of the second Array is: " + addArray(secondArray));
        System.out.println("The sum of the third Array is: " + addArray(thirdArray));
    }
    private static int addArray(int[] intArray){
//        int sum = Arrays.stream(intArray).sum(); //easiest option
        int sum = 0;
        for (int i : intArray){
            sum += i;
        }

        return sum;
    }
}
