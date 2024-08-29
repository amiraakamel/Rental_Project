/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO_Rental;

/**
 *
 * @author Kimo Store
 */
public class cCustomer{
    private String CustomerID;
    private String Firstname;
    private String Surname;
    private String Address;
    private String Postcode;
    private String Town;
    private String ProvefID;
    private Double Deposit;
    private Double DownPayment;

    public cCustomer() {
    }

    public cCustomer(String CustomerID, String Firstname, String Surname, String Address, String Postcode, String Town, String ProvefID, Double Deposit, Double DownPayment) {
        this.CustomerID = CustomerID;
        this.Firstname = Firstname;
        this.Surname = Surname;
        this.Address = Address;
        this.Postcode = Postcode;
        this.Town = Town;
        this.ProvefID = ProvefID;
        this.Deposit = Deposit;
        this.DownPayment = DownPayment;
    }
  
    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }

    public String getProvefID() {
        return ProvefID;
    }

    public void setProvefID(String ProvefID) {
        this.ProvefID = ProvefID;
    }

    public Double getDeposit() {
        return Deposit;
    }

    public void setDeposit(Double Deposit) {
        this.Deposit = Deposit;
    }

    public Double getDownPayment() {
        return DownPayment;
    }

    public void setDownPayment(Double DownPayment) {
        this.DownPayment = DownPayment;
    }
}
