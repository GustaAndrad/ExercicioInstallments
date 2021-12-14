/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import java.util.Calendar;
import java.util.Date;
import model.services.OnlinePaymentService;

/**
 *
 * @author gusta
 */
public class ContractService {
    
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    
    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;
        
        for(int i = 1; i <= months; i++){
            Date date = addMonths(contract.getDate(), i);
            double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
            
            contract.addInstallment(new Installments(date,fullQuota));
            
        }
    }
    
    private Date addMonths(Date date, int n){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
                
                
                
    }
    
}
