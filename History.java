/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmo;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlendMode;

/**
 *
 * @author HebaBackar
 */
public class History {
    
    Scene scene;
    Stage stage;
    Transactions transactions;
    Withdraw withdraw;
    Deposit deposit;
    Balance balance;
    
     public History (Stage stage){
        
        this.stage=stage;
} 
       String [] mon=new String[10];
  
    public void prepareScene(){   
        transactions = new Transactions();
         
         Label with =new Label("H I S T O R Y");
         with.setFont(new Font("Verdana",60));
          with.setTextFill(Color.web("#FFFFFF"));
          Label space=new Label("");
          Button next = new Button("Next");
          Button previous = new Button("Previous");
          final GridPane grid =new GridPane();
          grid.setAlignment(Pos.CENTER);
          grid.add(with,0,0);
          grid.add(next,2,3);
           grid.add(previous,2,4);
          next.setBlendMode(BlendMode.ADD);
          previous.setBlendMode(BlendMode.ADD);
          next.setPrefSize(250, 50);
          previous.setPrefSize(250, 50);
          space.setPrefWidth(100);
          space.setPrefHeight(30);
          
            final Label prev = new Label();
               prev.setFont(new Font("Verdana",20));
               prev.setTextFill(Color.web("#8BD8BD"));
               prev.setPrefWidth(250);
               prev.setPrefHeight(30);
               grid.add(prev, 2, 2);
               grid.add(space,1,1);
              
               
               
          previous.setOnAction(new EventHandler<ActionEvent>(){
          
                   @Override 
           public void handle (ActionEvent event){
              int j;
              
              mon =transactions.getArr();
               int i =transactions.getPoint();
                if (i>0){
                i--;
                transactions.setPoint(i);
                prev.setText(mon[i]);
             }
              
           
           }  });
           
          next.setOnAction(new EventHandler<ActionEvent>(){
          
                   @Override 
           public void handle (ActionEvent event){
              int j;
          
               mon =transactions.getArr();
               int i =transactions.getPoint();
                if (i<=9){
                i++;
                transactions.setPoint(i);
                prev.setText(mon[i]);
             }
              
              
           }
               
           });
          Button exit = new Button("Return to Main Menu");

                grid.add(exit,2,5);
                exit.setPrefSize(250, 50);
                exit.setBlendMode(BlendMode.ADD);
                exit.setOnAction(new EventHandler<ActionEvent>(){

              @Override 
              public void handle (ActionEvent event){
                    prev.setText("");
             stage.setScene(transactions.getScene());
            }

              });
          
     scene = new Scene(grid , 1200, 600,Color.web("#243665"));
}
public Scene getScene(){
       return this.scene;
   }
  
   public void setTransactions(Transactions transactions){
        this.transactions=transactions;
    }
}