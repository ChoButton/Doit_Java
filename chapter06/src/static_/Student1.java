package static_;

public class Student1 {
	public static int seriaNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;

	public Student1() {
		seriaNum++;
		studentID = seriaNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}