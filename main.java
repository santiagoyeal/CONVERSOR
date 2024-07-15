import java.util.Scanner;

public class CurrencyConverter {

    // Tasas de conversión (estas tasas son ejemplos y deben actualizarse con datos reales)
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_JPY = 110.57;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Monedas");
        System.out.println("1. USD a EUR");
        System.out.println("2. USD a JPY");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();

        System.out.print("Introduce la cantidad en USD: ");
        double cantidadUSD = scanner.nextDouble();
        double cantidadConvertida = 0;

        switch (opcion) {
            case 1:
                cantidadConvertida = convertirUsdAEur(cantidadUSD);
                System.out.println(cantidadUSD + " USD son " + cantidadConvertida + " EUR");
                break;
            case 2:
                cantidadConvertida = convertirUsdAJpy(cantidadUSD);
                System.out.println(cantidadUSD + " USD son " + cantidadConvertida + " JPY");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }

    public static double convertirUsdAEur(double cantidadUSD) {
        return cantidadUSD * USD_TO_EUR;
    }

    public static double convertirUsdAJpy(double cantidadUSD) {
        return cantidadUSD * USD_TO_JPY;
    }
}
