/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmo;

import static java.lang.System.exit;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author HebaBackar
 */
public class LoginForm {
    
     LoginAuth auth;
    Stage stage;    
    Scene scene;
    Transactions transactions;
    
   public LoginForm (Stage stage){
      this.stage=stage;
        
    }

   
   
   public void prepareScene(){
      
       auth = new LoginAuth();
        
      Button submit = new Button();
        Button exit =new Button();
          submit.setText("Submit");
          exit.setText("Exit");
          Label pinLabel =new Label();
          
                 Label welcome =new Label();
        welcome.setTextFill(Color.web("#FFFFFF"));
        welcome.setText("W E L C O M E");
        welcome.setFont(new Font("Verdana",90));

        pinLabel.setTextFill(Color.web("#8BD8BD"));
          pinLabel.setText("PIN");
              pinLabel.setFont(new Font("Verdana",30));
         final PasswordField pinField = new PasswordField();
         final Label validationLabel = new Label ();
          GridPane grid =new GridPane();
          
           grid.setAlignment(Pos.CENTER);
           grid.add(welcome,0,1);
          grid.add(pinLabel,1,2);
          grid.add(pinField,2,2);
          grid.add(submit,2,3);
           grid.add(exit,2,4);
          grid.add(validationLabel,2,5);

          submit.setBlendMode(BlendMode.ADD);//blend into scene
                 exit.setBlendMode(BlendMode.ADD);
                pinField.setPrefWidth(250);
                  pinField.setPrefHeight(30);

          submit.setPrefSize(250, 30);
          exit.setPrefSize(250, 30);
   submit.setOnAction(new EventHandler<ActionEvent>(){
           @Override
           public void handle (ActionEvent event){
           String pincode = pinField.getText();
             boolean valid=auth.validate(pincode);
             if (valid){
                 validationLabel.setText("");
                 stage.setScene(transactions.getScene());
             }
             else{
                 validationLabel.setText("InValid PIN"+"\n"+"Enter Corrent PIN");
                                  validationLabel.setTextFill(Color.web("#8BD8BD"));

                 validationLabel.setFont(new Font("Verdana",20));
             }
           }  
   });
   exit.setOnAction(new EventHandler<ActionEvent>(){
       
           @Override
           public void handle(ActionEvent quit){
               System.exit(0);
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