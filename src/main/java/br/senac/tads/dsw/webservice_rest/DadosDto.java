package br.senac.tads.dsw.webservice_rest;

import java.time.LocalDate;

public class DadosDto {

    private Integer id;
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;

    public DadosDto() {
    }

    public DadosDto(Integer id, String nome, String dataNascimento,
                    String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento);
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}