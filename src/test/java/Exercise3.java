import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public void reverseWords(String text) {
        String[] splitText = text.split(" ");
        StringBuilder reversedText = new StringBuilder();

        for (int i = splitText.length - 1; i >= 0; i--) {
            reversedText.append(splitText[i]);
            if (i > 0) {
                reversedText.append(" ");
            }
        }
        System.out.println("This is the reversed sentence: " + reversedText);
    }

    public void maxValue(ArrayList<Integer> list) {
        int maxValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maxValue) {
                maxValue = list.get(i);
            }
        }
        System.out.println("The maximum value is: " + maxValue);
    }

    public void getSum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of all values: " + sum);
    }

    public static void main(String[] args) {
        Exercise3 exercise = new Exercise3();
        String sentence = "This sentence will be reversed";
        System.out.println("This is the original text: " + sentence);
        exercise.reverseWords(sentence);


        List<Integer> list = new ArrayList<>();
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);

        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(2,25);
        System.out.println(list);
        exercise.maxValue((ArrayList<Integer>) list);
        exercise.getSum((ArrayList<Integer>) list);



    }
}