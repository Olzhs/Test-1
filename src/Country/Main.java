package Country;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] bubble = {5, 1, 3, 4, 2, 8, 0, 7, 9};

                boolean sort = false;
                int temp;

                while (!sort) {
                    sort = true;
                    for (int i = 0; i < bubble.length - 1; i++) {
                        if (bubble[i] > bubble[i + 1]) {
                            temp = bubble[i];
                            bubble[i] = bubble[i + 1];
                            bubble[i + 1] = temp;
                            sort = false;
                        }

                    }
                }
                System.out.println(Arrays.toString(bubble));

            }
        }
