package _11_Access;

public class Bottle {
    private int currentWater; // 현재 물의 양 (ml)
    private int max = 1000; // 용량(1000ml)

    public Bottle() {
        this.currentWater = 100; // 초기값
    }

    // fill(int amount)
    // currentWater를 amount만큼 증가시키는 메서드
    // amount 음수면 x, max를 넘어갈 수 없음.

    // drink(int amount)
    // currentWater를 amount만큼 감소시키는 메서드
    // amount 음수면 x, currentWater는 음수가 될 수 없음.

    private boolean isNegative(int amount) {
        if (amount < 0) {
            System.out.println("물은 음수일 수 없습니다.");
            return true;
        }
        return false;
    }

    public void fill(int amount) {
        if (this.isNegative(amount)) return;
        if (currentWater + amount > max) {
            System.out.println("물병의 최대값은 1리터 입니다.\n1리터를 넘길 수 없습니다.");
            return;
        } else {
            this.currentWater += amount;
            System.out.println("물이 " + amount + "ml만큼 추가되었습니다.");
            return;
        }
    }

    public void drink(int amount) {
        if(this.isNegative(amount)) return;
        if (amount > this.currentWater) {
            System.out.println("현재 물의 양보다 많이 마실 수 없습니다.");
            return;
        } else {
            this.currentWater -= amount;
            System.out.println(amount + "ml만큼 물을 마셨습니다.");
            return;
        }
    }

    public void printCurrentWater() {
        System.out.println("현재 물의 양: " + this.currentWater);
    }

    public int getCurrentWater() {
        return currentWater;
    }

    public void setCurrentWater(int currentWater) {
        this.currentWater = currentWater;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
