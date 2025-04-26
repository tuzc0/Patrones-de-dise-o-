package composite;

// Hoja: Producto individual
class Producto implements ItemPedido {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("- " + nombre + ": $" + String.format("%.2f", precio));
    }

    public double obtenerPrecio() {
        return precio;
    }
}