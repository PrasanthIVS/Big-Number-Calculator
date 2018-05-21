/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;


import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.math.BigDecimal;
import java.math.BigInteger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    public String num1,num2;
    public BigDecimal number1,number2;
    public String currentOperation;
    private int Result;
    @FXML
    private Label label;
    @FXML
    private Button btnquit;
    @FXML
    private Button btncompute;
    @FXML
    private Button BtnAdd;
    @FXML
    private Button btnsub;
    @FXML
    private Button btnmul;
    @FXML
    private Button btnless;
    @FXML
    private Button btngreater;
    @FXML
    private Button btnequalto;
    @FXML
    private TextField Displayfield1;
    @FXML
    private TextField Displayfield2;
    @FXML
    private TextField Resultfield;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)throws NumberFormatException {
       try{
        String text=Displayfield1.getText();
        ArrayList list1 = new ArrayList();
        for(int i = 0; i<text.length();i++)
      {
          list1.add(text.charAt(i));
      }
        String num1 = list1.toString().replaceAll("\\[|\\]", "").replaceAll(", ","");
         System.out.println(list1);
         System.out.println(num1);
         BigDecimal number1=new BigDecimal(num1);
    
        String text1=Displayfield2.getText();
        ArrayList list2 = new ArrayList();
        for(int i = 0; i< text1.length();i++)
      {
          list2.add(text1.charAt(i));
      }
        String num2 = list2.toString().replaceAll("\\[|\\]", "").replaceAll(", ","");
         System.out.println(list2);
         System.out.println(num2);
         BigDecimal number2=new BigDecimal(num2);
       }
       catch(NumberFormatException ex){
       }
       }
        // TODO
       
    
    @FXML
    private void handleQuitButtonAction(ActionEvent event) {
        Platform.exit();
    }
    @FXML
    private void handleArithmeticAction(ActionEvent event) {
    currentOperation=((Button)event.getSource()).getText(); 
  // label.setText(currentOperation);
}

    @FXML private void handleComputeButtonAction(ActionEvent event) {
     String Text=Displayfield1.getText();
     String Text1=Displayfield2.getText();
     BigDecimal numb1=new BigDecimal(Text);
     BigDecimal numb2=new BigDecimal(Text1);
     BigDecimal sum = new BigDecimal(BigInteger.ZERO);
        switch(currentOperation){
            case "+":
                sum = numb1.add(numb2);
                Resultfield.setText(String.valueOf(sum));
                break;
            case"-":
                sum = numb1.subtract(numb2);
                Resultfield.setText(String.valueOf(sum));
                break;
            case"*":
                sum = numb1.multiply(numb2);
                Resultfield.setText(String.valueOf(sum));
                break;
                
            case "<" :
                int comp=numb2.compareTo(numb1);
                if(comp==1)
                {
                 Resultfield.setText("True");   
                    break;
                }
                if(comp==-1)
                {
                    Resultfield.setText("False");
                    break;
                }
                if(comp==0)
                {
                    Resultfield.setText("False");
                    break;
                }
            
                
            case ">" :
                comp=numb1.compareTo(numb2);
                if(comp==1)
                {
                 Resultfield.setText("True");   
                    break;
                }
                if(comp==-1)
                {
                    Resultfield.setText("False");
                    break;
                }
                if(comp==0)
                {
                    Resultfield.setText("False");
                    break;
                }
                
                
            case "==":
            {
                comp=numb2.compareTo(numb1);
                if(comp==0)
                {
                    Resultfield.setText("True"); 
                    break;
                }
                else
                    Resultfield.setText("False");
                break;
            }
        }
        }
 }

             





    
    

 
    


    
