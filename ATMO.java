/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmo;


import javafx.application.Application;

import javafx.stage.Stage;

/**
 *
 * @author HebaBackar
 */
public class ATMO extends Application {
  
    @Override
    public void start(Stage primaryStage) throws Exception {
    
     primaryStage.setTitle("ATM");
     LoginForm loginForm = new LoginForm(primaryStage);
     loginForm.prepareScene();
     Transactions transactions =new Transactions(primaryStage);
     transactions.prepareScene();
     Withdraw withdraw = new Withdraw(primaryStage);
     withdraw.prepareScene(); 
     Balance balance = new Balance(primaryStage);
     balance.prepareScene();
     Deposit deposit = new Deposit(primaryStage);
     deposit.prepareScene();
     History history = new History(primaryStage);
     history.prepareScene();
     
        loginForm.setTransactions(transactions);
        transactions.setWithdraw(withdraw);
        transactions.setBalance1(balance);
        transactions.setDeposit(deposit);
        transactions.setHistory(history);
        transactions.setLoginForm(loginForm);
        withdraw.setTransactions(transactions);
        deposit.setTransactions(transactions);
        balance.setTransactions(transactions);
        history.setTransactions(transactions);
        primaryStage.setScene(loginForm.getScene()); 
      
     primaryStage.show();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
    
}
