package java04;

public class jv04_02_중첩for {
    public static void main(String[] args){
        
        /*System.out.println("**********");
          System.out.println("**********");
          System.out.println("**********");
          System.out.println("**********");
          System.out.println("**********");*/
        
        
        //for문으로 변경
        /*for(int i=1; i<=5; i=i+1)
            System.out.println("**********");*/
        
        //중첩 for문으로 변경
        for(int i=1; i<=5; i=i+1){
            for(int j=1; j<=10; j=j+1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
