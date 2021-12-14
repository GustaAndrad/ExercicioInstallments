/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gusta
 */
public class Contract {
    
    private Integer number;
    private Date date;
    private Double totalValue;

    List<Installments> installments = new ArrayList<>();
    
    public Contract() {
    }

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installments> getInstallments() {
        return installments;
    }
    
    public void addInstallment(Installments installment){
        installments.add(installment);
        }
    
    public void removeInstallment(Installments installment){
        installments.remove(installment);
    }
    
    
}
