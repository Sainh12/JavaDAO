package org.example;

import org.example.persistence.ConnectionUtil;
import org.example.persistence.entity.EmployeeDAO;
import org.flywaydb.core.Flyway;

import java.sql.SQLException;

public class Main {

    private final static EmployeeDAO employeedao = new EmployeeDAO();

    public static void main(String[] args) {


        try (var Connection = ConnectionUtil.getConnection()){
            System.out.println("Conectado ao banco de dados");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        var flyway = Flyway.configure().dataSource("jdbc:mysql://localhost/empresa","root","H0l1ow_z3r@").load();
        flyway.migrate();
    }
}