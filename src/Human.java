

public abstract class Human {

    protected String name;
    protected int age;
    protected boolean married;

    public Human(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public void introduce() {
        System.out.println("My name is " + name + ", age: " + age);
    }

    // abstract method
    public abstract String getRole();

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
