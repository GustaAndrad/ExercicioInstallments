/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Contract;
import model.entities.ContractService;
import model.entities.Installments;
import model.services.PaypalService;

/**
 *
 * @author gusta
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
         
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter contract data");
        System.out.println("Number");
        int number = sc.nextInt();
        System.out.println("Date (dd/MM/yyyy):");
        Date date = sdf.parse(sc.next());
        System.out.println("Contract value:");
        double totalValue = sc.nextDouble();
        
        Contract contract = new Contract(number, date, totalValue);
        
        System.out.println("Enter number of installments:");
        int n = sc.nextInt();
        
        ContractService contractService = new ContractService(new PaypalService());
        
        contractService.processContract(contract, n);
        
        System.out.println("Installments:");
        for(Installments x : contract.getInstallments()){
            System.out.println(x);
        }
         
        sc.close();
    }
    
}
