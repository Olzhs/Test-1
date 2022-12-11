package Library;

public interface Supplier extends User {
    static void overdueNotification(Librarian librarian){
        System.out.println("Доставялет книги для " + librarian);
    }


}
