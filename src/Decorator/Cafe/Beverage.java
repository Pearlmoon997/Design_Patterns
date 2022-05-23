package Decorator.Cafe;

//추상 클래스
public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    String description = "제목 없음";

    //getDescription 구현
    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    //cost()는 서브클래스에서 구현해야 함
    public abstract double cost();
}
