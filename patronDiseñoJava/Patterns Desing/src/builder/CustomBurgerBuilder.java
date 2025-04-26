package builder;

class CustomBurgerBuilder implements BurgerBuilder {
    private Burger burger = new Burger();

    public void setBun(String bun) { burger.bun = bun; }
    public void setMeat(String meat) { burger.meat = meat; }
    public void setCheese(String cheese) { burger.cheese = cheese; }
    public void setVeggies(String veggies) { burger.veggies = veggies; }
    public void setSauce(String sauce) { burger.sauce = sauce; }

    public Burger build() {
        return burger;
    }
}
