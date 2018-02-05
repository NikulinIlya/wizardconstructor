package ru.project.userprocess;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int birthYear;

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

    public int getBirthYear() {
        return birthYear;
    }

    private void setBirthYear(int age) {
        this.birthYear = age;
    }

    public String getFullName(){
        return firstName+" "+middleName+" "+lastName;
    }

    public int GetAge(int year){
        return year - this.birthYear;
    }
}
