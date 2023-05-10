package static_;

public class Student2 {
	private static int seriaNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;

	public Student2() {
		seriaNum++;
		studentID = seriaNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return seriaNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.seriaNum = serialNum;
	}
}