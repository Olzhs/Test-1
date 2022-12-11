import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args){
        Seasons[] seasons = Seasons.values();
        System.out.println(Arrays.toString(seasons));

        System.out.println();

        for(Seasons seasons2 : Seasons.values()){
           System.out.println(seasons2);
       }
}
}
