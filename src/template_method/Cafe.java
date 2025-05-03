package template_method;

import java.util.Scanner;

class Cafe extends BebidaCaliente {

    private void pausar() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    @Override
    protected void prepararIngredientePrincipal() {
        System.out.println("Clase: " + this.getClass().getSimpleName() + " [Agregando café molido al agua...]");
        pausar();
    }

    @Override
    protected void agregarExtras() {
        System.out.println("Clase: " + this.getClass().getSimpleName() + " [Agregando azúcar y leche...]");
        pausar();
    }
}