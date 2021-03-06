/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.*;
//import Logins.Drivers;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author ashi sinha
 */

class Drivers implements Serializable{
    static ArrayList<Drivers> drr= new ArrayList<Drivers>();
    String name;
    String id;
    String car_id;
    double rating;
    int present_loc;
    int end_loc;
    boolean is_driving;
    String Phone;
    Drivers(){};
    Drivers(String name, String id, String car_id, double rating, int pres_loc, int end_loc, boolean is_driving, String Phone){
        this.name= name;
        this.id= id;
        this.car_id= car_id;
        this.rating= rating;
        present_loc= pres_loc;
        this.end_loc= end_loc;
        this.Phone= Phone;
        drr.add(this);
       String f="data2";
       try{
       FileOutputStream fos= new FileOutputStream(f);
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       oos.writeObject(drr);
       oos.close();
       fos.close();
       
       }
       
       catch(Exception ae){ }
    }
    }

public class Booking_Frame extends javax.swing.JFrame {
    static int s,d;
    static double max_rating=0.0;
    static Drivers dummy=new Drivers();
   // Drivers dummy= new Drivers();
    static double[][] cost= {{0,1,3,4,5,6},{1,0,2,3,4,5,6},{1,2,0,3,4,5,6},{1,2,3,0,4,5,6},{1,2,3,4,0,5,6},{1,2,3,4,5,0,6},{1,2,3,4,5,6,0}};
    static int[][] time= {{0,20000,10000,20000,25000,20000, 32000},{10000,0,20000,30000,13200, 13000, 25000},{20000,10000,0,20000,25000,20000,32000}, {20000,10000,20000,0,25000,20000, 32000},{20000,10000,20000,25000,0,20000, 32000},{20000,10000,20000,25000,20000,0, 32000},{20000,10000,20000,25000,20000,32000,0}};
    /**
     * Creates new form Booking_Frame
     */
    public Drivers getObj(){
        return dummy;
    }
    public Booking_Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpickUp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdrop = new javax.swing.JComboBox<>();
        jconfirm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel1.setText("Book a Ride!!");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 10, true));

        jpickUp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jpickUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thumkunta", "Tirumalagiri", "JBS", "Secunderabad", "Char_Minar", "Banjara Hills", "Madhapur" }));
        jpickUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jpickUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpickUpActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Pick Up");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 51), 2, true));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Drop");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 51), 2, true));
        jLabel3.setOpaque(true);

        jdrop.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jdrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thumkunta", "Tirumalagiri", "JBS", "Secunderabad", "Char_Minar", "Banjara Hills", "Madhapur" }));
        jdrop.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jdrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdropActionPerformed(evt);
            }
        });

        jconfirm.setBackground(new java.awt.Color(204, 204, 204));
        jconfirm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jconfirm.setText("Confirm Booking");
        jconfirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 51), 2, true));
        jconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconfirmActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 51), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpickUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jconfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpickUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jconfirm)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void CreateDriver(){
        Drivers d1=new Drivers("Cello","1234","CAF0001",7.3,1,0,false,"9876543210");
        Drivers d2=new Drivers("Aello","1235","CAF0002",7.7,2,0,false,"9876543211");
        Drivers d3=new Drivers("Bello","1236","CAF0003",7.9,3,0,false, "9876543212");
        Drivers d4=new Drivers("Dello","1237","CAF0003",8.2,5,0,false, "9876543213");
        Drivers d5=new Drivers("Fello","1238","CAF0004",4.5,4,0,false, "9876543214");
        Drivers d6=new Drivers("Wello","1239","CAF0005",9.2,6,0,false, "9876543215");
        Drivers d7=new Drivers("Qello","1240","CAF0006",9.0,1,0,false, "9876543216");
        Drivers d8=new Drivers("Rello","1241","CAF0007",6.9,2,0,false, "9876543217");
        Drivers d9=new Drivers("Tello","1242","CAF0008",7.9,3,0,false, "9876543218");
        Drivers d10=new Drivers("Yello","1243","CAF0009",8.1,4,0,false, "9876543219");
        Drivers d11=new Drivers("Iello","1244","CAF0010",8.4,5,0,false, "9876543220");
        Drivers d12=new Drivers("Pello","1245","CAF0011",7.8,0,0,false, "9876543221");
        Drivers d13=new Drivers("Gello","1246","CAF0012",8.8,6,0,false, "9876543222");
        Drivers d14=new Drivers("Kello","1246","CAF0012",9.3,6,0,false, "9876543223");
    }
    private void jpickUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpickUpActionPerformed
        s= jpickUp.getSelectedIndex();
        CreateDriver();
       //System.out.println(Drivers.drr);
       // d= jdrop.getSelectedIndex();
        
       /* String f="data2";
       ArrayList<Drivers> d1= new ArrayList<>();
       try{
       FileInputStream fis= new FileInputStream(f);
       ObjectInputStream ois=new ObjectInputStream(fis);
       d1= (ArrayList<Drivers>)ois.readObject();
        }
       catch(Exception ae){}
       
       Drivers dummy=null;
       for(Drivers x: d1){
           if(x.present_loc==s){
               if(x.rating>max_rating){
                   max_rating= x.rating;
                   dummy=x;
               }
            
           }
       }*/
       
       
        
       
    }//GEN-LAST:event_jpickUpActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
   public static int getS(){
       return s;
   }
   public static int getD(){
       return d;
   }
   public static void fr(){
       ThankYou_Frame tf= new ThankYou_Frame();
       tf.setVisible(true);
        //close();
   }
    public static void Do(){
       String f="data2";
       ArrayList<Drivers> d1= new ArrayList<>();
       try{
       FileInputStream fis= new FileInputStream(f);
       ObjectInputStream ois=new ObjectInputStream(fis);
       d1= (ArrayList<Drivers>)ois.readObject();
       ois.close();
       fis.close();
        }
       catch(Exception ae){}
       
       
       
       for(Drivers x: d1){
           if(x.present_loc==s){
               if(x.rating>max_rating){
                   max_rating= x.rating;
                   dummy=x;
               }
            
           }
       }    
       Login l= new Login();
       String user= l.getUser();
      // System.out.println(user);
       String f1="data1";
       ArrayList<Customer> a1= new ArrayList<>();
       try{
       FileInputStream fis= new FileInputStream(f1);
       ObjectInputStream ois=new ObjectInputStream(fis);
       a1= (ArrayList<Customer>)ois.readObject();
       ois.close();
       fis.close();
        }
       catch(Exception e){}
       int flag=0;
       double mon=0.0;
       for(Customer x: a1){
           if((x.username).equals(user) ){
               flag=1;
               mon=x.wallet_money;
               if(x.wallet_money>=300.0){
                   JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                   JOptionPane.showMessageDialog(frame,"Congratulaions, " +user+" you have been assigned "+ dummy.name+ "\n Phone number: "+dummy.Phone +"\n Time of ride: "+ time[s][d]+" mins \n Rating of the Driver: "+ max_rating+ "\n Cost: "+ cost[s][d]+"\n Thank you for travelling with us!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                   close();
                   ThankYou_Frame it= new ThankYou_Frame();
                   it.setVisible(true);
                   close();
             
           
               }
               
           }
       }
           
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,"Sorry"+ user+ "!\n You Have Insufficient balance! "+
             "\nCurrnet Balance "+ mon +" Required Minimum balance is 300 INR", "Insufficient Balance", 
            JOptionPane.INFORMATION_MESSAGE);
           
           // System.exit(0);
           
           Wallet_Frame i= new Wallet_Frame();
           i.setVisible(true);
           /*if(i.isEnough){
             JFrame frame11 = new JFrame("JOptionPane showMessageDialog example");
             JOptionPane.showMessageDialog(frame11,"Congratulaions," +user+" you have been assigned "+ dummy.name+ "\n Time of ride: "+ time[s][d]+"00 \n"+
             "\n Rating of the Driver: "+ max_rating+"\n Cost: "+ cost[s][d]+"\n Thank you for travelling with us!", "Congratulations", 
            JOptionPane.INFORMATION_MESSAGE);
            
             ThankYou_Frame tf= new ThankYou_Frame();
             tf.setVisible(true);
          
            close();
            }*/}
          
               
           
      // System.exit(0);
 
    public static void close(){
        System.exit(0);
    }
    private void jconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconfirmActionPerformed
        if(s==d){
           JFrame frame = new JFrame("JOptionPane showMessageDialog example");
           JOptionPane.showMessageDialog(frame,"Please Select different pick up and drop locations. Try again");
           System.exit(0);
           //Login l= new Login();
          // l.setVisible(true);
           
       }
        Do();
       // this.setVisible(false);
       /*String f="data2";
       ArrayList<Drivers> d1= new ArrayList<>();
       try{
       FileInputStream fis= new FileInputStream(f);
       ObjectInputStream ois=new ObjectInputStream(fis);
       d1= (ArrayList<Drivers>)ois.readObject();
        }
       catch(Exception ae){}
       
       Drivers dummy=new Drivers();
       
       for(Drivers x: d1){
           if(x.present_loc==s){
               if(x.rating>max_rating){
                   max_rating= x.rating;
                   dummy=x;
               }
            
           }
       }    
       Login l= new Login();
       String user= l.getUser();
       System.out.println(user);
       String f1="data1";
       ArrayList<Customer> a1= new ArrayList<>();
       try{
       FileInputStream fis= new FileInputStream(f1);
       ObjectInputStream ois=new ObjectInputStream(fis);
       a1= (ArrayList<Customer>)ois.readObject();
        }
       catch(Exception e){}
       for(Customer x: a1){
           if((x.username).equals(user) ){
               if(x.wallet_money>=300.0){
                   JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,"Congratulaions, you have been assigned "+ dummy.name+ "\n Time of ride: "+ time[s][d]+"00 \n"+
             "\n Rating of the Driver: "+ max_rating+"\n Cost: "+ cost[s][d]+"\n Thank you for travelling with us!", "Congratulations", 
            JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
               }
           }
           else{
               JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,"Sorry"+ x.name+ "!\n You Have Insufficient balance! "+
             "\nCurrnet Balance "+ x.wallet_money+" Required Minimum balance is 300 INR", "Insufficient Balance", 
            JOptionPane.INFORMATION_MESSAGE);
            Wallet_Frame i= new Wallet_Frame();
            i.setVisible(true);
            System.exit(0);
           }
       }
            /* JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,"Congratulaions, you have been assigned "+ dummy.name+ "\n Time of ride: "+ time[s][d]+"00 \n"+
             "\n Rating of the Driver: "+ max_rating+"\n Cost: "+ cost[s][d]+"\n Thank you for travelling with us!", "Congratulations", 
            JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);*/
        
    }//GEN-LAST:event_jconfirmActionPerformed

    private void jdropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdropActionPerformed
        d= jdrop.getSelectedIndex();
    }//GEN-LAST:event_jdropActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Booking_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jconfirm;
    private javax.swing.JComboBox<String> jdrop;
    private javax.swing.JComboBox<String> jpickUp;
    // End of variables declaration//GEN-END:variables
    private void systemExit1(){
        WindowEvent win= new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    }
}
