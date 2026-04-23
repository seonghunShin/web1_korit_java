package _12_Static;

public class Ticket {
    public static int nextNumber = 1;
    private int number;

    // new 할 때 마다 number가 1씩 증가된 상태로 생성되게
    // 생성자를 만들어 주세요.

    public Ticket() {
        this.number = nextNumber++;
    }

    public static void main(String[] args) {
        Ticket tk1 = new Ticket();
        System.out.println(tk1.number);
        Ticket tk2 = new Ticket();
        System.out.println(tk2.number);

    }
}
