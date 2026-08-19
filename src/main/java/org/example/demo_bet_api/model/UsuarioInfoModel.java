package org.example.demo_bet_api.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
public class UsuarioInfoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usuarioId;
    private String nome;
    private String email;
    private LocalDate dataNasc;

    public UsuarioInfoModel(){}

    public UsuarioInfoModel(Integer UsuarioId, String nome, String dataNasc, String email){
        this.setUsuarioId(getUsuarioId());
        this.setNome(nome);
        this.setEmail(email);
        this.setDataNasc(LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
}
