import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        School[] schools = {
                new School("Манас", 500, "English"),
                new School("СШ №6", 700, "Math"),
                new School("CШ №2", 500, "ACHYD")
        };
        Car[] cars = {
                new Car("BMW", "Black", 2002),
                new Car("Sonata", "With", 2002),
                new Car("Volga", "Black", 1995)
        };
        University[] universities = {
                new University("KNU", 4000, "History"),
                new University("BGU", 3800, "English"),
                new University("National University", 6000, "History")
        };
        Person[] people = {
                new Person("Amir", "Altymyshev", 18),
                new Person("Aibek", "Duisho uulu", 18),
                new Person("Baiel", "Altymyshev", 18),
        };


        System.out.println("\n" + Arrays.toString(schools));
        System.out.println("\n" + Arrays.toString(cars));
        System.out.println("\n" + Arrays.toString(universities));
        System.out.println("\n" + Arrays.toString(people));

    }
}