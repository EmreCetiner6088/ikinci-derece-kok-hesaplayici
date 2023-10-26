import java.util.Scanner;

public class Process {
    // ax^2+bx+c

    Scanner scanner = new Scanner(System.in);
    public void Calculate() {
        System.out.println("ax^2+bx+c denklemindeki a'nın kaç olsun ?");
        double a = scanner.nextDouble();
        System.out.println("Denklemdeki b'nin değeri kaç olsun ?");
        double b = scanner.nextDouble();
        System.out.println("Denklemdeki c'nin değeri kaç olsun ?");
        double c = scanner.nextDouble();
        //Math sınıfındaki static metotlar sayesinde class ismi ile de çağırabiliyoruz
        double delta = (b * b) - (4 * a * c);
        double root1 = ((-b + Math.sqrt(delta)) / 2 * a);
        double root2 = ((-b - Math.sqrt(delta)) / 2 * a);

        System.out.println("Denklemin 1.kökü : " + root1);
        System.out.println("Denklemin 2.kökü : " + root2);
    }
}
