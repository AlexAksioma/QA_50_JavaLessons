package lesson05;

public class BookMain {
    public static void main(String[] args) {
        //Book book1 = new Book();  wrong
        EducationBook educationBook1 =
                new EducationBook("Azbuka", "People", 33, 12345L, "language");
        System.out.println(educationBook1.toString());
        FictionBook fictionBook1 = new FictionBook("Vii", "Gogol", 300, 987654L, "horror");
        System.out.println(fictionBook1);
        educationBook1.method();
    }
}
