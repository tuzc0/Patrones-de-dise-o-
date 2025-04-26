package composite;

// Clase de prueba
public class CafeteriaComposite {
    public static void main(String[] args) {
        Producto cafe = new Producto("Café Americano", 2.50);
        Producto dona = new Producto("Dona de chocolate", 1.20);
        Producto sandwich = new Producto("Sándwich de jamón", 3.80);

        Combo comboDesayuno = new Combo("Desayuno Feliz");
        comboDesayuno.agregar(cafe);
        comboDesayuno.agregar(sandwich);
        comboDesayuno.agregar(dona);

        comboDesayuno.mostrar();
        System.out.printf("Total: $%.2f\n", comboDesayuno.obtenerPrecio());
    }
}
