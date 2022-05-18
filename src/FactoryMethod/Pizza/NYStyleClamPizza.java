package FactoryMethod.Pizza;

public class NYStyleClamPizza extends Pizza{

    public NYStyleClamPizza(){
        name = "뉴욕 스타일 조개 피자";
        dough = "신 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("레지아노 치즈");
        toppings.add("신선한 조개");
    }
}
