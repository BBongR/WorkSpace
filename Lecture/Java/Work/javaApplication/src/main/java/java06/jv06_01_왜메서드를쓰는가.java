package java06;

public class jv06_01_왜메서드를쓰는가 {
    public static void main(String[] args){
     int i;   
     int sum=0;
     int sum2=0;
     int sum3=0;
        
        for ( i = 1; i <= 10; i = i + 1) {
          sum += i;
                             
        }
        for (i = 1; i<= 100; i = i +1){
            sum2 += i; 
        }
        for (i=100; i<=sum2; i=i+1){
          sum3 += i;  
        }
    
        System.out.println("" +sum);
        System.out.println("" + sum2);
        System.out.print(""+sum3);
  
    }
}
