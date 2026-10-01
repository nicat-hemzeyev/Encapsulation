
public class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    public Student(){

    }
    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name=name.toLowerCase();
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else
            System.out.println(this.age=0);
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        int grade1 =Integer.parseInt(grade);
        if(grade1>=1&&grade1<=11){
            this.grade = grade;
        } else
            System.out.println(this.grade="default");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}