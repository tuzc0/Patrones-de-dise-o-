package template_method;

// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        System.out.println("Preparando té:");
        BebidaCaliente te = new Te();
        te.preparar();

        System.out.println("\nPreparando café:");
        BebidaCaliente cafe = new Cafe();
        cafe.preparar();
    }
}
