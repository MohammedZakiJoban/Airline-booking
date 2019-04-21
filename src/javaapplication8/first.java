/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author MZJ
 */
public class first extends form {
    
    
    public first ( String f,String t,String ty,String d,String m ,String y, int a,int k){
        
      super( f,t,ty,d,m,y,a,k);
      
        
        
        
    }
    public double price(){
          double price = 0;
          
          if (getFrom() == "MY-KLIA"){
              switch (getTo()){
              case "AUS-SYD": price =2250;     
              break;
              case "CHI-PEK": price =1050;
              break;
              case "IND-BOM": price =1500;    
              break;
              case "EGY-CAL": price =2700;
              break;
              default: price = 300;
              }  
          }
          else if (getFrom() == "AUS-SYD"){
                switch (getTo()){
              case "MY-KLIA": price =2750;     
              break;
              case "CHI-PEK": price =1050;
              break;
              case "IND-BOM": price =1300;    
              break;
              case "EGY-CAL": price =3600;
              break;
              default: price = 300;
              } 
          }
               else if (getFrom() == "CHI-PEK"){
                switch (getTo()){
              case "MY-KLIA": price =1300;     
              break;
              case "AUS-SYD": price =1050;
              break;
              case "IND-BOM": price =1500;    
              break;
              case "EGY-CAL": price =3000;
              break;
              default: price = 300;
              } 
          }
                else if (getFrom() == "IND-BOM"){
                switch (getTo()){
              case "MY-KLIA": price =1050;     
              break;
              case "AUS-SYD": price =1300;
              break;
              case "CHI-PEK": price =1500;    
              break;
              case "EGY-CAL": price =3000;
              break;
              default: price = 300;
              } 
          }
                else {
                       switch (getTo()){
              case "MY-KLIA": price =2700;     
              break;
              case "AUS-SYD": price =3600;
              break;
              case "CHI-PEK": price =3000;    
              break;
              case "IND-BOM": price =3000;
              break;
              default: price = 300;
              } 
                    
                }
          
          
      double suma= price * getAdults(); 
      double sumb = (price * getKids())/2;
      
      double total = suma+sumb;
      return total;
      }
    
       public String tax (){
          double tax = price()*0.08;
          double total = tax + price();
          String str = "The Fees:"+price()+"\nTax fare:"+tax+"\nTotal:"+total;
          return str;
          
      }
      
    
}
