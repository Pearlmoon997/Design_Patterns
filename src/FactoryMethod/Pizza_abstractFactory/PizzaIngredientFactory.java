package FactoryMethod.Pizza_abstractFactory;

public interface PizzaIngredientFactory {

    //각 재료별 생성 메소드 정의성
    //재료별 인터페이스 생성

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();

}
