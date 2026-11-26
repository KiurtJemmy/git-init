public class Calculadora {

    // Método suma de dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga: suma de tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga: suma de dos decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma 2 enteros: " + calc.sumar(5, 3));
        System.out.println("Suma 3 enteros: " + calc.sumar(5, 3, 2));
        System.out.println("Suma decimales: " + calc.sumar(5.5, 3.2));
    }
}
