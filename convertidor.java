import java.util.Scanner;

public class convertidor {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        while (true) {
            System.out.println("1. Binario a Decimal");
            System.out.println("2. Decimal a Binario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = n.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número binario: ");
                    String binario = n.next();
                    int decimal = binarioADecimal(binario);
                    System.out.println("El número decimal es: " + decimal);
                    break;
                case 2:
                    System.out.print("Ingrese un número decimal: ");
                    int decimal2 = n.nextInt();
                    String binario2 = decimalABinario(decimal2);
                    System.out.println("El número binario es: " + binario2);
                    break;
                case 3:
                    System.out.println("Adiós!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }
    }

    /**
     * Convierte un número binario a decimal.
     *
     * @param binario El número binario a convertir.
     * @return El número decimal equivalente.
     */
    public static int binarioADecimal(String binario) {
        int decimal = 0;
        int base = 1;

        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }

        return decimal;
    }

    /**
     * Convierte un número decimal a binario.
     *
     * @param decimal El número decimal a convertir.
     * @return El número binario equivalente.
     */
    public static String decimalABinario(int decimal) {
        StringBuilder binario = new StringBuilder();

        while (decimal > 0) {
            binario.insert(0, decimal % 2);
            decimal /= 2;
        }

        return binario.toString();
    }
}
