import java.math.BigDecimal;

public class Big {
    public static void main(String[] args){
        BigDecimal bigDecimal = new BigDecimal("0.07");
        BigDecimal bigDecimal1 = new BigDecimal("0.05");

        if(bigDecimal.compareTo(bigDecimal1) == 0){
        System.out.println(bigDecimal + " и " + bigDecimal1 + " равны ");
        return;
    }if(bigDecimal.compareTo(bigDecimal1) == 1){
            System.out.println(bigDecimal + " и " + bigDecimal1 + " не равны ");
        }else{
            System.out.println( bigDecimal + " меньше чем " + bigDecimal1);
        }
}
}
