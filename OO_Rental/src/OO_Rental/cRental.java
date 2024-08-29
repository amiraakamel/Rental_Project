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
     private int flat;
     private int house;
     private Double cost;
     private Double numberofroom;
     private String location;

    public cRental() {
    }
     

    public cRental(int flat, int house, Double cost, Double numberofroom, String location) {
        this.flat = flat;
        this.house = house;
        this.cost = cost;
        this.numberofroom = numberofroom;
        this.location = location;
    }
     
     
    

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getNumberofroom() {
        return numberofroom;
    }

    public void setNumberofroom(Double numberofroom) {
        this.numberofroom = numberofroom;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
