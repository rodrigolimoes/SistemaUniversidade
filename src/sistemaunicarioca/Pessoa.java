/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaunicarioca;

/**
 *
 * @author Rodrigo
 */
public abstract class Pessoa{
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private String sexo;
    private String telefone;
    private String email;
    private String turno;
    private String matricula;
    
    public abstract void exibir();
    
    public Pessoa(String matricula,String nome, int idade, String cpf, String endereco, String sexo, String telefone, String email, String turno) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setSexo(sexo);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setTurno(turno);
        this.setMatricula(matricula);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
