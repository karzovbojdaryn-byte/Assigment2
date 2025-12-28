

public final class Student extends Human implements IStudy {

    private final String university; // final field
    private float gpa;

    public Student(String name, int age, boolean married, String university, float gpa) {
        super(name, age, married);
        this.university = university;
        this.gpa = gpa;
    }

    @Override
    public void study() {
        System.out.println("Student is studying");
    }

    @Override
    public void passExam() {
        System.out.println("Student passed the exam");
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public final void showUniversity() { // final method
        System.out.println("University: " + university);
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
