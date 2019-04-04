package com.nikitagordia.model;

public class Client {

    private String firstName;
    private String secondName;
    private String patronymic;

    private String address;

    private long innerCallTime;
    private long outerCallTime;

    public Client(String firstName, String secondName, String patronymic, String address, long innerCallTime, long outerCallTime) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.address = address;
        this.innerCallTime = innerCallTime;
        this.outerCallTime = outerCallTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getInnerCallTime() {
        return innerCallTime;
    }

    public void setInnerCallTime(long innerCallTime) {
        this.innerCallTime = innerCallTime;
    }

    public long getOuterCallTime() {
        return outerCallTime;
    }

    public void setOuterCallTime(long outerCallTime) {
        this.outerCallTime = outerCallTime;
    }

    @Override
    public String toString() {
        return String.format("%-27s %-28s %-27s %-42s %-35s %s",
                "Client { " + "firstName='" + firstName + '\'',
                "secondName='" + secondName + '\'',
                "patronymic='" + patronymic + '\'',
                "address='" + address + '\'',
                "innerCallTime=" + innerCallTime,
                "otouterCallTime=" + outerCallTime + " }");
    }
}
