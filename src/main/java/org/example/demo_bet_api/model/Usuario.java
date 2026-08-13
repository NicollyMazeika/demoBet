package org.example.demo_bet_api.model;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cpf;
    private String senha;

    public Usuario(){
        this.setId(0);
        this.setCpf("");
        this.setSenha(getSenha());

    }

    public Usuario(int id, String cpf, String senha){
        this.setId(id);
        this.setCpf(cpf);
        this.setSenha(senha);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
