package design.pattern.creational.prototype;

public class IntelligentStudent extends Student {
  int iq;

  public IntelligentStudent() {
    super();
  }

  public IntelligentStudent(IntelligentStudent intelligentStudent) {
    super(intelligentStudent);
    this.iq = intelligentStudent.iq;
  }

  @Override
  public IntelligentStudent copy() {
    return new IntelligentStudent(this);
  }
}
