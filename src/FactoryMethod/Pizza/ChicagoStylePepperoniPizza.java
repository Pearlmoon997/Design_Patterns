package FactoryMethod.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza{

    public ChicagoStylePepperoniPizza() {
        name = "시카고 스타일 페퍼로니 피자";
        dough = "두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";

        toppings.add("모짜렐라 치즈");
        toppings.add("올리브");
        toppings.add("시금치");
        toppings.add("가지");
        toppings.add("페퍼로니");
    }

    void cut() {
        System.out.println("네모난 모양으로 자르기");
    }
}
