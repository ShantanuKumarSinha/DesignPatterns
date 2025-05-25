package design.pattern.creational.registry;

/**
 * * Client class to demonstrate the Prototype design pattern. It creates a new Student object using
 * the copy constructor of Student and IntelligentStudent.
 */
public class Client {

  public static void fillRegistry(StudentRegistry registry) {
    // It creates a new Student object
    var student = new Student();
    student.name = "Test";
    student.age = 20;
    registry.registerStudent("Student", student);

    IntelligentStudent intelligentStudent = new IntelligentStudent();
    intelligentStudent.name = "Intelligent Test";
    intelligentStudent.age = 22;
    intelligentStudent.iq = 150;

    registry.registerStudent("IntelligentStudent", intelligentStudent);
  }

  public static void main(String[] args) {
    // Create Instance of StudentRegistry
    StudentRegistry registry = new StudentRegistry();

    // Fill the registry with students
    fillRegistry(registry);

    // Retrieve and print the students from the registry
    Student student = registry.getStudent("Student");
    System.out.println("Student Name: " + student.name + ", Age: " + student.age);

    IntelligentStudent intelligentStudent =
        (IntelligentStudent) registry.getStudent("IntelligentStudent");
    System.out.println(
        "Intelligent Student Name: "
            + intelligentStudent.name
            + ", Age: "
            + intelligentStudent.age
            + ", IQ: "
            + intelligentStudent.iq);
  }
}
