import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double  altura, areaLateral,areaTotal,volumen;
        double perimetrobase,   radio, base;
        System.out.print("digite el radio: ");
        radio = lector.nextInt();
        System.out.print("digite la altura: ");
        altura = lector.nextDouble();
        perimetrobase = 2 * Math.PI * radio;
        areaLateral = perimetrobase * altura;
        base = Math.PI * (radio * radio);
        areaTotal = areaLateral + 2;
        volumen = base * altura;
        System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
        System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        lector.close();
    }

}