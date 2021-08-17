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
public class TestLab3 {
    
    public static void main(String args []){
        
        //        Employee empShahad = new Employee(101, "Shahad", 7000.0, "Java Dev", 10, 20.0);
        //  public Company( int customerId, String customerName, String customerPhone, String customerAddress,
         //   String companyContact, int companyDiscount)
        
         Company dellCompany = new Company(100 , "Ahmed" ,"055500555", "Jeddah", "contact on 342455" , 15 );
         System.out.println("Customer ID = " +  dellCompany.getCustomerId() + " Customer Name : "+ dellCompany.getCustomerName()
         + " Customer Phone No. " + dellCompany.getCustomerPhone() + " \nAddress of Customer " + dellCompany.getCustomerAddress()
         + " Company Contact is : " +dellCompany.getCompanyContact() + "Company Discount = " + dellCompany.getCompanyDiscount());
    }
}
