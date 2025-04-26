package template_method;

// Subclase para preparar Té
class Te extends BebidaCaliente {

    @Override
    protected void prepararIngredientePrincipal() {
        System.out.println("Remojando la bolsita de té...");
    }

    @Override
    protected void agregarExtras() {
        System.out.println("Agregando limón...");
    }
}