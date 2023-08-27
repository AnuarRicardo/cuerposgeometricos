import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double  radiomayor, altura, area, volumen;
        System.out.println("digite la altura: ");
        altura = lector.nextDouble();
        System.out.println("digite el radiomayor: ");
        radiomayor = lector.nextDouble();
        area = 2 * Math.PI * radiomayor * altura;
        volumen = (Math.PI * Math.pow(altura, 2)) * (3 * radiomayor - altura)/3;
        System.out.println("area: " + area + "unidades cubicas");
        System.out.println("volumen " + volumen + "unidades");
        lector.close();
    }
}