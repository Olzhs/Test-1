import jdk.swing.interop.SwingInterOpUtils;

public class Test {
    public static void main(String[] args){
        Seasons seasons =Seasons.AUTUMN;
        if(seasons ==Seasons.SPRING ){
            System.out.println("Cool " + Seasons.SPRING);
        }else {
            System.out.println("Error");
        }
    }
}
