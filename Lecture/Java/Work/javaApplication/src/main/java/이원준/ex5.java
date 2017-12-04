package 이원준;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 크기가 3인 Employee 배열 employees를 생성한다.
        Employee[] employee = new Employee[3];

        // 3명의 사원 정보를 받아서 각각 Employee 인스턴스를 생성한 후에 배열에 추가한다.
        for (int i = 0; i < employee.length; i++) {
            System.out.print("이름: ");
            String name = sc.next();
            System.out.print("주소: ");
            String addr = sc.next();
            System.out.print("월급: ");
            int salary = sc.nextInt();
            System.out.print("주민번호: ");
            String rrn = sc.next();
            System.out.print("보너스: ");
            int bonus = sc.nextInt();
            
            employee[i] = new Manager(name, addr, salary, rrn, bonus);
        }

        // employee 배열에 저장된 모든 데이터를 출력한다. 반복문 사용.
        
        for( Employee j : employee)
            System.out.println(j.toString());
    }

}
