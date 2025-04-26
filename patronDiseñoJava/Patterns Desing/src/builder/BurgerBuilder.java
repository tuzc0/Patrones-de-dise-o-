package builder;

interface BurgerBuilder {
    void setBun(String bun);
    void setMeat(String meat);
    void setCheese(String cheese);
    void setVeggies(String veggies);
    void setSauce(String sauce);
    Burger build();
}
