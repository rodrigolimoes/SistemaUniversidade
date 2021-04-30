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
public class Professor extends Pessoa {
    private float salario;
    private String disciplina;

    public Professor(float salario, String disciplina, String matricula, String nome, int idade, String cpf, String endereco, String sexo, String telefone, String email, String turno) {
        super(matricula, nome, idade, cpf, endereco, sexo, telefone, email, turno);
        this.setSalario(salario);
        this.setDisciplina(disciplina);
    }

    
    

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
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
        "\nSalario: " + this.getSalario()+
        "\nDisciplina: " + this.getDisciplina());
    }
   
    
}
