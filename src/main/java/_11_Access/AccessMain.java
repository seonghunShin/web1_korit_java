package _11_Access;

public class AccessMain {

    public static void main(String[] args) {

        Access ac = new Access(5, 100);

        // private로 막혀있음.
        // ac.x
        // ac.y
        int x = ac.getX(); // 간접조회
        System.out.println(x);
        ac.setX(8);
        x = ac.getX();
        System.out.println(x);

        Bottle b = new Bottle();
        b.drink(200);
        b.printCurrentWater();
        b.fill(10000);
        b.printCurrentWater();
        b.fill(500);
        b.drink(600);
        b.printCurrentWater();

    }

}
