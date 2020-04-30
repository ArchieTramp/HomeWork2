import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Example3 {

    public static void main(String[] args) {
        System.out.println("Введите количество людей в массиве ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        Person[] persons = new Person[x];
        int y;
        for (y = 0; y < x; y++) {
             persons[y] = new Person(0, 0, "name");
                             }

        new Example3 (persons).sortPerson();

        System.out.println(Arrays.toString(persons));
          }








    private Person[] persons;

    public Example3(Person[] persons) {

        this.persons = persons;



    }

    public void sortPerson() {
        Arrays.sort(persons, (persons1, persons2) -> {
            if (persons1.sex != persons2.sex) {
                return
                        persons1.sex == 0 ? 1 :
                                persons2.sex == 0 ? -1 :
                                        persons1.sex == 1 ? 1 : -1;
            } else if (persons1.age != persons2.age) {
                return Integer.compare(persons1.age, persons2.age);
            } else if (!persons1.name.equals(persons2.name)) {
                return -persons1.name.compareTo(persons2.name);
            }
            return 0;
        });

    }

    static class Person {

        int sex;
        int age;
        String name;

        @Override
        public String toString() {
            return super.toString();
        }

        public Person(int sex, int age, String name) {
            age = (int) (Math.random() * 100);

            final ThreadLocalRandom random = ThreadLocalRandom.current();
            final int nums = random.nextInt(5, 11);
            StringBuilder names = new StringBuilder();
            for (int t = 0; t < nums; t++) {
                names.append((char) random.nextInt(97, 123));
            }
            name = names.toString();


            sex = (int) (Math.random() + 0.5);

            this.sex = sex;
            this.age = age;
            this.name = name;

        }


    }

}


