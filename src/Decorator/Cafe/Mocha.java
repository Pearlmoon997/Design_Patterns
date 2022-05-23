package Decorator.Cafe;

//CondimentDecorator 확장
public class Mocha extends CondimentDecorator{

    //Beverage 레퍼런스
    //음료를 저장하는 인스턴스 변수, 객체로 설정하는 생성자가 필요
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        //모카를 더한 값 리턴
        return beverage.getDescription() + ", 모카";
    }

    public double cost() {
        //모카를 추가한 가격을 리턴;
        return beverage.cost() + 300;
    }
}
