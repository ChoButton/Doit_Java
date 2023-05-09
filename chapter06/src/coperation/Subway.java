package coperation;

public class Subway {
	String LineNumber;
	int PassengerCount;
	int money;
	
	public Subway(String LineNumber) {
		this.LineNumber = LineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		PassengerCount++;
	}
	
	public void showInfo() {
		System.out.println(LineNumber + "의 승객은" + PassengerCount + "명이고 수입은" + money + "입니다.");
	}
}
