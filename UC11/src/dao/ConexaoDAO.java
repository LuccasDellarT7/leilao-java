package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDAO {

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/uc11",
                "root",
                "root"
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}