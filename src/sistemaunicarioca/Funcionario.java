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
public class Funcionario extends Pessoa {
    private float salario;
    private String funcao;

    public Funcionario(float salario, String funcao, String matricula, String nome, int idade, String cpf, String endereco, String sexo, String telefone, String email, String turno) {
        super(matricula, nome, idade, cpf, endereco, sexo, telefone, email, turno);
        this.setSalario(salario);
        this.setFuncao(funcao);
    }

    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public void exibir() {
        System.out.println("Matricula: "+this.getMatricula()+
        "\nNome: "+this.getNome()+
        "\nIdade: "+this.getIdade()+
        "\nSexo: "+this.getSexo()+
        "\nCPF: "+this.getCpf()+
        "\nEndereçoo: "+this.getEndereco()+
        "\nTelefone: "+this.getTelefone()+
        "\nEmail: "+this.getEmail()+
        "\nTurno: "+this.getTurno()+
        "\nFunçao: "+this.getFuncao()+
        "\nSalario: "+this.getSalario());
    }
}
