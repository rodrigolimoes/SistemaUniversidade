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
public class Aluno extends Pessoa{
    private float mensalidade;
    private String curso;
    private float av1,av2,av3;
    private double media;

    public Aluno(float mensalidade, String curso, String matricula, String nome, int idade, String cpf, String endereco, String sexo, String telefone, String email, String turno,float av1,float av2,float av3,double media) {
        super(matricula, nome, idade, cpf, endereco, sexo, telefone, email, turno);
        this.mensalidade = mensalidade;
        this.setCurso(curso);
        this.setAv1(av1);
        this.setAv2(av2);
        this.setAv3(av3);
        this.setMedia(media);
 
    }
   

    

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public float getAv1() {
        return av1;
    }

    public void setAv1(float av1) {
        this.av1 = av1;
    }

    public float getAv2() {
        return av2;
    }

    public void setAv2(float av2) {
        this.av2 = av2;
    }

    public float getAv3() {
        return av3;
    }

    public void setAv3(float av3) {
        this.av3 = av3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
    @Override
    public void exibir(){
        System.out.println("Matricula: "+this.getMatricula()+
        "\nNome: "+this.getNome()+
        "\nIdade: "+this.getIdade()+
        "\nSexo: "+this.getSexo()+
        "\nCPF: "+this.getCpf()+
        "\nEndereçoo: "+this.getEndereco()+
        "\nTelefone: "+this.getTelefone()+
        "\nEmail: "+this.getEmail()+
        "\nTurno: "+this.getTurno()+
        "\nMensalidade: "+this.getMensalidade()+
        "\nCurso: "+this.getCurso()+
        "\nAv1: "+this.getAv1()+
        "\nAv2: "+this.getAv2()+
        "\nAv3: "+this.getAv3()+
        "\nMedia: "+this.getMedia()+"\n");
    }
    
    }

