import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double radio, radiomayor, altura, volumen, generatriz, arealateral;
        double areabasemayor, areabasemenor, areatotal;
        System.out.println("digite el radio: ");
        radio = lector.nextDouble();
        System.out.println("digite la altura: ");
        altura = lector.nextDouble();
        System.out.println("digite el radiomayor: ");
        radiomayor = lector.nextDouble();
        generatriz = Math.pow(altura,2) * Math.pow(radio, 2);
        arealateral = Math.PI * generatriz * (radiomayor + radio);
        areabasemayor = Math.PI * Math.pow(radiomayor, 2);
        areabasemenor = Math.PI * Math.pow(radio, 2);
        areatotal = arealateral + areabasemayor + areabasemenor;
        volumen = (1/3) * Math.PI * altura * (Math.pow(radiomayor, 2) + Math.pow(radio, 2)  + radiomayor * radio);
        System.out.println("Area lateral: " + arealateral + " unidades cuadradas.");
        System.out.println("Area total: " + areatotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        lector.close();
    }
}