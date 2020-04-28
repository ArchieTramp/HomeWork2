//
//public class Example3 {
//    public static void main(String[] args) {
//        int i;
//        System.out.print("Введите количество генерируемых чисел ");
//        Scanner scan = new Scanner(System.in);
//        int j = scan.nextInt();
//        String[] name = new String[j];
//        int[] age = new int[j];
//        String[] sex = new String[j];
//        String[][] array = new String[3][j];
//        for (i = 0; i < j; i++) {
//            int agegen = (int) (Math.random() * 100);//генератор возраста
//            age[i] = agegen;
//            array[0][i] = String.valueOf(age[i]);
//
//
//
//            int sextype = (int) (Math.random());//генератор пола
//            if (sextype == 0) {
//                sex[i] = "man";
//            } else {
//                sex[i] = "woman";
//            }
//            array[1][i] = sex[i];
//
//
//
//            final ThreadLocalRandom random = ThreadLocalRandom.current();//генератор имени
//            final int nums = random.nextInt(5, 11);
//            StringBuilder names = new StringBuilder();
//            for (int t = 0; t < nums; t++) {
//                names.append((char) random.nextInt(97, 123));
//            }
//            name[i] = names.toString();
//            array[2][i] = name[i];
//
//
//        }
//
//
//
//        }
//
//
//    }

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Example3 {

    public static void main(String[] args) {
        System.out.println("Введите количество генерируемых ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String Person[] = new String[x];
        new Example3
                (new Person[]{

                        new Person(0, 0, "name"),
                        new Person(0, 0, "name"),

                }).SortPerson();

    }

    private Person[] persons;

    public Example3(Person[] persons) {

        this.persons = persons;

    }

    public void SortPerson() {
        Arrays.sort(persons, (person1, person2) -> {
            if (person1.sex != person2.sex) {
                return
                        person1.sex == 0 ? 1 :
                                person2.sex == 0 ? -1 :
                                        person1.sex == 1 ? 1 : -1;
            } else if (person1.age != person2.age) {
                return Integer.compare(person1.age, person2.age);
            } else if (!person1.name.equals(person2.name)) {
                return -person1.name.compareTo(person2.name);
            }
            return 0;
        });

    }

    static class Person {

        int sex;
        int age;
        String name;

        public Person(int sex, int age, String name) {
            int agegen = (int) (Math.random() * 100);//генератор возраста
            age = agegen;

            final ThreadLocalRandom random = ThreadLocalRandom.current();//генератор имени
            final int nums = random.nextInt(5, 11);
            StringBuilder names = new StringBuilder();
            for (int t = 0; t < nums; t++) {
                names.append((char) random.nextInt(97, 123));
            }
            name = names.toString();

            sex = (int) (Math.random() * 2);
//            if (sextype == 0) {
//                sex = "man";
//            } else {
//                sex = "woman";

            this.sex = sex;
            this.age = age;
            this.name = name;
        }


    }

}



//enum Sex{
//
//    man, woman
//
//}