package java04;

public class ja04_11_구구단세로출력 {
    public static void main(String[] args){
        
        
    /*2*1=  2  2*2=  4  2*3=  6   2*9= 18 
      3*1=  3  3*2=  6  3*3=  9   3*9= 27 
      .
     19*1= 19 19*2= 38 19*3= 57  19*9=171 */

        int result=0;
        for(int i=2; i<=19; i=i+1){
            for(int j=1; j<=9; j=j+1){
                result=i*j;
                //System.out.println(i + "*" + j + "=" + result);
                System.out.format("%2d*%d=%3d", i, j, result);
                if(j<9){
                    System.out.print(", ");
                }else{
                    System.out.println(".");
                }
            }
            //System.out.println();
        }
        
    }
}
