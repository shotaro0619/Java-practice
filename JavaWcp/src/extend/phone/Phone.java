package extend.phone;

public interface Phone {
	// フィールドの宣言（定数）
    int MAX_NUMBER_DIGITS = 11;

    // public abstractが自動で追加される（抽象メソッド）
    void call(String number);
    
    default void powerOff() {
        System.out.println("電源を切ります。");
    }
}
