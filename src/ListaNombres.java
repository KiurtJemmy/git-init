import java.util.ArrayList;

public class ListaNombres {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Kiurt");
        nombres.add("Andrea");
        nombres.add("Lucas");

        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
    }
}
