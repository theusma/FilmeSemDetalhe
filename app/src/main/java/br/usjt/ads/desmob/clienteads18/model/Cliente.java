package br.usjt.ads.desmob.clienteads18.model;

import java.io.Serializable;

public class Cliente implements Serializable {

    private int id;
    private String nome, email, diretor, data;

    public Cliente(int id, String nome, String email, String diretor, String data) {

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.diretor = diretor;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDiretor(){return diretor;}

    public void setDiretor(String diretor) {this.diretor = diretor;}

    public String getData(){return data;}

    public void setdata(String data) {this.data = data;}

    public String getFigura(){

        String figura = email.replace('@', '_');
        return figura.replace('.', '_');

    }


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}