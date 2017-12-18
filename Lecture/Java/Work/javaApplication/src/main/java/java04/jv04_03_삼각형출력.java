package java04;

public class jv04_03_삼각형출력 {
    public static void main(String[] args){
        
       //삼각형 출력
        
        for(int i=1; i<=9; i=i+1){
            for(int j=1; j<=i; j=j+1){
                System.out.print("*");
            }
            System.out.println();
        }
        
       //역삼각형 출력
        for(int i=1; i<10; i=i+1){         //행
            for(int j=1; j<10; j=j+1){     //열
                if(i > j){
                    System.out.print(" ");
                }else
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
