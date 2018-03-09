/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 * @author Wenqing
 */
public class Person {
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String gender;
    private int age;
    private String profilePicture;   // http://tinypic.com/r/14y2zoo/9

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
   
    private License lisc1 ;
    private Address add1;
    private CreditCard cc1;
    private FinancialAcc fa1;
    

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public License getLisc1() {
        return lisc1;
    }

    public void setLisc1(License lisc1) {
        this.lisc1 = lisc1;
    }

    public Address getAdd1() {
        return add1;
    }

    public void setAdd1(Address add1) {
        this.add1 = add1;
    }

    public CreditCard getCc1() {
        return cc1;
    }

    public void setCc1(CreditCard cc1) {
        this.cc1 = cc1;
    }

    public FinancialAcc getFa1() {
        return fa1;
    }

    public void setFa1(FinancialAcc fa1) {
        this.fa1 = fa1;
    }


}

