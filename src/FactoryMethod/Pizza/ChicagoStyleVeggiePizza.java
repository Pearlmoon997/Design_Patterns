package FactoryMethod.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza{

    public ChicagoStyleVeggiePizza() {
        name = "시카고 딥 디쉬 Veggie 피자";
        dough = "두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";

        toppings.add("모짜렐라 치즈");
        toppings.add("올리브");
        toppings.add("시금치");
        toppings.add("가지");
    }

    void cut() {
        System.out.println("네모난 모양으로 자르기");
    }
}
