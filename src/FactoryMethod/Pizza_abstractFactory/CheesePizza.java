package FactoryMethod.Pizza_abstractFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    //피자의 재료를 제공하는 팩토리
    //팩토리를 전달받고 인스턴스 변수에 저장
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("준비 중: " + name);
        //재사용 가능한 클래스
        //팩토리의 메소드를 호출해서 사용
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
