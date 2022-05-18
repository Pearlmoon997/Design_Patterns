package FactoryMethod.Pizza;

public class ChicagoStyleClamPizza extends Pizza{

    public ChicagoStyleClamPizza() {
        name = "시카고 스타일 조개 피자";
        dough = "두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";

        toppings.add("모짜렐라 치즈");
        toppings.add("신선한 조개");
    }

    void cut() {
        System.out.println("네모난 모양으로 자르기");
    }
}
