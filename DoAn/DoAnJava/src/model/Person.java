package model;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {
    private int id;
    private int[] role;
    private String account;
    private String password;
    private String name;
    private Gender gender;
    private LocalDate date;
    private String email;
    private String phoneNumber;
    private long point;

    public Person(int id, int[] role, String account, String password, String name, Gender gender, LocalDate date, String email, String phoneNumber, long point) {
        this.id = id;
        this.role = role;
        this.account = account;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getRole() {
        return role;
    }

    public void setRole(int[] role) {
        this.role = role;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", role=" + Arrays.toString(role) +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", point=" + point +
                '}';
    }
}
