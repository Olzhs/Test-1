package DayOfWeek;

public class Diet {
    public void TeckLanch(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY -> System.out.println("Понедельник: куриная лапша");
            case TUESDAY -> System.out.println("Вторник: суп ");
            case WEDNESDAY -> System.out.println("Среда: борщ со сметаной");
            case THURSDAY -> System.out.println("Четверг: плов с овощами");
            case FRIDAY -> System.out.println("Пятница: творожок с фруктами");
            case SATURDAY -> System.out.println("Суббота: клубника со сливками");
            case SUNDAY -> System.out.println("Воскресенье: макарошки с сыром");
            default -> System.out.println("Default");
        }
    }
}