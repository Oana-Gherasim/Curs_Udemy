public class Exercise5 {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else System.out.println(i);
        }
    }

    public static void searchElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element " + target + " found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }

    public static int findMissingNumber(int[] array, int n) {
        int expectedSum = 0;
        for (int i = 1; i <= n; i++) {
            expectedSum += i;
        }
        int actualSum = 0;
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        return expectedSum - actualSum;
    }


    public static void main(String[] args) {
        fizzBuzz(100);

        int[] array = {5, 8, 12, 20};
        searchElement(array, 12);

        int[] array2 = {1, 2, 4, 5, 6};
        int n = 6;
        System.out.println("The missing number is: " + findMissingNumber(array2, n));
    }

}
