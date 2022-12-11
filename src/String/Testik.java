package String;

public class Testik {
    public static void main(String[] args){
        Person p1 = new Person("Василий", "Петров",26);
        System.out.println(p1);

        Person2 p2 = new Person2();
        p2.name = "Alex";
        p2.dnaCode = 65674564;

        Person2 p3 = p2;
        p3.name =  "Alex";
        p3.dnaCode = 65674564;
        System.out.println(p2 == p3);


    }
}
