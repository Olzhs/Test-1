package String;

import java.util.Objects;

public class Person2 {
    String  name;
    int dnaCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
       return dnaCode == person2.dnaCode;

    }
}
