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
public class cRental {
     private String flat;
     private String house;
     private Double cost;
     private String numberofroom;
     private String location;

    public cRental() {
    }
     

    public cRental(String flat, String house, Double cost,String numberofroom, String location) {
        this.flat = flat;
        this.house = house;
        this.cost = cost;
        this.numberofroom = numberofroom;
        this.location = location;
    }
     
     
    

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getNumberofroom() {
        return numberofroom;
    }

    public void setNumberofroom(String numberofroom) {
        this.numberofroom = numberofroom;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
