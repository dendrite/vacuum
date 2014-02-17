package ru.go.vacuum.model

class User {

    String nick

    String firstName
    String lastName

    String email
    Date dateOfBirth

    static constraints = {
    }


    @Override
    public java.lang.String toString() {
        return "User{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", version=" + version +
                '}';
    }
}
