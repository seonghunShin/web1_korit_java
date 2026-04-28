package _16_Interface;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Duck duck = new Duck();
        // Animal ani = new Animal();
        // 실제 객체만 만들 수 있음. 인터페이스 안됨.

        Manager manager = new Manager();

        // duck의 현재 타입: Duck
        // makeFly는 매개변수로 Animal타입을 받음.
        // -> 자동으로 캐스팅되서 전달된다.
        manager.makeFly(duck);
        manager.makeSound(dog);
        manager.makeSound(duck);
    }
}
