import java.util.Scanner;

public class generator {
    public static void main(String[] args) throws Exception {
        double[] myArray;
        double[] myArrays;
        int i;
        System.out.print("Введите количество генерируемых чисел ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Вы ввели число " + x);
        myArray = new double[x];
        myArrays = new double[x];
        for (i = 0; i < x; i++) {
            myArray[i] = (Math.random() * 200) - 100;
            if (myArray[i] > 0) {
                myArrays[i] = Math.sqrt(myArray[i]);
                myArrays[i] = Math.floor(myArrays[i]);
                if ((myArrays[i] * myArrays[i]) == myArray[i]) {
                    System.out.println(myArray[i]);
                }
            } else throw new Exception("e"); // try {
//            } catch (Exception e) {
//                throw new Exception(e);

//            } finally {
//                System.out.println("в массив было сгенерировано отрицательное число в элемент " + i);

        }
    }
}

