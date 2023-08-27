import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int radio;
        double area, volumen, numero;
        System.out.println("Digite el radio: ");
        radio = lector.nextInt();
        System.out.println("Digite el numero grados: ");
        numero = lector.nextInt();
        area = (4 * Math.PI * radio * radio * numero)/360;
        volumen = (4/3) * (Math.PI * Math.pow(radio, 3) * numero)/360;
        System.out.println("Area: " + area);
        System.out.println("volumen: " + volumen);
        lector.close();
    }

}
        
   


