package br.com.vdbsistemas.callbeq.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConexao {

    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                    + "databaseName=bdcliente;user=house;password=123456");
            return con;
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }
}
