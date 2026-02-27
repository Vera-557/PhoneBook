import java.util.UUID;

public class Contact {
    String id;//автоматически генерировать
    String firstName;
    String lastName;
    Integer phoneNumber;
    Integer age;
    Character gender;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Contact(String firstName, String lastName, Integer phoneNumber, Integer age, Character gender, String id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
    }
    public Contact(String firstName, String lastName, Integer phoneNumber, Integer age, Character gender) {
        this(firstName,lastName,phoneNumber,age,gender, UUID.randomUUID().toString());
    }

    @Override
    public String toString() {
        return "Contact{" +

                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
