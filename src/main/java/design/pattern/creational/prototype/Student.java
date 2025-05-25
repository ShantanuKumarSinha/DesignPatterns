package design.pattern.creational.prototype;

public class Student implements Prototype<Student> {
  String name;
  int age;
  private int id;

  public Student() {}

  public Student(Student student) {
    this.id = student.id;
    this.name = student.name;
    this.age = student.age;
  }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
