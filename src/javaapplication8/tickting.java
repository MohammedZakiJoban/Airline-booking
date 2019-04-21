
package javaapplication8;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class tickting extends javax.swing.JFrame {



private String in;

static buying previous;

 
    public tickting(buying p) {
        initComponents();
         setSize(700,700);
         setLocationRelativeTo(null);
         
        setTitle("Tickets buying");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     previous =p;
     
                    Random dice = new Random();
      
  
  
    
  final long    bookingid = 99999999+dice.nextInt();
      

 in = ""+bookingid;
 

    }
    
     



       
       
       
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        from = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        to = new javax.swing.JComboBox();
        adults = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        kids = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox();
        month = new javax.swing.JComboBox();
        year = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        passport = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        f1 = new javax.swing.JTextField();
        f2 = new javax.swing.JTextField();
        f3 = new javax.swing.JTextField();
        f4 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        f5 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        book = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        from.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MY-KLIA", "AUS-SYD", "CHI-PEK", "IND-BOM", "EGY-CAL", " " }));
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });
        jPanel2.add(from);
        from.setBounds(110, 50, 100, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("From");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 50, 90, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Adults");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 200, 80, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("To");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(260, 50, 40, 30);

        to.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MY-KLIA", "AUS-SYD", "CHI-PEK", "IND-BOM", "EGY-CAL", " " }));
        jPanel2.add(to);
        to.setBounds(320, 50, 100, 22);

        adults.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", " " }));
        jPanel2.add(adults);
        adults.setBounds(30, 240, 50, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Childeren");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(150, 200, 80, 20);

        kids.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", " " }));
        jPanel2.add(kids);
        kids.setBounds(160, 240, 50, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Type");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(350, 190, 80, 30);

        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Economy", "First Class", "Business ", " " }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel2.add(type);
        type.setBounds(330, 250, 100, 22);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(30, 480, 120, 25);

        jButton3.setText("Calculate the price");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(30, 280, 140, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Date DD/MM/YY");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 120, 120, 30);

        day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(day);
        day.setBounds(170, 120, 50, 20);

        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March ", "April ", "May ", "June", "July ", "August ", "September ", "October ", "November ", "December " }));
        jPanel2.add(month);
        month.setBounds(250, 120, 100, 22);

        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020" }));
        jPanel2.add(year);
        year.setBounds(370, 120, 70, 22);

        Text.setColumns(20);
        Text.setRows(5);
        jScrollPane2.setViewportView(Text);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(50, 330, 250, 110);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(230, 480, 120, 25);

        jTabbedPane1.addTab("Flight Information", jPanel2);

        jPanel1.setLayout(null);
        jPanel1.add(email);
        email.setBounds(170, 210, 170, 30);
        jPanel1.add(passport);
        passport.setBounds(170, 160, 170, 30);

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname);
        lname.setBounds(170, 110, 170, 30);

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname);
        fname.setBounds(170, 60, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 60, 80, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 110, 70, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Passport No.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 160, 70, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Email ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 210, 80, 14);

        jButton4.setText("Confirm Booking");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(200, 290, 130, 70);

        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Numbers of Passengers");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 120, 150, 14);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("From");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(10, 30, 40, 14);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("To");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(10, 60, 40, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Adults");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 150, 80, 14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Children");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(20, 190, 60, 14);

        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        jPanel3.add(f1);
        f1.setBounds(70, 20, 120, 30);

        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        jPanel3.add(f2);
        f2.setBounds(70, 60, 120, 30);
        jPanel3.add(f3);
        f3.setBounds(80, 150, 110, 30);

        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });
        jPanel3.add(f4);
        f4.setBounds(80, 190, 110, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Total");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(10, 250, 80, 14);

        f5.setColumns(20);
        f5.setRows(5);
        jScrollPane1.setViewportView(f5);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(70, 250, 140, 90);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(360, 50, 230, 360);

        jLabel17.setText("Booking ID");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(360, 20, 70, 16);
        jPanel1.add(book);
        book.setBounds(430, 20, 120, 22);

        jTabbedPane1.addTab("Personal Information", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 90, 650, 580);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/picture.gif"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 10, 110, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

      

        String fr = from.getSelectedItem().toString();
String t = to.getSelectedItem().toString();
String ty = type.getSelectedItem().toString();
String str1 = adults.getSelectedItem().toString();
String str2 = kids.getSelectedItem().toString();
String d = day.getSelectedItem().toString();
String m = month.getSelectedItem().toString();
String y = year.getSelectedItem().toString();

int ad = Integer.parseInt(str1);
int ki = Integer.parseInt(str2);


form f = new form(fr, t, ty,d,m,y,ad,ki);

first fi = new first(fr, t, ty,d,m,y,ad,ki);
business b = new business(fr, t, ty,d,m,y,ad,ki);

form [] a = {fi,b};


//148835319
        if (ty == "Economy")   
Text.setText(f.tax());
        else if (ty == "First Class")
            Text.setText(a[0].tax());
        else
            Text.setText(a[1].tax());
        book.setText(in);
        f1.setText(fr);
        f2.setText(t);
        f3.setText(str1);
        f4.setText(str2);
          if (ty == "Economy")  
            
f5.setText(f.tax());
        else if (ty == "First Class")
            f5.setText(a[0].tax());
        else
            f5.setText(a[1].tax());
      
        
   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Text.setText("");
book.setText("");
 f1.setText("");
 f2.setText("");
 f3.setText("");
 f4.setText("");
 f5.setText("");
      

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

  
 
    String fn = fname.getText();
      
     
        String ln = lname.getText();
        String ps = passport.getText();
  

String em = email.getText();

      
   isAnyEmpty s = new isAnyEmpty();
   
    if(s.isAnyEmpty(fn,ln,ps,em)){
   JOptionPane.showMessageDialog(null, "PLEASE FILL OUT ALL THE FIELD");
}
  
  
     
    


    else{
    

        String fr = from.getSelectedItem().toString();
String t = to.getSelectedItem().toString();
String ty = type.getSelectedItem().toString();
String str1 = adults.getSelectedItem().toString();
String str2 = kids.getSelectedItem().toString();
String d = day.getSelectedItem().toString();
String m = month.getSelectedItem().toString();
String y = year.getSelectedItem().toString();

int ad = Integer.parseInt(str1);
int ki = Integer.parseInt(str2);




      
      form f = new form(fr, t, ty,d,m,y,ad,ki);
      
         
     
      
       try (
             
              PrintWriter out = new PrintWriter (new BufferedWriter
        (new FileWriter (ps+".doc",true )))){
     
          out.println("First Nmae: "+fn );
          out.println("Last Name: " + ln );
          out.println("Passport No.: "+ps);
          out.println("Email : "+em); 
          out.println("Flight Information");
          out.println("BOOKING id"+book.getText());
          out.println("From:" +fr);
          out.println("To:"+ t);
          out.println("Type of Flight: "+ty);
          out.println("Number of passengers");
          out.println("Adulta:"+ad);
          out.println("Children:"+ki);
          out.println("Total:"+f.tax());
          out.println("--------------------------------------");
          out.println();
          
          
          
          JOptionPane.showMessageDialog(this, "booking Saved Successfully\nbooking ID "+book.getText());
          out.close();
      }catch (IOException e ){
          System.out.println(
          "Error writing to file'");
       
      }

    

 

       
          
      
      
      
      
    }
      
    }//GEN-LAST:event_jButton4ActionPerformed

    public  String pass(){
        String s = passport.getText();
        return s;
        
      
        
    }
    public String email(){
        String e = email.getText();
        return e;
        
    }
    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed

    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f2ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   this.setVisible(false);
  previous.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

  

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tickting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tickting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tickting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tickting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tickting(previous).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Text;
    private javax.swing.JComboBox adults;
    private javax.swing.JTextField book;
    private javax.swing.JComboBox day;
    private javax.swing.JTextField email;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JTextField f4;
    private javax.swing.JTextArea f5;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox from;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox kids;
    private javax.swing.JTextField lname;
    private javax.swing.JComboBox month;
    private javax.swing.JTextField passport;
    private javax.swing.JComboBox to;
    private javax.swing.JComboBox type;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables

    private static class MyException extends Exception {

        public MyException(String please_Fill_all_the_form) {
        }
    }
}
