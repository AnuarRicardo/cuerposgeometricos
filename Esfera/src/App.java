import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double radio, area, volumen;
        System.out.println("digite el radio: ");
        radio = lector.nextDouble();
        area = 4 * Math.PI * Math.pow(radio, 2);
        volumen = (4/3) * Math.PI * Math.pow(radio, 3);

        System.out.println("area: " + area + "unidades");
        System.out.println("volumen: " + volumen + "unidades");
        lector.close();

    }
}