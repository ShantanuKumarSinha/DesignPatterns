package design.pattern.creational.builder.firstWay;

import java.time.LocalDate;

public class Student {

    private String id;
    private String name;
    private String email;
    private LocalDate birthday;
    private String address;

    private Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.email = studentBuilder.email;
        this.birthday = studentBuilder.birthday;
        this.address = studentBuilder.address;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "Student{"
                + "id= '"
                + id
                + '\''
                + ", name= '"
                + name
                + '\''
                + ", email= '"
                + email
                + '\''
                + ", birthday= "
                + birthday+'\''
                + ", address= '"
                + address
                + '\''
                + '}';
    }

    static class StudentBuilder {
        private String id;
        private String name;
        private String email;
        private LocalDate birthday;
        private String address;

        public StudentBuilder id(String id) {
            this.id = id;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder email(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
