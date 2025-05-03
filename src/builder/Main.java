package builder;

import java.util.Scanner;

public class Main {

    private static void pause() {
        System.out.println("Creando...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void main(String[] args) {

        System.out.println(Main.class.getSimpleName() + ": Se crea un director que interactue con la clase abstracta Burger.");
        pause();

        BurgerDirector director = new BurgerDirector();

        CustomBurgerBuilder customBuilder = new CustomBurgerBuilder();
        director.makeCheeseburger(customBuilder);
        System.out.println(Main.class.getSimpleName() + ": El director envia las instrucciones para crear la hamburguesa.");
        pause();

        Burger cheeseburger = customBuilder.build();
        System.out.println(Main.class.getSimpleName() + ": Se construye una hamburguesa en CustomerBurguerBuilder utilizando la interfaz BurgerBuilder y regresa la hamburguesa construida.");
        System.out.println(Main.class.getSimpleName() + ": Hamburguesa preparada: " + cheeseburger);
        pause();

        System.out.println(Main.class.getSimpleName() + ": El director envia nuevas instrucciones para crear otro tipo de hamburguesa.");
        CustomBurgerBuilder anotherBuilder = new CustomBurgerBuilder();
        anotherBuilder.setBun("Whole Grain Bun");
        anotherBuilder.setMeat("Chicken");
        anotherBuilder.setCheese("Swiss");
        anotherBuilder.setVeggies("Spinach, Onion");
        anotherBuilder.setSauce("Mustard");
        Burger customBurger = anotherBuilder.build();

        System.out.println(Main.class.getSimpleName() + ": Se construye una nueva hamburguesa usando CustomerBurgerBuilder.");
        System.out.println(Main.class.getSimpleName() + ": Otra hamburguesa personalizada: " + customBurger);
    }
}