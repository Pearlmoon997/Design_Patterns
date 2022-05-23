package Decorator.Cafe;

//Beverage클래스 확장
public abstract class CondimentDecorator extends Beverage{
    //Beverage 객체 저장
    Beverage beverage;

    //모든 첨가물 데코레이터에 getDescription()메소드 구현 예정 -> 추상 메소드 선언
    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
