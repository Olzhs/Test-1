package Library;

public interface Administrator extends User {
    static void overdueNotification(Reader reader){
        System.out.println("Находит и уведомляет  " + reader);
    }
}
