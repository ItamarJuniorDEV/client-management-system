/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author dev07
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf_cnpj;
    private String telefone;
    private String email;
    private String tipo_cliente;
    private double limite_credito;

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getTipo_cliente() {
        return tipo_cliente;
    }
    
    public double getLimite_credito() {
        return limite_credito;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }
    
    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
    }
}