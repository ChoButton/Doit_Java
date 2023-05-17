package classex;

public class ClassTest {
										   //forName() 메서드에서 발생하는 예외를 처리함,
										   //이름과 일치하는 클래스가 없는 경우
										   //ClassNotFoundException 발생
	public static void main(String[] args) throws ClassNotFoundException{
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
	}
}