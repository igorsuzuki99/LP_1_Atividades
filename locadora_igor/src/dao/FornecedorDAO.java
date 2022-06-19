/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lojinha.Fornecedor;
/**
 *
 * @author Fatec
 */
public class FornecedorDAO {
     private final Connection connection;
     
     public FornecedorDAO (Connection connection){
        this.connection = connection;
    }
     
     public void insert (Fornecedor usuario) throws SQLException {
        String sql = "insert into fornecedor(nome, estado, cidade, telefone, email) values ('"+usuario.getNome()+"', '"+usuario.getEstado()+"'"
                + ",'"+usuario.getCidade()+"','"+usuario.getTelefone()+"','"+usuario.getEmail()+"')";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
            
        connection.close();
    }
}
