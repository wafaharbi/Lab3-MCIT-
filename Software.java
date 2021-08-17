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
public class Software extends Product{
    
    private String  softwareLicence;

    public Software( int productId, String productName, double productRetailPrice,
            String productDescription, String softwareLicence) 
    {
        super(productId, productName, productRetailPrice, productDescription);
        this.softwareLicence = softwareLicence;
    }

    public String getSoftwareLicence() {
        return softwareLicence;
    }

    public void setSoftwareLicence(String softwareLicence) {
        this.softwareLicence = softwareLicence;
    }
    
    public String getLicense(String license){
        return license;
    }
    
   
    
    
}
