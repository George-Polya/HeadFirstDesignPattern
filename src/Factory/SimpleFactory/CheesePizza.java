package Factory.SimpleFactory;

public class CheesePizza extends Pizza{
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Souce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
