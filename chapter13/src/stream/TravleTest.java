package stream;

import java.util.ArrayList;
import java.util.List;

public class TravleTest {

	public static void main(String[] args) {
		TravleCustomer customerLee = new TravleCustomer("이순신", 40, 100);
		TravleCustomer customerKim = new TravleCustomer("김유신", 20, 100);
		TravleCustomer customerHong = new TravleCustomer("홍길동", 13, 50);
		
		List<TravleCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 : " + total + "입니다.");
		
		System.out.println(" == 20세 이상 고객 명단 정렬하여 출력 == ");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
	}

}
