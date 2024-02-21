import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    //Scanner class has been defineted.
    Scanner x= new Scanner(System.in);

    //The variable data types have been defined.
    int a, b;
    double c;

    //Get values from the user.
    System.out.print("Üçgenin 1.Kenar uzunluğunu giriniz=");
    a= x.nextInt();

    System.out.print("Üçgenin 2.Kenar uzunluğunu giriniz=");
    b= x.nextInt();

    //Math class has been defined. Then, calculation of the triangle's hypotenuse has been performed.
    c= Math.sqrt((a*a)+(b*b));
    System.out.print("Hipotenüs="+ c );
    }
}