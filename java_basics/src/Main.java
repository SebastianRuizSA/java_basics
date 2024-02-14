
import java.util.Scanner;
public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please insert two numbers");
        calculator sum = new calculator();
        System.out.println(sum.add(2,1));
    }
}
