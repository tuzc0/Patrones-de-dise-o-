package template_method;

import java.util.Scanner;

class Te extends BebidaCaliente {

    private void pausar() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    @Override
    protected void prepararIngredientePrincipal() {
        System.out.println("Clase: " + this.getClass().getSimpleName() + " [Remojando la bolsita de té...]");
        pausar();
    }

    @Override
    protected void agregarExtras() {
        System.out.println("Clase: " + this.getClass().getSimpleName() + " [Agregando limón...]");
        pausar();
    }
}