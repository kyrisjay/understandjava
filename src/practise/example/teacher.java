package practise.example;

public abstract class teacher {
    private String name;
    private int age;

    public teacher() {
    }

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

    public abstract void teach();

    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
