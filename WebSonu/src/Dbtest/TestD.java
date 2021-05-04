package Dbtest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestD{
	public TestD(String name,String age,String email,String phone,String state, String district, String address1, String address2) {
	

	try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WebDb?user=root&password=root");

        String sql1 = "INSERT INTO WebDatawebdata(W_name, W_age,W_email,W_phone,W_state,W_district,W_address1,W_address2)" + "VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement ps1 = con.prepareStatement(sql1);
        con.setAutoCommit(false);
        ps1.setString(1, name);
        ps1.setString(2, age);
        ps1.setString(3,email);
        ps1.setString(4,phone);
        ps1.setString(5,state);
        ps1.setString(6,district);
        ps1.setString(7,address1);
        ps1.setString(8,address2);

//ps1.setDate(4, date1);
        ps1.addBatch();
        int [] cont = ps1.executeBatch();
        System.out.printf("executed on number",cont);
        con.commit();
        ps1.close();

        con.close();
    }
    catch (Exception e) {
//TODO: handle exception
        System.out.println("error" +e);
    }
}
}


