package practice6.builder;

public class Person {
    private String name;
    private int age;
    private boolean hasJob;
    private boolean isStudent;

    public Person(String name, int age, boolean hasJob, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.hasJob = hasJob;
        this.isStudent = isStudent;
    }

    public Person(PersonBuilder personBuilder) {
        name = personBuilder.name;
        age = personBuilder.age;
        hasJob = personBuilder.hasJob;
        isStudent = personBuilder.isStudent;
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

    public boolean isHasJob() {
        return hasJob;
    }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasJob=" + hasJob +
                ", isStudent=" + isStudent +
                '}';
    }

    public static class PersonBuilder {
        private String name;
        private int age;
        private boolean hasJob;
        private boolean isStudent;

        public PersonBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public PersonBuilder setHasJob(boolean hasJob) {
            this.hasJob = hasJob;
            return this;
        }

        public PersonBuilder setStudent(boolean isStudent) {
            this.isStudent = isStudent;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
