package java07;

import java.util.Scanner;

public class ex07_02_inputVal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("입력: ");
        String str = sc.nextLine();
        
        String[] x = inputVal(str);
        
        System.out.print(x[0]+x[1]);
        
    }
    
    private static String[] inputVal(String x) {
        String [] d = new String[2];
        d[0]="..";
        d[1]=x;
        
        return d;
    }
    
}
