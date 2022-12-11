package Library;

public class Main implements User {
    public static void main(String[] args){
        User user= new User() {
            @Override
            public String toString() {
                return super.toString();
            }
        };


    }
}
