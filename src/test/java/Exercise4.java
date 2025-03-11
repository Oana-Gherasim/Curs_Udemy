import java.util.HashSet;
import java.util.TreeSet;

public class Exercise4 {

        public static void main(String[] args) {
            HashSet<String> studentHS = new HashSet<>();
            TreeSet<String> studentTS = new TreeSet<>();

            studentHS.add("Maria A");
            studentHS.add("George B");
            studentHS.add("Clara G");
            studentHS.add("Paul G");
            studentHS.add("Vasile T");

            studentTS.addAll(studentHS);

            studentHS.remove("Vasile T");

            boolean containsName = studentHS.contains("Paul G");
            System.out.println("Does the collection contain Paul G? " + containsName);

            System.out.println("Names in the order they were added:");
            for (String name : studentHS) {
                System.out.println(name);
            }

            System.out.println("Names in alphabetical order:");
            for (String name : studentTS) {
                System.out.println(name);
            }
        }
    }

