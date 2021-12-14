/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.services;

/**
 *
 * @author gusta
 */
public class PaypalService implements OnlinePaymentService {
    
    private static final double FEE_PERCENTAGE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;
    
    
    @Override
    public double paymentFee(double amount){
        return amount * FEE_PERCENTAGE;
    }
    
    @Override
    public double interest(double amount, int months){
        return amount * MONTHLY_INTEREST * months;
    }
    
}
