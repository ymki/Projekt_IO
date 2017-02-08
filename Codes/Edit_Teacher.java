package IO_Dziekanat;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class Edit_Teacher extends javax.swing.JPanel {
    
    private int teacher_ID;
    
    public Edit_Teacher() {
        initComponents();
        Panel();
    }
    
    private void Panel(){
        Mysql sql = new Mysql();
        
        try {
            String baza[][] = new String[sql.Count_teachers()][6];
            baza = sql.Get_teachers();
            jList_teachers.addItem("[wybierz]");
            
            for (int i = 0; i < sql.Count_teachers(); i++) {
//                System.out.println(i);
                jList_teachers.addItem(baza[i][0] + " " + baza[i][4] + " " + baza[i][5]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Edit_Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jList_teachers = new javax.swing.JComboBox();
        jStatus = new javax.swing.JTextField();
        jLogin = new javax.swing.JTextField();
        jPass = new javax.swing.JTextField();
        jImie = new javax.swing.JTextField();
        jNazwisko = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jRegComm = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jList_teachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jList_teachersActionPerformed(evt);
            }
        });

        jStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStatusActionPerformed(evt);
            }
        });

        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });

        jImie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImieActionPerformed(evt);
            }
        });

        jLabel1.setText("Status:");

        jLabel2.setText("Login:");

        jLabel3.setText("Hasło:");

        jLabel4.setText("Imię:");

        jLabel5.setText("Nazwisko:");

        jButton1.setText("Popraw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Usuń konto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        add.setText("Dodaj użytkownika");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel6.setText("Info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jList_teachers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jNazwisko, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addComponent(jImie, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPass, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLogin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jStatus))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jRegComm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jList_teachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jImie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRegComm)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jImieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jImieActionPerformed

    private void jStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStatusActionPerformed

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLoginActionPerformed

    private void jList_teachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jList_teachersActionPerformed
        String name = jList_teachers.getSelectedItem().toString();
       
        if (name == "[wybierz]") {
        }else{ 
            Mysql sql = new Mysql();
            name = jList_teachers.getSelectedItem().toString();
            String id = sql.get_ID(name);
            teacher_ID = Integer.parseInt(id);
            
            try {
                String baza[][] = new String[sql.Count_teachers()][6];
                baza = sql.Get_teachers();
                
                int a, b;
                a = Integer.parseInt(id);
                
                for(int i=0; i<sql.Count_teachers(); i++){
                    b = Integer.parseInt(baza[i][0]);
                    if(a == b){
                        jStatus.setText(baza[i][1]);
                        jLogin.setText(baza[i][2]);
                        jPass.setText(baza[i][3]);
                        jImie.setText(baza[i][4]);
                        jNazwisko.setText(baza[i][5]);
                      }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Edit_Teacher.class.getName()).log(Level.SEVERE, null, ex);
            }

        }    

    }//GEN-LAST:event_jList_teachersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mysql sql = new Mysql();
        try {
                sql.Edit_Data(teacher_ID, jStatus.getText(), jLogin.getText(),jPass.getText(),jImie.getText(),jNazwisko.getText());
            }catch (SQLException ex) {
                Logger.getLogger(Edit_Teacher.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name = jList_teachers.getSelectedItem().toString();
        
        if (name == "[wybierz]") {
        }else{ 
            Mysql sql = new Mysql();
            name = jList_teachers.getSelectedItem().toString();
            String id = sql.get_ID(name);

            try {
                sql.delete_Acc(id);
            } catch (SQLException ex) {
                Logger.getLogger(Edit_Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
      //  this.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String data[] = new String[5];
        Mysql sql = new Mysql();
        try{
            jLabel6.setText(sql.add_Acc("teacher", jLogin.getText(), jPass.getText(), jImie.getText(), jNazwisko.getText()));}
        catch(SQLException ex){
             Logger.getLogger(Edit_Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jImie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox jList_teachers;
    private javax.swing.JTextField jLogin;
    private javax.swing.JTextField jNazwisko;
    private javax.swing.JTextField jPass;
    private javax.swing.JLabel jRegComm;
    private javax.swing.JTextField jStatus;
    // End of variables declaration//GEN-END:variables
}
