package Library;

public interface Reader extends User {
    static void overdueNotification(Administrator administrator){
        System.out.println("Берет и возвращает " + administrator );

    }


}
