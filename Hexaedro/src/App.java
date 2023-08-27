import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int areabase;
        double area, volumen;
        System.out.println("Digite la base: ");
        areabase = lector.nextInt();
        area = 6 * Math.pow(areabase, 2);
        volumen = Math.pow(areabase, 3);
        System.out.println("Area: " + area);
        System.out.println("volumen: " + volumen);
        lector.close();

    }

}