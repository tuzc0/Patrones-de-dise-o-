package composite;

import java.util.Scanner;

public class CafeteriaComposite {

    private static void pausar() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo de patrón Composite en una cafetería:");
        System.out.println("Creando productos y combos...");
        pausar();

        Producto cafe = new Producto("Café Americano", 2.50);
        System.out.println("Clase: " + cafe.getClass().getSimpleName() + " [Se creo un cafe americano]");

        Producto dona = new Producto("Dona de chocolate", 1.20);
        System.out.println("Clase: " + dona.getClass().getSimpleName() + " [Se creo una dona]");

        Producto sandwich = new Producto("Sándwich de jamón", 3.80);
        System.out.println("Clase: " + sandwich.getClass().getSimpleName() + " [Se creo un sandwich]");
        pausar();

        Combo comboDesayuno = new Combo("Desayuno Feliz");
        System.out.println("Clase: " + comboDesayuno.getClass().getSimpleName() + " [Se creo un combo de desayuno]");
        pausar();

        comboDesayuno.agregar(cafe);
        comboDesayuno.agregar(sandwich);
        comboDesayuno.agregar(dona);
        System.out.println("Clase: " + comboDesayuno.getClass().getSimpleName() + " [Se agregan los productos al combo]");
        pausar();

        comboDesayuno.mostrar();
        System.out.printf("Total: $%.2f\n", comboDesayuno.obtenerPrecio());
    }
}