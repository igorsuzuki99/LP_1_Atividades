/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lojinha.Vendedor;

/**
 *
 * @author Fatec
 */
public class VendedorDAO {
    private final Connection connection;
    
    public VendedorDAO (Connection connection){
        this.connection = connection;
    }
    
    public void insert (Vendedor usuario) throws SQLException {
        String sql = "insert into vendedor(nome, codigo, telefone, email, salario) values ('"+usuario.getNome()+"', '"+usuario.getCodigo()+"'"
                + ",'"+usuario.getTelefone()+"','"+usuario.getEmail()+"','"+usuario.getSalario()+"')";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
            
        connection.close();
    }
}
