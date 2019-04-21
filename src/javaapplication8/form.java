
package javaapplication8;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;


public class form {
    
    private String  from,to,type,month,day,year;
    
    private int adults,kids;
   
    
    
    
    
    
    public form ( String f,String t,String ty,String d,String m ,String y, int a,int k){
        
        
        from = f;
        to = t;
        type = ty;
        adults = a;
        kids = k;
        day= d;
        month = m;
        year = y;
     
        
        
        
    }
   
          public void setAdults(int a){
            adults= a;
            
        }
      public int getAdults (){
          return  adults; 
            
        }
           public void setDay(String d){
            day= d;
            
        }
      public String getDay (){
          return  day; 
            
        }
            public void setMonth(String m){
            month= m;
            
        }
      public String getMonth(){
          return  month; 
            
        }
             public void setYear(String y){
            year= y;
            
        }
      public String getYear(){
          return  year; 
            
        }
     
        
              public void setKids(int k){
            kids= k;
            
        }
      public int getKids (){
          return  kids; 
            
        }
    
    
          public void setFrom(String f){
            from= f;
            
        }
      public String getFrom (){
          return  from; 
            
        }
            public void setTo (String t){
            to = t;
            
        }
      public String getTo (){
          return  to; 
            
        }
            public void setType(String ty){
            type = ty;
            
        }
      public String getType (){
          return  type; 
            
        }
  

      public double price(){
          double price = 0;
          
          if (from == "MY-KLIA"){
              switch (to){
              case "AUS-SYD": price =1500;     
              break;
              case "CHI-PEK": price =900;
              break;
              case "IND-BOM": price =700;    
              break;
              case "EGY-CAL": price =1800;
              break;
              default: price = 200;
              }  
          }
          else if (from == "AUS-SYD"){
                switch (to){
              case "MY-KLIA": price =1500;     
              break;
              case "CHI-PEK": price =700;
              break;
              case "IND-BOM": price =900;    
              break;
              case "EGY-CAL": price =2400;
              break;
              default: price = 200;
              } 
          }
               else if (from == "CHI-PEK"){
                switch (to){
              case "MY-KLIA": price =900;     
              break;
              case "AUS-SYD": price =700;
              break;
              case "IND-BOM": price =1000;    
              break;
              case "EGY-CAL": price =2000;
              break;
              default: price = 200;
              } 
          }
                else if (from == "IND-BOM"){
                switch (to){
              case "MY-KLIA": price =700;     
              break;
              case "AUS-SYD": price =900;
              break;
              case "CHI-PEK": price =1000;    
              break;
              case "EGY-CAL": price =2000;
              break;
              default: price = 200;
              } 
          }
                else {
                       switch (to){
              case "MY-KLIA": price =1800;     
              break;
              case "AUS-SYD": price =2400;
              break;
              case "CHI-PEK": price =2000;    
              break;
              case "IND-BOM": price =2000;
              break;
              default: price = 200;
              } 
                    
                }
          
          
      double suma= price * adults; 
      double sumb = (price * kids)/2;
      
      double total = suma+sumb;
      return total;
      }
     
      public String tax (){
          double tax = price()*0.08;
          double total = tax + price();
          String str = "The Fees:"+price()+"\nTax fare:"+tax+"\nTotal:"+total;
          return str;
          
      }
      
      public String toString(){
          
     String str = "Flight Information\n From:\t" + getFrom()+"\n To:\t "+ getTo()+"\n Type of Flight:\t"+getType()
             + "\nNumber of passengers\nAdulta:\t"+getAdults()+"\nChildren:\t"+ getKids()+"\nTotal:\t"+ tax();
     return str;
                  
      }
    
}
