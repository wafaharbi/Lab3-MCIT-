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
public class Company extends Customer{
    
     private String companyContact;
     private int companyDiscount;

    public Company( int customerId, String customerName, String customerPhone, String customerAddress,
            String companyContact, int companyDiscount) {
        super(customerId, customerName, customerPhone, customerAddress);
        this.companyContact = companyContact;
        this.companyDiscount = companyDiscount;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public int getCompanyDiscount() {
        return companyDiscount ;
    }

    public void setCompanyDiscount(int companyDiscount) {
        this.companyDiscount = companyDiscount;
    }
     
     
     
}
