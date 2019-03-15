/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package atmo;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger; 
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
public class Balance  {
  Scene scene;
  Stage stage;
  Transactions trans;
  Withdraw withdraw;
  Deposit deposit;
  History history; 
  String [] mon=new String[5];

  public Balance (Stage stage){
      this.stage=stage;

  }

   public void prepareScene(){

      trans = new Transactions();

       Label balance =new Label("B A L A N C E");
       balance.setFont(new Font("Verdana",70));
       balance.setTextFill(Color.web("#FFFFFF"));
        Label space2 =new Label("   ");
      space2.setPrefWidth(198);
         space2.setPrefHeight(5);
       final GridPane grid =new GridPane();
        grid.setAlignment(Pos.CENTER);

          Button x = new Button("Current Balance");
                grid.add(x,6,8);
                x.setBlendMode(BlendMode.ADD);
                x.setPrefSize(250, 50);
           final Label  balan =new Label();
                x.setOnAction(new EventHandler<ActionEvent>(){

              @Override 
              public void handle (ActionEvent event){
                  
                  double amount= trans.getBalance();          
                 balan.setText(String.valueOf(amount));
                   
                  grid.add(balan,6,6);

                 balan.setFont(new Font("Verdana",30));
                 balan.setTextFill(Color.web("#8BD8BD"));
                
            }
                    
              });
                 Button exit = new Button("Return to Main Menu");

                grid.add(exit,6,10);
                grid.add(space2,6,7);
                exit.setPrefSize(250, 50);
                exit.setBlendMode(BlendMode.ADD);
                exit.setOnAction(new EventHandler<ActionEvent>(){

              @Override 
              public void handle (ActionEvent event){
                    balan.setText("");
             stage.setScene(trans.getScene());
            }

              });
       grid.add(balance,0,0);



     scene = new Scene(grid , 1200, 600,Color.web("#243665"));
  }
  public Scene getScene(){
     return this.scene;
 }

  public void setTransactions(Transactions transactions){
      this.trans=transactions;
  }


}