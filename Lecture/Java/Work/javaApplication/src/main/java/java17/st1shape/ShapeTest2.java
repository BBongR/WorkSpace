package java17.st1shape;

public class ShapeTest2 {
    public static void main(String[] args) {

        // 클래스 상향 형변환
        Rectangle r = new Rectangle();
        r.x = 5;
        r.y = 5;
        r.width = 100;
        r.height = 100;
        System.out.println("r " + r.toString());

        Shape s = null;
        s = r; // 클래스 상향 형변환: Rectangle ---> Shape
        System.out.println("s " + s.toString()); // r.toString() 호출됨

        s.x = 10;
        s.y = 10;
//        s.width = 100;
//        s.height = 100;
        System.out.println("s " + s.toString()); // 실제로는 r.toString() 호출됨
        System.err.println("r " + r.toString());
    }
}
