import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double longitud, altura, profundidad, area, volumen, diagonal;
        System.out.println("Digite la altura: ");
        altura = lector.nextDouble();
        System.out.println("Digite la longitud: ");
        longitud = lector.nextDouble();
        System.out.println("Digite la profundidad: ");
        profundidad = lector.nextDouble();
        area = 2 * (altura * longitud + altura * profundidad + longitud * profundidad);
        diagonal = Math.sqrt(altura * altura + longitud * longitud + profundidad * profundidad);
        volumen = altura * longitud * profundidad;
        System.out.println("Area: " + area );
        System.out.println("Volumen: " + volumen );
        System.out.println("Diagonal: " + diagonal);
        lector.close();

    }

}
