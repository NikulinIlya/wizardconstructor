public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer birthYear;

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    private void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    private void setBirthYear(Integer age) {
        this.birthYear = age;
    }

    public String getFullName(){
        return "";
    }

    public Integer GetAge(int year){
        return year - this.birthYear;
    }
}
