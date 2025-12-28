

public class Main {
    public static void main(String[] args) {

        // reference by class
        Student student = new Student("Arslan", 20, false, "AITU", 3.5f);

        // reference by superclass (polymorphism)
        Human employeeHuman = new Employee("Kim", 30, true, "Developer", 500000);

        // reference by interface
        IStudy studyRef = student;
        IWork workRef = (Employee) employeeHuman;

        student.introduce();
        student.study();
        student.passExam();
        student.showUniversity();
        System.out.println(student.getRole());

        employeeHuman.introduce();
        System.out.println(employeeHuman.getRole());

        workRef.work();
        System.out.println("Salary: " + workRef.getSalary());

        studyRef.study();

        System.out.println("Company: " + Employee.companyName);
    }
}
