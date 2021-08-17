/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.lab3;

/**
 *
 * @author wafaalharbi
 */
public class Individual extends Customer{
    
    private String licenseNumber;

    public Individual( int customerId, String customerName, String customerPhone, 
            String customerAddress, String licenseNumber) {
        super(customerId, customerName, customerPhone, customerAddress);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "Individual{" + "licenseNumber=" + licenseNumber + '}';
    }
    
    
}
