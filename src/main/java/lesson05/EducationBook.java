package lesson05;

public class EducationBook extends Book {
    private String subject;

    public EducationBook() {
    }

    public EducationBook(String title, String author,
                         int pages, long isbn,
                         String subject) {
        super(title, author, pages, isbn);
        //this.subject = subject;
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject != null)
            this.subject = subject;
        else
            this.subject = "subject";
    }

    @Override
    public String toString() {
        return "EducationBook{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
    @Override
    public void method(){
        System.out.println(" overide");
    }
}
