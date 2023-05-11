package inheritance;

public class VIPCustomer extends Customer{
	private int agentID; //VIP고객 담당 상담원 아이디
	double saleRatio;    // 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
}
