import java.util.Arrays;

public class Exercise2 {

    public void displayArray(int[] array){
        System.out.println("Array: " + Arrays.toString(array));
    }

    public void displaySortArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Array sorted ascending: " + Arrays.toString(array));
    }

    public void reversedArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j] = array[i];
            j++;
        }
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }

    public void getMinAndMax(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }

    public void sumAndAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    public void searchElement(int[] array, int target) {
        int index = Arrays.binarySearch(array, target);
        if (index >= 0) {
            System.out.println("Element " + target + "found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }


    public static void main(String[] args) {
        Exercise2 exercise = new Exercise2();
        int[] numbers = {12, 5, 4, 56, 8, 36, 10, 22, 25, 78};

        //Print the elements of the array.
        exercise.displayArray(numbers);

        //Sort array
        exercise.displaySortArray(numbers);

        //Reverse the elements of the array.
        exercise.reversedArray(numbers);

        //Find and print the maximum and minimum elements in the array.
        exercise.getMinAndMax(numbers);

        //Calculate and print the sum and average of the elements in the array.
        exercise.sumAndAverage(numbers);

        //Search for a specific element in the array and print its index.
        exercise.searchElement(numbers, 25);

    }
}

