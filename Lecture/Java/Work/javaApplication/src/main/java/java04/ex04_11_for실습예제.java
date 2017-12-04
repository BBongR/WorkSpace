package java04;

public class ex04_11_for실습예제 {
    
    public static void main(String[] args){
      int sum = 0;
        for (int i=1; i<=10; i=i+1 ){
            sum += i;
            System.out.println("1부터" +i+ " 까지의 합: " +sum );
        }
    
    }
}
