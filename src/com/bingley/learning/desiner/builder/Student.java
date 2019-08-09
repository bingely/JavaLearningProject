package com.example.desiner.builder;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class Student {

    private final String name;
    private final String age;


    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
    }

    public static class StudentBuilder {
        public String name;
        public String age;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public Student create() {
            return new Student(this);
        }
    }
}
