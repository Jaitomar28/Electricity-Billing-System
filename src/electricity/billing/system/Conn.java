package electricity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///tomar", "root", "#messi@2812#");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}