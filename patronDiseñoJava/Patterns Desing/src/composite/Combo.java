package composite;

import java.util.ArrayList;
import java.util.List;

// Compuesto: Combo que puede tener otros productos
class Combo implements ItemPedido {
    private String nombre;
    private List<ItemPedido> items = new ArrayList<>();

    public Combo(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ItemPedido item) {
        items.add(item);
    }

    public void mostrar() {
        System.out.println("[Combo: " + nombre + "]");
        for (ItemPedido item : items) {
            item.mostrar();
        }
    }

    public double obtenerPrecio() {
        double total = 0;
        for (ItemPedido item : items) {
            total += item.obtenerPrecio();
        }
        return total;
    }
}

