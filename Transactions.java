/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package atmo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
*
* @author HebaBackar
*/
public class Transactions {

   Stage stage;
   Scene scene;
   LoginForm loginForm;
   Withdraw withdraw1;
   Balance balance1;



   Deposit deposit1;

   History history1;
    String[] arr= new String[10];
   int i=0;

   int p=0;
   public double balance;
  public Transactions obj ;

   /**
    *
    */


   /**
    *
    * @param 
    */

   /**
    *
    * @param stage
    */
   public Transactions (Stage stage){
       this.stage=stage;
      this.balance=0.0;
      
   }

   public Transactions() {
    }

   public void prepareScene(){


     final Button withdraw = new Button();
     final Button deposit =new Button();
     Button history =new Button();
     Button logout = new Button();
     Button balance = new Button();
     Label space =new Label("   ");//to allow empty space between buttons
     Label space1 =new Label("   ");
     Label space2 =new Label("   ");
     Label space3 =new Label("   ");
         withdraw.setText("Withdraw");
         deposit.setText("Deposit");  
         balance.setText("Balance Inquiry");
         history.setText("Previous Transactions");
         logout.setText("Logout");
         GridPane grid =new GridPane();
         grid.setAlignment(Pos.CENTER);
         grid.add(withdraw,0,0);
         grid.add(space,0,1);
         grid.add(deposit,0,2);
         grid.add(space1,0,3);
         grid.add(balance,0,4);
         grid.add(space3,0,5);
         grid.add(history,0,6);
         grid.add(space2,0,7);
         grid.add(logout,0,8);
         space.setPrefWidth(250);
         space.setPrefHeight(30);
         space1.setPrefWidth(250);
         space1.setPrefHeight(30);
         space2.setPrefWidth(250);
         space2.setPrefHeight(30);
         space3.setPrefWidth(250);
         space3.setPrefHeight(30);

         withdraw.setPrefSize(250, 50);
         deposit.setPrefSize(250, 50);
          history.setPrefSize(250, 50);
         logout.setPrefSize(250, 50);
       balance.setPrefSize(250, 50);

       withdraw.setBlendMode(BlendMode.ADD);
        deposit.setBlendMode(BlendMode.ADD);
        history.setBlendMode(BlendMode.ADD);
       logout.setBlendMode(BlendMode.ADD);
        balance.setBlendMode(BlendMode.ADD);


           withdraw.setOnAction(new EventHandler<ActionEvent>(){

          @Override
          public void handle (ActionEvent event){
           //withdraw1.setTransactions(obj);
           stage.setScene(withdraw1.getScene());

  }});

            balance.setOnAction(new EventHandler<ActionEvent>(){

          @Override
          public void handle (ActionEvent event){
           
            stage.setScene(balance1.getScene());

  }});
            deposit.setOnAction(new EventHandler<ActionEvent>(){
             @Override
          public void handle (ActionEvent event){
          // deposit1.setTransactions(obj);
           stage.setScene(deposit1.getScene());

  }});
             history.setOnAction(new EventHandler<ActionEvent>(){
             @Override
          public void handle (ActionEvent event){
          // history1.setTransactions(obj);
           stage.setScene(history1.getScene());


  }});
                logout.setOnAction(new EventHandler<ActionEvent>(){
             @Override
          public void handle (ActionEvent event){

           stage.setScene(loginForm.getScene());
           }});

            scene = new Scene(grid , 1200, 600,Color.web("#243665"));}


 public Scene getScene(){
      return this.scene;
  }
 public double getBalance(){
    return this .balance;
}
public void setBalance(double balance){

    this.balance=balance;
   }
   public void setLoginForm(LoginForm loginForm){
       this.loginForm=loginForm;
   }
   public void setWithdraw(Withdraw withdraw) {
       this.withdraw1=withdraw;
   }
public void setBalance1(Balance balance) {
       this.balance1=balance;
   }
public void setDeposit(Deposit deposit) {
       this.deposit1=deposit;
   }
public void setHistory(History history) {
       this.history1=history;
   }
public String[] getArr(){
      return this.arr;
  }
public void setArr(String[] arr){

    this.arr=arr;
   }


public int getIndex(){
    return this .i;
}
public void setIndex(int index){

    this.i=index;
   }
public int getPoint(){
    return this .p;
}
public void setPoint(int point){

    this.p=point;
   }
}