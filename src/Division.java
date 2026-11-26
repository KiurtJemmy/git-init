import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese dividendo: ");
            int a = scanner.nextInt();
            System.out.print("Ingrese divisor: ");
            int b = scanner.nextInt();
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero no permitida.");
        } catch (Exception e) {
            System.out.println("Error de entrada.");
        } finally {
            scanner.close();
        }
    }
}
