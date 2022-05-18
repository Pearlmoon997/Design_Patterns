package FactoryMethod.Pizza_abstractFactory;

public class NYPizzaStore extends PizzaStore{
    //뉴욕지점에서 사용 가능
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 치즈피자");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 야채피자");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 조개피자");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 페퍼로니피자");
        }
        return pizza;
    }
}
