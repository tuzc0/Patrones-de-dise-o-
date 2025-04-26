package builder;

class BurgerDirector {
    public void makeCheeseburger(BurgerBuilder builder) {
        builder.setBun("Sesame Bun");
        builder.setMeat("Beef");
        builder.setCheese("Cheddar");
        builder.setVeggies("Lettuce, Tomato");
        builder.setSauce("Ketchup");
    }
}
