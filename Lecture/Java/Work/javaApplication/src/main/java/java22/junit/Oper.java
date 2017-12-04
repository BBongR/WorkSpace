package java22.junit;

public class Oper {
    private int firstNum;
    private int secondNum;

    // 메서드
    public int add() {
        return firstNum + secondNum;
    }

    public int minus() {
        return firstNum - secondNum;
    }

    public int mul() {
        return firstNum * secondNum;
    }

    public double div() {
        return (double) firstNum / secondNum;
    }

    // 기본 생성자
    public Oper() {
        super();
    }

    // 생성자
    public Oper(int firstNum, int secondNum) {
        super();
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    // toString
    @Override
    public String toString() {
        return "Oper [firstNum=" + firstNum + ", secondNum=" + secondNum + "]";
    }

    // getter & setter
    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }
}
