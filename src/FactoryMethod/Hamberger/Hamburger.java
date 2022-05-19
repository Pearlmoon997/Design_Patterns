package FactoryMethod.Hamberger;

import java.util.ArrayList;

public abstract class Hamburger {
    String name;
    String bun;
    ArrayList<String> sauces = new ArrayList<String>();
    ArrayList<String> patties = new ArrayList<String>();

    void bake() {
        System.out.println("번 : " + bun);
    }
    void saucing() {
        System.out.print("소스 : ");
        for (String sauce : sauces) {
            System.out.print(sauce + " ");
        }
    }
    void stack() {
        System.out.print("\n패티 : ");
        for(String patty : patties) {
            System.out.print(patty + " ");
        }
    }

    public String getName() {
        return name;
    }

//    public String toString() {
//        StringBuffer display = new StringBuffer();
//        display.append("---" + name + "---\n");
//        display.append(bun + "\n");
//        for (String sauce : sauces) {
//            display.append(sauce + "\n");
//        }
//        for (String patty : patties) {
//            display.append(patty + "\n");
//        }
//        return display.toString();
//    }
}
