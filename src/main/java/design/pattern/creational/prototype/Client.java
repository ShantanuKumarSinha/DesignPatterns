package design.pattern.creational.prototype;

/** * Client class to demonstrate the Prototype design pattern.
 * It creates a new Student object using the copy constructor of Student and IntelligentStudent.
 */

public class Client {

  private static void doSomething(Student student) {
    // It creates a new Student object using the copy constructor of Student
    var st = new Student(student);
    System.out.println("Student Name: " + st.name + ", Age: " + st.age);
    System.out.println(st instanceof IntelligentStudent ? "IntelligentStudent" : "Student");
    // Here we are using the copy method to create a new instance of Student
    // It will create a new Student object with the same properties as the original
    // using copy method
    // It will create a new IntelligentStudent object with the same properties as the original
    // using copy method of IntelligentStudent Run-time polymorphism
    var studentCopy = student.copy();
    System.out.println(
        studentCopy instanceof IntelligentStudent ? "IntelligentStudent" : "Student");
  }

  public static void main(String[] args) {
    Student student = new Student();
    student.name = "Test";
    student.age = 20;
    // It will create a new Student object with the same properties as the original using copy
    // constructor
    doSomething(student);
    IntelligentStudent intelligentStudent = new IntelligentStudent();
    intelligentStudent.name = "Intelligent Test";
    intelligentStudent.age = 22;
    intelligentStudent.iq = 150;
    // It will create a new Student object with the same properties as the original using copy
    // constructor of Student
    doSomething(intelligentStudent);
  }
}
