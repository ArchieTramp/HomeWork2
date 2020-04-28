import java.util.Scanner;

class Helloworld1 {
    public static void main(String [] args){
        String a = "Hello ";
        String b = "world ";
        System.out.println("Хочешь исключение? пиши положительное число");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (0 < x) {
            throw new NullPointerException("задание выполнено");
        }
        System.out.println(a+b+x);
    }
}