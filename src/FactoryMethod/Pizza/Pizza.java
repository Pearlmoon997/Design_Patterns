package FactoryMethod.Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();
    void prepare() {
        System.out.println("준비중:" + name);
        System.out.println("도우 돌리는 중..");
        System.out.println("소스 뿌리는 중..");
        System.out.println("토핑 올리는 중: ");
        for(String topping : toppings) {
            System.out.println("" + topping);
        }
    }

    void bake(){
        System.out.println("175도에서 25분 굽기");
    }
    void cut(){
        System.out.println("8등분으로 자르기");
    }
    void box() {
        System.out.println("피자 포장하기");
    }
    public String getName(){
        return name;
    }
}
