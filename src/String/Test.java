package String;

public class Test {
    public static void maim(String[] args) {
        String[] names = {
                "Alex", "Drake", "Anya", "Leon", "Adam"
        };
        for (String name : names){
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
        System.out.println();
        for (String name : names) {
            if (name.indexOf("A") >= 0) {
                System.out.println(name);
            }
        }
        System.out.println();
        for (String name : names) {
            if (name.charAt(0) == 'A') {
                System.out.println(name);
            }
        }

    }
}