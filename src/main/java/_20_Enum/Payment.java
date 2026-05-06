package _20_Enum;
/*
    여러개의 결제수단들을 enum으로 구현해 보세요
    필드: String korName, int feeRate
    CASH - 현금 0
    CARD - 카드 2
    MOBILE - 핸드폰결제 5
*/

public enum Payment {
    CASH(0, "현금"),
    CARD(2, "카드"),
    MOBILE(5, "핸드폰결제")
    ;

    private int feeRate;
    private String korName;

    Payment(int feeRate, String korName) {
        this.feeRate = feeRate;
        this.korName = korName;
    }

    public double getCalcedFee(double price) {
        double fee = price * feeRate / 100.0;
        return fee;
    }

}