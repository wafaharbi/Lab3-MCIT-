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
public class Hardware extends Product{
    
    private int warrantyPeriod;

    public Hardware( int productId, String productName, double productRetailPrice, 
            String productDescription, int warrantyPeriod) 
    {
        
        super(productId, productName, productRetailPrice, productDescription);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    
    public double getTax(double tax){
        return tax;
    }
    
}
