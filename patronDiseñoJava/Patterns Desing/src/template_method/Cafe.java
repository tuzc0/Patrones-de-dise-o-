package template_method;

// Subclase para preparar Café
class Cafe extends BebidaCaliente {

    @Override
    protected void prepararIngredientePrincipal() {
        System.out.println("Agregando café molido al agua...");
    }

    @Override
    protected void agregarExtras() {
        System.out.println("Agregando azúcar y leche...");
    }
}
