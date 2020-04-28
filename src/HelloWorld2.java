import java.util.Scanner;

public class HelloWorld2 {
    public static void main(String [] args){
        String[] array = {"Hello ","World ","! "};
        System.out.println("Хочешь исключение? пиши число больше 2 ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x > 2) throw new ArrayIndexOutOfBoundsException("задание выполнено");
        System.out.println(array[0]+array[1]+array[2]+ "повторим " + array[x]);
    }
}
