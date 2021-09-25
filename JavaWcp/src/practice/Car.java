package practice;

public class Car {
	// 燃費（Km/L）
    private double fuelCost;
    // 残量（L）
    private double fuelAmount;

    // コンストラクタを作成
    public Car(double fuelCost, double fuelAmount) {
        this.fuelCost = fuelCost;
        this.fuelAmount = fuelAmount;
    }

    // moveメソッド
    // ・"xx km 走ります"を出力
    // ・残量を計算
    public void move(int km) {
        System.out.println(km + " km 走ります");
        this.fuelAmount -= (km / fuelCost);
    }

    // fuelAmountを取得するメソッドを作成
    public double getFuelAmount() {
        return this.fuelAmount;
    }
}
