package design.pattern.creational.registry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
  /**
   * Registers a student with a unique identifier.
   *
   * @param id the unique identifier for the student
   * @param student the student object to register
   */
  private Map<String, Student> registry = new HashMap<>();

  public void registerStudent(String id, Student student) {
    registry.put(id, student);
  }

  public Student getStudent(String id) {
    // add copy or same object
    return registry.get(id).copy();
  }
}
