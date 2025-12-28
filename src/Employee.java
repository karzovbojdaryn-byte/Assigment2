

public class Employee extends Human implements IStudy, IWork {

    private String position;
    private float salary;

    public static String companyName = "AITU C"; // static field

    public Employee(String name, int age, boolean married, String position, float salary) {
        super(name, age, married);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Employee is working as " + position);
    }

    @Override
    public float getSalary() {
        return salary;
    }

    @Override
    public void study() {
        System.out.println("Employee is learning new skills");
    }

    @Override
    public void passExam() {
        System.out.println("Employee passed certification exam");
    }

    @Override
    public String getRole() {
        return "Employee";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
