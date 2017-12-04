package java04;

public class jv04_11_구구단세로출력 {
    public static void main(String[] args) {
        int r = 0;
        for (int i = 2; i <= 19; i = i + 1) { // (i,j) 이 식대로 대입함.
            
            // 줄바꿈 넣을 수 있는 곳1
            for (int j = 1; j <= 9; j = j + 1) {
                
                r = i * j;
                
                System.out.println(i + " * " + j + " = " + r);
                
                // System.out.format("%2d * %d = %d", i, j, r);
                if (j < 9) // j(뒷자리)가 9보다 작으면 ,
                    System.out.print(", ");
                else
                    System.out.print(".");
                
            }
            System.out.println(); // 줄바꿈 넣을 수 있는 곳1
        }
    }
}
