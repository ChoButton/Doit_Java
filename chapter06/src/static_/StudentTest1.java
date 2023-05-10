package static_;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.seriaNum);
		studentLee.seriaNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentLee.seriaNum);
		System.out.println(studentSon.seriaNum);
		
	}

}
