package lesson05;

public abstract class Book {
    private String title;
    private String author;
    private int pages;
    private long isbn;

    public Book() {
    }

    public Book(String title, String author, int pages, long isbn) {
       setTitle(title);
        //this.author = author;
        setAuthor(author);
        //this.pages = pages;
        setPages(pages);
        //this.isbn = isbn;
        setIsbn(isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null)
            this.title = title;
        else
            this.title = "title";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null)
            this.author = author;
        else
            this.author = "author";
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 1)
            this.pages = pages;
        else
            this.pages = 1;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        if (isbn > 1)
            this.isbn = isbn;
        else
            this.isbn = 1L;
    }

    @Override
    public String toString() {
        return  " title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", isbn=" + isbn
                ;
    }

    public void method(){
        System.out.println("========================");
    }
}
