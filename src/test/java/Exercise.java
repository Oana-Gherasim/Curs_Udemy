public class Exercise {
    private String title;
    private String author;
    private static int totalBooks = 0;

    public Exercise(String title, String author) {
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        Exercise book1 = new Exercise("Conni", "Eva Wenzel-Bürger");
        Exercise book2 = new Exercise("Heidi", "Johanna Spyri");
        Exercise book3 = new Exercise("Gone with the wind", "Margaret Mitchell");

        System.out.println("Total books created: " + Exercise.getTotalBooks());
        System.out.println(book1.getTitle() + " by " + book1.getAuthor());
        System.out.println(book2.getTitle() + " by " + book2.getAuthor());
        System.out.println(book3.getTitle() + " by " + book3.getAuthor());
    }


}

