import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int cantidadLados;
        double longitudLados, altura, areaLateral,areaTotal,volumen;
        double perimetroBase, areaBase, apotema;
        System.out.print("Cantidad de lados: ");
        cantidadLados = lector.nextInt();
        System.out.print("Altura: ");
        altura = lector.nextDouble();
        System.out.print("Longitud de los lados: ");
        longitudLados = lector.nextDouble();
        perimetroBase = cantidadLados * longitudLados;
        areaLateral = perimetroBase * altura;
        double alfa = (Math.PI/180) * (360/cantidadLados);
        apotema = longitudLados / (2 * Math.tan((alfa)/2));
        areaBase = (perimetroBase * apotema)/2;
        areaTotal = areaLateral + 2 * areaBase;
        volumen = areaBase * altura;
        System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
        System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        lector.close();
    }

}