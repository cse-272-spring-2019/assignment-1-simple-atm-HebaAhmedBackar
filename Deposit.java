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
public class Deposit {
    Scene scene;
    Stage stage;
    Transactions transactions;
    Withdraw withdraw;
    History history;
    Balance balance;
    String [] mon=new String[10];
    String [] shift=new String[5];
   
     public Deposit (Stage stage){
        this.stage=stage;
        
    }

    
      public void prepareScene(){
          
          
            
           Label with =new Label("D E P O S I T");
           final Label label =new Label();
           Button one= new Button("1");
           Button two= new Button("2");
           Button three= new Button("3");
           Button four= new Button("4");
           Button five= new Button("5");
           Button six= new Button("6");
           Button seven= new Button("7");
           Button eight= new Button("8");
           Button nine= new Button("9");
           Button zero=new Button("0");
           Button clear = new Button ("Clear");
           Button deposit= new Button("Deposit");
          final GridPane grid =new GridPane();
          final GridPane grid1 =new GridPane();
          
          grid.setAlignment(Pos.CENTER);
         
          grid.add(with,0,0);
          grid.add(nine,4,2);
          grid.add(eight,3,2);
          grid.add(seven,2,2);
          grid.add(six,4,3);
           grid.add(five,3,3);
          grid.add(four,2,3);
          grid.add(three,4,4);
          grid.add(two,3,4);
          grid.add(one,2,4);
         
          grid.add (zero,3,5); 
          grid.add(label,1,8);
          grid.add(deposit,1,9);
          grid.add(clear,1,10);
          with.setFont(new Font("Verdana",70));
          with.setTextFill(Color.web("#FFFFFF"));
          label.setFont(new Font("Verdana",30));
          label.setTextFill(Color.web("#8BD8BD"));
          label.setPrefWidth(250);
          label.setPrefHeight(30);
          one.setBlendMode(BlendMode.ADD);
          two.setBlendMode(BlendMode.ADD);
          deposit.setBlendMode(BlendMode.ADD);
          three.setBlendMode(BlendMode.ADD);
          four.setBlendMode(BlendMode.ADD);
          five.setBlendMode(BlendMode.ADD);
          six.setBlendMode(BlendMode.ADD);
          seven.setBlendMode(BlendMode.ADD);
          eight.setBlendMode(BlendMode.ADD);
          nine.setBlendMode(BlendMode.ADD);
          zero.setBlendMode(BlendMode.ADD);
          clear.setBlendMode(BlendMode.ADD);
          clear.setPrefSize(250, 50);
           deposit.setPrefSize(250, 50);
           one.setPrefSize(60, 60);
            two.setPrefSize(60, 60);
            three.setPrefSize(60, 60);
            four.setPrefSize(60, 60);
            five.setPrefSize(60, 60);
            six.setPrefSize(60, 60);
            seven.setPrefSize(60, 60);
            eight.setPrefSize(60, 60);
            nine.setPrefSize(60, 60);
            zero.setPrefSize(60, 60);
          label.setPrefWidth(250);
          label.setPrefHeight(30);
          
          one.setOnAction(new EventHandler<ActionEvent>(){
          
           @Override
           public void handle (ActionEvent event){
           
               label.setText(getText()+"1");
            
            
   }
                private String getText() {
                   
                   return label.getText();
               }

               
           });
          two.setOnAction(new EventHandler<ActionEvent>(){
          
          
           @Override
           public void handle (ActionEvent event){
           
              label.setText(getText()+"2");
   }

               private String getText() {
                   
                   return label.getText();
               }

               
           });
          three.setOnAction(new EventHandler<ActionEvent>(){
          
          
           @Override
           public void handle (ActionEvent event){
           
              label.setText(getText()+"3");
   }

               private String getText() {
                   
                   return label.getText();
               }

               
           });
          four.setOnAction(new EventHandler<ActionEvent>(){
          
          
           @Override
           public void handle (ActionEvent event){
           
              label.setText(getText()+"4");
   }

               private String getText() {
                   
                   return label.getText();
               }

               
           });
               five.setOnAction(new EventHandler<ActionEvent>(){
          
          
           @Override
           public void handle (ActionEvent event){
           
              label.setText(getText()+"5");
   }

               private String getText() {
                   
                   return label.getText();
               }

               
           });
               six.setOnAction(new EventHandler<ActionEvent>(){
          
          
           @Override
           public void handle (ActionEvent event){
           
              label.setText(getText()+"6");
   }

               private String getText() {
                   
                   return label.getText();
               }

               
           });
               seven.setOnAction(new EventHandler<ActionEvent>(){
          
          
           @Override
           public void handle (ActionEvent event){
           
              label.setText(getText()+"7");
   }

               private String getText() {
                   
                   return label.getText();
               }

               
           });
               eight.setOnAction(new EventHandler<ActionEvent>(){
          
          
           @Override
           public void handle (ActionEvent event){
           
              label.setText(getText()+"8");
   }

               private String getText() {
                   
                   return label.getText();
               }

               
           });
               nine.setOnAction(new EventHandler<ActionEvent>(){
          
          
           @Override
           public void handle (ActionEvent event){
           
              label.setText(getText()+"9");
   }

               private String getText() {
                   
                   return label.getText();
               }

               
           });
               zero.setOnAction(new EventHandler<ActionEvent>(){
          
          
           @Override
           public void handle (ActionEvent event){
           
              label.setText(getText()+"0");
   }

               private String getText() {
                   
                   return label.getText();
               }

               
           });
             
                deposit.setOnAction(new EventHandler<ActionEvent>(){
          
                   @Override 
           public void handle (ActionEvent event){
            
               mon =transactions.getArr();
             
               int i =transactions.getIndex();
               int pointer=i;
                 for (i=0;i<4;i++){
                     mon[i]=mon[i+1];
                 }
             
               double amount =transactions.getBalance();
               
           
                double input=Double.parseDouble(label.getText());
                transactions.setBalance(amount+input); 
                mon[i]= "Deposit: "+(input);
                
              
                transactions.setIndex(++i);
                transactions.setPoint(i);
                transactions.setArr(mon);
             
                }
        
      });   
                 clear.setOnAction(new EventHandler<ActionEvent>(){
          
                   @Override 
           public void handle (ActionEvent event){
               label.setText("");
          
                }
        
      });   
                Button x = new Button("Return to Main Menu");
                
                 grid.add(x,1,11);
                 x.setBlendMode(BlendMode.ADD);
                  x.setPrefSize(250, 50);
                 x.setOnAction(new EventHandler<ActionEvent>(){
          
                   @Override 
               public void handle (ActionEvent event){
              
                label.setText("");
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
    public void setHistory(History history) {
        this.history=history;
    }

   
}
