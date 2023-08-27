import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double radio, radiomayor, altura, area, volumen;
        System.out.println("digite el radio: ");
        radio = lector.nextDouble();
        System.out.println("digite la altura: ");
        altura = lector.nextDouble();
        System.out.println("digite el radio mayor: ");
        radiomayor = lector.nextDouble();
        area = 2 * Math.PI * radiomayor * altura;
        volumen = (Math.PI * altura) * ( altura *altura + 3 * radio * radio + 3 * radio * radio)/6;
        System.out.println("area: " + area + "unidades cubicas");
        System.out.println("volumen " + volumen + "unidades");
        lector.close();

    }

}