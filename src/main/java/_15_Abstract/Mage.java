package _15_Abstract;

public class Mage extends Character{
    public Mage(String name) {
        super(name, 80, 30);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(targetName + "에게 마법미사일을 시전합니다.");
        System.out.println(targetName + "이 " + this.attackDMG + "의 데미지를 받았습니다.");
        target.receiveDMG(this.attackDMG);
    }
}
