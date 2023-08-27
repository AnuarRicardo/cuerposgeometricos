import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
      int cantidadlados;
      double areatotal, arealateral, volumen, perimetrobase, areabase;
      double apotemaB, apotemaP, longitud, altura;
      System.out.print("Cantidad de lados: ");
        cantidadlados = lector.nextInt();
        System.out.print("Altura: ");
        altura = lector.nextDouble();
        System.out.print("Longitud de los lados: ");
        longitud = lector.nextDouble();
        perimetrobase = cantidadlados * altura;
        double alfa = (Math.PI/180) * (360/cantidadlados);
        apotemaB = longitud / (2 * Math.tan((alfa)/2));
        apotemaP = altura + apotemaB;
        arealateral = perimetrobase * apotemaP;
        areabase = (perimetrobase * apotemaB)/2;
        areatotal = arealateral + areabase;
        volumen = (areabase * altura)/3;

        System.out.println("Area lateral: " + arealateral + " unidades cuadradas.");
        System.out.println("Area total: " + areatotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        lector.close();
    }
}
