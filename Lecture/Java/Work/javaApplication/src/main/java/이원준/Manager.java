package 이원준;

public class Manager extends Employee {
    private int bonus;

    // getter & setter
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    // 기본 생성자
    public Manager() {
        super();
    }

    // 생성자
    public Manager(int bonus) {
        super();
        this.bonus = bonus;
    }

    public Manager(String name, String addr, int salary, String rrn, int bonus) {
        super(name, addr, salary, rrn);
        this.bonus = bonus;
    }

    // toString
    @Override
    public String toString() {
        return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
    }
}
