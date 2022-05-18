package FactoryMethod.Pizza_abstractFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    //각 재료의 클래스 생성
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        //야채 배열 리턴
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clam createClam() {
        return new FreshClam();
    }
}
