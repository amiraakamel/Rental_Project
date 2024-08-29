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
public class cUtilities {
     private Double localTax;
     private Double waterBill;
     private Double electricity;

    public cUtilities() {
    }

    public cUtilities(Double localTax, Double waterBill, Double electricity) {
        this.localTax = localTax;
        this.waterBill = waterBill;
        this.electricity = electricity;
    }
     
     

    public Double getLocalTax() {
        return localTax;
    }

    public void setLocalTax(Double localTax) {
        this.localTax = localTax;
    }

    public Double getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(Double waterBill) {
        this.waterBill = waterBill;
    }

    public Double getElectricity() {
        return electricity;
    }

    public void setElectricity(Double electricity) {
        this.electricity = electricity;
    }
     
}
