/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_Dziekanat;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Pavel
 */
public class Mysql {

    private String url = "jdbc:mysql://localhost/";
    private String login1 = "root";
    private String pass1 = "";
    private String db = "projekt_io?useUnicode=true&characterEncoding=utf8";

    public String[] Login(String login, String pass) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select * from user where login='" + login + "' and pass='" + pass + "'");
            ResultSetMetaData metadata = res.getMetaData();
            int column = metadata.getColumnCount();
            int ile = 0;
            String[] temp = new String[5];
            String status = null, stan, ID = null;
            while (res.next()) {
                ile++;
                for (int i = 0; i < column; i++) {
                    if (i == 1) {
                        temp[2] = res.getString(i + 1);//Status
                    } else if (i == 0) {
                        temp[1] = res.getString(i + 1);//ID
                    } else if (i == 4) {
                        temp[3] = res.getString(i + 1); //imie
                    } else if (i == 5) {
                        temp[4] = res.getString(i + 1); //nazw
                    }
                }
            }

            if (ile != 0) {
                temp[0] = "1";
            } else {
                temp[0] = "0";
            }
            conn.close();
            return temp;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public int Count_ratings(String ID) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select * from ratings where ID_stud=" + ID);
            ResultSetMetaData metadata = res.getMetaData();
            int column = metadata.getColumnCount();
            int ile = 0;
            while (res.next()) {
                ile++;
            }
            conn.close();
            return ile;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String[][] View_ratings(String ID) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select * from Magazyn");
            ResultSetMetaData metadata = res.getMetaData();
            int column = metadata.getColumnCount();
            String temp[][] = new String[2][10];
            while (res.next()) {
                System.out.println(res.getInt(1) + " " + res.getInt(2) + " " + res.getNString(3) + " "
                        + res.getNString(4) + " " + res.getNString(5) + " " + res.getNString(6) + " "
                        + res.getNString(7) + " " + res.getInt(8) + " " + res.getInt(9));
                //for(int i=1;i<=column;i++){
                //System.out.print(res.getNString(i)+" ");
                //}
                //System.out.println(" ");
            }
            conn.close();
            return temp;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    public String Check_index(String ID) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select * from user where login='" + ID + "'");
            ResultSetMetaData metadata = res.getMetaData();
            int column = metadata.getColumnCount();
            int ile = 0;
            while (res.next()) {
                ile++;
            }
            conn.close();
            //return ile;
            System.out.println(ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void Save_student(String login, String pass, String name, String surname) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            String query = "insert into user(status,login,pass,imie,nazwisko) values('student','" + login + "','" + pass + "','" + name + "','" + surname + "')";
            st.executeUpdate(query);

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String[][] View_students(String ID) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select * from ratings where ID_stud=" + ID);
            ResultSetMetaData metadata = res.getMetaData();
            int column = metadata.getColumnCount();
            String temp[][] = new String[Count_student(ID)][3];
            int ile = 0;
            while (res.next()) {
                temp[ile][0] = String.valueOf(res.getInt(2)); //indeks
                temp[ile][1] = res.getNString(3); //przedmiot
                temp[ile][2] = res.getNString(4); //oceny
                ile++;
            }
            conn.close();
            return temp;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    public int Count_students() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select * from user where status='student'");
            ResultSetMetaData metadata = res.getMetaData();
            int column = metadata.getColumnCount();
            int ile = 0;
            while (res.next()) {
                ile++;
            }
            conn.close();
            return ile;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Count_student(String ID) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select * from ratings where ID_stud=" + ID);
            ResultSetMetaData metadata = res.getMetaData();
            int column = metadata.getColumnCount();
            int ile = 0;
            while (res.next()) {
                ile++;
            }
            conn.close();
            return ile;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    

    public String[][] List_students() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select * from user where status='student'");
            ResultSetMetaData metadata = res.getMetaData();
            int column = metadata.getColumnCount();
            String temp[][] = new String[Count_students()][3];
            int ile = 0;
            while (res.next()) {
                temp[ile][0] = res.getNString(3);//nr indeks
                temp[ile][1] = res.getNString(5); //imie
                temp[ile][2] = res.getNString(6);// nazwisko
                ile++;
            }

            conn.close();
            return temp;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //                              MOJE DODATKI DO 'IO'
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //                                                      MOJE DODATKI DO 'IO'
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    public int Count_teachers() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select * from user where status='teacher'");
            ResultSetMetaData metadata = res.getMetaData();
            int column = metadata.getColumnCount();
            int ile = 0;
            while (res.next()) {
                ile++;
            }
            conn.close();
//            System.out.println("teachers count = "+ile);
            return ile;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String[][] Get_teachers() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select * from user where status='teacher'");
            ResultSetMetaData metadata = res.getMetaData();
            int column = metadata.getColumnCount();
            String temp[][] = new String[Count_teachers()][6];
            int i = 0;
            
            while (res.next()) {
                temp[i][0] = String.valueOf(res.getInt(1));//ID
                temp[i][1] = res.getNString(2);//status
                temp[i][2] = res.getNString(3);//login
                temp[i][3] = res.getNString(4);//haslo
                temp[i][4] = res.getNString(5);//imie
                temp[i][5] = res.getNString(6);//nazwisko
                i++;
            }

            conn.close();
            return temp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public String[][] Get_students() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select * from user where status='student'");
            ResultSetMetaData metadata = res.getMetaData();
            int column = metadata.getColumnCount();
            String temp[][] = new String[Count_students()][6];
            int i = 0;
            
            while (res.next()) {
                temp[i][0] = String.valueOf(res.getInt(1));//ID
                temp[i][1] = res.getNString(2);//status
                temp[i][2] = res.getNString(3);//login
                temp[i][3] = res.getNString(4);//haslo
                temp[i][4] = res.getNString(5);//imie
                temp[i][5] = res.getNString(6);//nazwisko
                i++;
            }

            conn.close();
            return temp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void Edit_Data(int id, String st, String log, String pass, String name, String sname) throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement statement = conn.createStatement();
            
            String strSQL = "UPDATE user SET status='"+st+"', login='"+log+"', pass='"+pass+"', imie='"+name+"', nazwisko='"+sname+"' WHERE ID ="+id;
            statement.executeUpdate(strSQL);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        return 0;
    }
    
    public String add_Acc(String s, String l, String p, String n, String sn) throws SQLException {
        if(!l.isEmpty() && !p.isEmpty() && !n.isEmpty() && !sn.isEmpty())
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url + db, login1, pass1);
                Statement statement = conn.createStatement();
                ResultSet res = statement.executeQuery("SELECT login FROM user WHERE login='"+l+"'");
                if(!res.next()){
                    String  strSQL = "INSERT INTO user (status, login, pass, imie, nazwisko) VALUES ('"+s+"','"+l+"','"+p+"','"+n+"','"+sn+"');";
                    statement.executeUpdate(strSQL);
                    conn.close();
                    return "Utworzono nowego użytkownika";
                }else{
                    conn.close();
                    return "Login jest używany";
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "Błąd podczas rejestacji";
            }
        }else{
            return "Wypełnij wszystkie pola";
        }
    }
    
    public void delete_Acc(String id)throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, login1, pass1);
            Statement statement = conn.createStatement();
            String strSQL = "DELETE FROM user WHERE ID ="+id;
            statement.executeUpdate(strSQL);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String get_ID(String id){      // TO mogło być gdzieś indziej, ale wylądowało tu bo tutaj tez działa
        String tmp = "";
        int i = 0;
        
        while(id.charAt(i) != ' '){
            tmp += id.charAt(i);
            i++;}
        
        return tmp ;
    }
}
