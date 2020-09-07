package Map_L.MapCustomizeKey_L;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Person {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class JavaMapCustomizeKey {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("小强", 78), "林若");
        System.out.println(map.get(new Person("小强", 78)));
    }
}
