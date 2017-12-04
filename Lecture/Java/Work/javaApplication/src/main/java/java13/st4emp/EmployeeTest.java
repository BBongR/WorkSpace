package java13.st4emp;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		// setter 이용
/*		Employee employeessetter = new Employee();
		
		for (int i = 0; i < 3; i = i + 1) {
			System.out.print("이름: ");
			String name = keyboard.next();
			
			System.out.print("주소: ");
			String address = keyboard.next();
			
			System.out.print("월급: ");
			int salary = keyboard.nextInt();
			
			System.out.print("주민: ");
			String rrm = keyboard.next();

			employeessetter.setName(name);
			employeessetter.setAddress(address);
			employeessetter.setSalary(salary);
			employeessetter.setRrm(rrm);
		
			System.out.println(employeessetter.toString());
		}*/
		
		// 배열 생성자 이용
		Employee[] employees = new Employee[3];
		
		for (int i = 0; i < employees.length; i = i + 1) {
			System.out.print("이름: ");
			String name = keyboard.next();
			
			System.out.print("주소: ");
			String address = keyboard.next();
			
			System.out.print("월급: ");
			int salary = keyboard.nextInt();
			
			System.out.print("주민: ");
			String rrm = keyboard.next();
			
			Employee emp1 = new Employee(name, address, salary, rrm);
			
			employees[i] = emp1;
			
//			employees[i] = new Employee(name, address, salary, rrm);
			
//			System.out.println(employees[i].toString());
		}
		
		// for-each문으로 출력
		for (Employee j : employees)
			System.out.println(j);

		keyboard.close();
	}
}
