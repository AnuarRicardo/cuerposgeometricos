import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int altura, cantidadlados;
        double apotemapiramide, arealateral, areatotal, volumen, longitud,  apotemabase;
        double areabasemayor, areabasemenor, radiomayor, radio, perimetrobasemayor, perimetrobasemenor;
        System.out.println("Digite la altura: ");
        altura = lector.nextInt();
        System.out.println("Digite la longitud: ");
        longitud = lector.nextDouble();
        System.out.println("Digite la cantidad de lados");
        cantidadlados = lector.nextInt();
        System.out.println("digite la radio mayor: ");
        radiomayor = lector.nextDouble();
        System.out.println("digite la radio : ");
        radio = lector.nextDouble();
        double alfa = (Math.PI/180) * (360/cantidadlados);
        apotemabase = longitud / (2 * Math.tan((alfa)/2));
        apotemapiramide = Math.pow(altura, 2) + (Math.pow(apotemabase, 2));
        perimetrobasemayor = cantidadlados * longitud;
        perimetrobasemenor = 2 * Math.PI * radio;
        arealateral = (perimetrobasemayor + perimetrobasemenor)/2 * apotemapiramide;
        areabasemayor = Math.PI * Math.pow(radiomayor, 2);
        areabasemenor = Math.PI * Math.pow(radio, 2);
        areatotal = arealateral + areabasemayor + areabasemenor;
        volumen = (1/3) * altura * (areabasemayor + areabasemenor + Math.sqrt(areabasemayor * areabasemenor));
        System.out.println("Area lateral: " + arealateral + " unidades cuadradas.");
        System.out.println("Area total: " + areatotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        lector.close();
    }
}