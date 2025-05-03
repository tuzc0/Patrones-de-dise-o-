package template_method;

abstract class BebidaCaliente {

    // Método plantilla (final para que no se pueda modificar en subclases)
    public final void preparar() {
        hervirAgua();
        prepararIngredientePrincipal();
        servirEnTaza();
        agregarExtras();
    }

    // Pasos comunes
    private void hervirAgua() {
        System.out.println("Clase: " + this.getClass().getSimpleName() + " [Hirviendo agua...]");
    }

    private void servirEnTaza() {
        System.out.println("Clase: " + this.getClass().getSimpleName() + " [Sirviendo en la taza...]");
    }

    // Pasos que serán definidos por las subclases
    protected abstract void prepararIngredientePrincipal();
    protected abstract void agregarExtras();
}
