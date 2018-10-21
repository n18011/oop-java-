import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        // BookShelf bookShelf = new BookShelf(4);
        List<String> bookShelf = new ArrayList<>();
        //bookShelf.appendBook(new Book("80日間世界一周"));
        bookShelf.add("80日間世界一周");
        //bookShelf.appendBook(new Book("聖書"));
        bookShelf.add("聖書");
        //bookShelf.appendBook(new Book("シンデレラ"));
        bookShelf.add("シンデレラ");
        //bookShelf.appendBook(new Book("あしながおじさん"));
        bookShelf.add("あしながおじさん");
        //bookShelf.appendBook(new Book("あしながおじさん"));
        bookShelf.add("あしながおじさん");
        //Iterator it = bookShelf.iterator();
        //while(it.hasNext()) {
            //Book book = (Book)it.next();
            //System.out.println(book.getName());
        //}
        System.out.println(bookShelf);
    }
}
