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
public class Manual extends Product{
    
    private String publisher;

    public Manual( int productId, String productName, double productRetailPrice,
            String productDescription, String publisher) 
    {
        super(productId, productName, productRetailPrice, productDescription);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
}
