package exception;

public class IDFormatTset {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatExaception{
		if(userID == null) {
			throw new IDFormatExaception("아이디는 null일 수 없습니다.");
		}else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatExaception("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDFormatTset test = new IDFormatTset();
		
		String userID = null;
		try {
			test.setUserID(userID);
		}catch (IDFormatExaception e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		}catch(IDFormatExaception e) {
			System.out.println(e.getMessage());
		}
	}
}