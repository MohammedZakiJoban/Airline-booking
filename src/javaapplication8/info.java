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
public class info extends form {
    
    private String fname,lname,passport, email;
    
    
    
    public info (String f,String t,String ty,String d,String m ,String y, int a,int k,String fn,String ln,String ps, String em){
        
super(f,t,ty,d,m,y,a,k);
    
      fname = fn;
      lname = ln;
      passport = ps;
      email = em;
    }
    
    
    
    
    
         public void setFname(String fn){
            fname= fn;
            
        }
      public String getFname(){
          return  fname; 
            
        }
         public void setLname(String ln){
            lname= ln;
            
        }
      public String getLname(){
          return  lname; 
            
        }
         public void setPassport(String ps){
            passport= ps;
            
        }
      public String getPassport(){
          return  passport; 
            
        }
         public void setEmail(String em){
            email = em;
            
        }
      public String getEmail(){
          return  email; 
            
        }
      
      public String toString(){
          
          String str = "First Name:"+getFname()+"\nLast Name:"+getLname()+"\nPassport No:"+getPassport()+"\nEmail:"+getEmail
                  ()+super.toString();
          
          return str;
          
          
      }
    
}
