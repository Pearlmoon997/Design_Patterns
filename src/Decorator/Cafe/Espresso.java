package Decorator.Cafe;

public class Espresso extends Beverage{
    public Espresso() {
        //description 변수 값 설정
        description = "Espresso";
    }

    //에스프레소 가격 리턴
    public double cost(){
        return 3800;
    }
}
