import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new scanner(System.in);
        System.out.print("Enter Real and Imaginary numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.print("Enter real and imaginary");
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.println("Sum=" + (a+c) +"+" + (b+d) +"i");
    }   
}
