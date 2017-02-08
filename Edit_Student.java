package IO_Dziekanat;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Edit_Student extends javax.swing.JPanel {

    int student_ID;
    public Edit_Student() {
        initComponents();
        Panel();
    }
    
    private void Panel(){
        Mysql sql = new Mysql();
        
        try {
            String baza[][] = new String[sql.Count_students()][6];
            baza = sql.Get_students();
            jList_students.addItem("[wybierz]");
            
            for (int i = 0; i < sql.Count_students(); i++) {
//                System.out.println(i);
                jList_students.addItem(baza[i][0] + " " + baza[i][4] + " " + baza[i][5]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Edit_Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jList_students = new javax.swing.JComboBox();
        jPass = new javax.swing.JTextField();
        jImie = new javax.swing.JTextField();
        jNazwisko = new javax.swing.JTextField();
        jLogin = new javax.swing.JTextField();
        jStatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Status:");

        jLabel2.setText("Login:");

        jLabel3.setText("Hasło:");

        jLabel4.setText("Imię:");

        jLabel5.setText("Nazwisko:");

        jList_students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jList_studentsActionPerformed(evt);
            }
        });

        jStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStatusActionPerformed(evt);
            }
        });

        jButton1.setText("Popraw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDelete.setText("Usuń konto");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jButton2.setText("Dodaj użytkownika");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jList_students, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jImie, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(236, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jList_students, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jImie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mysql sql = new Mysql();
        try {
                sql.Edit_Data(student_ID, jStatus.getText(), jLogin.getText(),jPass.getText(),jImie.getText(),jNazwisko.getText());
            }catch (SQLException ex) {
                Logger.getLogger(Edit_Teacher.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList_studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jList_studentsActionPerformed
        String name = jList_students.getSelectedItem().toString();
       
        if (name == "[wybierz]") {
        }else{ 
            Mysql sql = new Mysql();
            name = jList_students.getSelectedItem().toString();
            String id = sql.get_ID(name);
            student_ID = Integer.parseInt(id);
            
            try {
                String baza[][] = new String[sql.Count_students()][6];
                baza = sql.Get_students();
                
                int a, b;
                a = Integer.parseInt(id);
                
                for(int i=0; i<sql.Count_students(); i++){
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
                Logger.getLogger(Edit_Student.class.getName()).log(Level.SEVERE, null, ex);
            }

        }    
    }//GEN-LAST:event_jList_studentsActionPerformed

    private void jStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStatusActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        String name = jList_students.getSelectedItem().toString();
        
        if (name == "[wybierz]") {
        }else{ 
            Mysql sql = new Mysql();
            name = jList_students.getSelectedItem().toString();
            String id = sql.get_ID(name);

            try {
                sql.delete_Acc(id);
            } catch (SQLException ex) {
                Logger.getLogger(Edit_Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        this.revalidate();
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String data[] = new String[5];
        Mysql sql = new Mysql();
        try{
            jLabel6.setText(sql.add_Acc("student", jLogin.getText(), jPass.getText(), jImie.getText(), jNazwisko.getText()));}
        catch(SQLException ex){
             Logger.getLogger(Edit_Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jImie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox jList_students;
    private javax.swing.JTextField jLogin;
    private javax.swing.JTextField jNazwisko;
    private javax.swing.JTextField jPass;
    private javax.swing.JTextField jStatus;
    // End of variables declaration//GEN-END:variables
}
