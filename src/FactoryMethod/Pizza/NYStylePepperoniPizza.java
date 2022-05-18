package FactoryMethod.Pizza;

public class NYStylePepperoniPizza extends Pizza{

    public NYStylePepperoniPizza() {
        name = "뉴욕 스타일 페퍼로니 피자";
        dough = "신 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("레지아나 치즈");
        toppings.add("페퍼로니");
        toppings.add("마늘");
        toppings.add("양파");
        toppings.add("버섯");
        toppings.add("후추");
    }
}
