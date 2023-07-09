import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", 500, "George Orwell", "1949");
        Book book2 = new Book("Kedi Beşiği", 300, "Kurt  Vonnegut", "1963");
        Book book3 = new Book("Ender'in oyunu", 200, "Orson Scott Card", "1985");
        Book book4 = new Book("Cesur Yeni Dünya", 600, "Aldous Huxley", "1932");
        Book book5 = new Book("Algernon'a Çiçekler", 100, "Daniel Keys", "1959");

        TreeSet<Book> bookSet = new TreeSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        System.out.println(" --- Ada Göre Sıralama ---");
        for (Book book : bookSet) {
            System.out.println(book.getBookName() + " - " + book.getTotalPage());
        }

        TreeSet<Book> bookSet2 = new TreeSet<>(Comparator.comparingInt(Book::getTotalPage));
        bookSet2.addAll(bookSet);

        System.out.println("\n --- Sayfa Sayısına Göre Sıralama ---");
        for (Book book :
                bookSet2) {
            System.out.println(book.getBookName() + " - " + book.getTotalPage());
        }
    }
}