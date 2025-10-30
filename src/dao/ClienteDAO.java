/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author dev07
 */
public class ClienteDAO {   
    private Conexao conexao;
    private Connection conn;
    
    public ClienteDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, cpf_cnpj, telefone, email, tipo_cliente, limite_credito) VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf_cnpj());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getTipo_cliente());
            stmt.setDouble(6, cliente.getLimite_credito());
            
            stmt.execute();
            
            System.out.println("Cliente inserido com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir cliente: " + ex.getMessage());
        }
    }
    
    public List<Cliente> getClientes() {
        String sql = "SELECT * FROM clientes";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql, 
                    ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE);           
            
            ResultSet rs = stmt.executeQuery();
            
            List<Cliente> listaClientes = new ArrayList<>();
            
            while (rs.next()) {
                Cliente c = new Cliente();
                
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCpf_cnpj(rs.getString("cpf_cnpj"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                c.setTipo_cliente(rs.getString("tipo_cliente"));
                c.setLimite_credito(rs.getDouble("limite_credito"));     
                
                listaClientes.add(c);
            }
            
            return listaClientes;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar clientes: " + ex.getMessage());
            return null;
        }
    }
}