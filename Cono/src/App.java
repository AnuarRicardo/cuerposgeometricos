import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int cantidadlados;
        double areatotal, arealateral, volumen, perimetrobase, areabase;
        double  longitud, altura, generatriz, radio;
        System.out.print("Cantidad de lados: ");
          cantidadlados = lector.nextInt();
          System.out.print("Altura: ");
          altura = lector.nextDouble();
          System.out.print("Longitud: ");
          longitud = lector.nextDouble();
          System.out.println("radio: ");
          radio = lector.nextDouble();
          perimetrobase = cantidadlados * longitud;
          generatriz = altura + radio;
          arealateral = (perimetrobase * generatriz)/2;
          areabase = Math.PI * Math.pow(radio,2);
          areatotal = arealateral + areabase;
          volumen = (areabase * altura)/3;

          System.out.println("Area lateral: " + arealateral + " unidades cuadradas.");
        System.out.println("Area total: " + areatotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        lector.close();
    }
}
