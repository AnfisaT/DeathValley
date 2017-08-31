package anfisa.apps.userblanklist.DBData;

import anfisa.apps.userblanklist.DBObjects.Account;
import anfisa.apps.userblanklist.DBObjects.User;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Anfisa on 11.08.2017.
 */
public class DBUserAccData {

    public User GetUser(int id) {

        PreparedStatement st = null;
        Connection con = Connect();
        String data = "SELECT*FROM user";
        User User = new User();

        try {
            st = con.prepareStatement(data);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                User.SetUserId(rs.getInt("userId"));
                User.SetName(rs.getString("name"));
                User.SetSureName(rs.getString("sureName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        CloseConnet(con);
        ClosePreparedStatement(st);

        return User;
    }

    public ArrayList<User> AllUsers (){
        PreparedStatement st = null;
        Connection con = Connect();
        String data = "SELECT*FROM user";
        ArrayList<User> AllUsers = new ArrayList<>();

        try{
            st = con.prepareStatement(data);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                User user = new User();
                user.SetUserId(rs.getInt("userId"));
                user.SetName(rs.getString("name"));
                user.SetSureName(rs.getString("sureName"));
                AllUsers.add(user);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        CloseConnet(con);
        ClosePreparedStatement(st);

        return AllUsers;

    }

    public Account GetAccount(int id) {

        PreparedStatement st = null;
        Connection con = Connect();
        String data = "SELECT*FROM account";
        Account Account = new Account();

        try {
            st = con.prepareStatement(data);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                Account.SetUserId(rs.getInt("userId"));
                Account.SetAccount(rs.getInt("account"));
                Account.SetAccountId(rs.getInt("accountId"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        CloseConnet(con);
        ClosePreparedStatement(st);

        return Account;
    }

    public ArrayList<Account> AllAccounts (){
        PreparedStatement st = null;
        Connection con = Connect();
        String data = "SELECT*FROM account";
        ArrayList<Account> AllAccounts = new ArrayList<>();

        try{
            st = con.prepareStatement(data);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Account account = new Account();
                account.SetUserId(rs.getInt("userId"));
                account.SetAccount(rs.getInt("account"));
                account.SetAccountId(rs.getInt("accountId"));
                AllAccounts.add(account);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        CloseConnet(con);
        ClosePreparedStatement(st);

        return AllAccounts;

    }

    public ArrayList<Integer> AccountSums (){

        PreparedStatement st = null;
        Connection con = Connect();
        String data = "SELECT account FROM accountr";
        ArrayList<Integer> Sums = new ArrayList<>();

        try {
            int i;
            st = con.prepareStatement(data);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                i = rs.getInt("account");
                Sums.add(i);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        CloseConnet(con);
        ClosePreparedStatement(st);

        return Sums;
    }



    public Connection Connect (){

        String url = "jdbc:mysql://localhost:3306/MyDb?characterEncoding=utf8";
        String name = "root";
        String password = "root";
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, name, password);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void CloseConnet(Connection con){
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("Close connect Failed");
        }
    }

    public void ClosePreparedStatement (PreparedStatement st){
        try {
            st.close();
        } catch (SQLException e) {
            System.out.println("Close prepare Failed");
        }
    }

}
