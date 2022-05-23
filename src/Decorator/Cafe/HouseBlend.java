package Decorator.Cafe;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }


    //하우스 블렌드 가격 리턴
    public double cost() {
        return 2500;
    }
}
