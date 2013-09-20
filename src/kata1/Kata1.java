package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Student Any = new Student("Pepe", new Date(91, 6, 23));
        System.out.println(Any.getName());
        System.out.println(Any.getAge());
        System.out.println(Any.getBirthdate());
    }
}
