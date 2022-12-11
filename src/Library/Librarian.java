package Library;

public interface Librarian extends User {
    static void overdueNotification(Supplier supplier){
        System.out.println("Берет и возвращает " +  supplier );
    }
}
