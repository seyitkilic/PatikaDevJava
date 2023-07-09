public class Book implements Comparable<Book> {
   private String bookName;
    private int totalPage;
    private String author;
    private String publishDate;

    public Book(String bookName, int totalPage, String author, String publishDate) {
        this.bookName = bookName;
        this.totalPage = totalPage;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.bookName);
    }
}
