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
public class Product {
    
    private int productId;
    private String productName;
    private double productRetailPrice;
    private String productDescription;

    public Product(int productId, String productName, double productRetailPrice, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productRetailPrice = productRetailPrice;
        this.productDescription = productDescription;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductRetailPrice() {
        return productRetailPrice;
    }

    public void setProductRetailPrice(double productRetailPrice) {
        this.productRetailPrice = productRetailPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    
}
