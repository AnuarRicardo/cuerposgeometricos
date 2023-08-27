import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int areabase;
        double area, volumen;
        System.out.println("Digite la base: ");
        areabase = lector.nextInt();
        area = 3 * Math.pow(areabase, 2) * Math.sqrt(25 + 10) * Math.sqrt(5);
        volumen = (1/4) * ( 15 + 7 * Math.sqrt(5)) * Math.pow(areabase, 3);
        System.out.println("Area: " + area);
        System.out.println("volumen: " + volumen);
        lector.close();

    }

}
