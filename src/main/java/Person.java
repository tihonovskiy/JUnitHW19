public class Person {
    public String firestName;
    public String lastName;
    public int age;
    public String country;

    public Person(String firestName, String lastName, int age, String country) {
        this.firestName = firestName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firestName='" + firestName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
