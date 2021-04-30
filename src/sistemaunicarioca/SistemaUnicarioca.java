/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaunicarioca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Limões da Silva, Eduardo Fialho dos Santos, 
 * Matheus Saldanha Coelho, Aline Raquel Scheffel, Fernando Sant? Anna Gonçalves
 */

public  class SistemaUnicarioca {
    static String curso,nome,cpf,endereco,sexo,telefone,email,turno,mtr;//variavel temp
        static int idade;//variavel temp
        static float mens,av1,av2,av3;//variavel temp
        static double media;//variavel temp
        static int condicao;//numero de cadastro
        static int loop=1;//Variavel do do{}while(); 
        static int opcao,opMenu,opMenu2,opMenu3,opMenu4,opMenu5,opMenu6;// variaveis para controole do switch
        static Scanner ler= new Scanner(System.in);
        
       static ArrayList<Aluno> cadastroAluno= new ArrayList<Aluno>();
      static  ArrayList<Professor> cadastroProfessor= new ArrayList<Professor>();
       static ArrayList<Funcionario> cadastroFuncionario = new ArrayList<Funcionario>();
       
    public static double calculo(float x, float y, float z){
        double a,b,c = 0;
	a = x;
	b = y;
	c = z;
        double calculo =0;
	if((a>=b) & (a>=c)){
		if(b>=c)
			calculo = (a+b)/2;
		else
			calculo = (a+c)/2;
	}
	if((b>=a) & (b>=c)){
		if(a>=c)
			calculo = (a+b)/2;
		else
			calculo = (b+c)/2;
	}
	if((c>=b) & (c>=a)){
		if(b>=a)
			calculo = (c+b)/2;
		else
			calculo = (a+c)/2;
	}
	return calculo;
        
    }//Calcula a media somando as duas maiores notas entre AV1, AV2 e AV3, e divide por 2.
    public static void cadastroPadrao(){
                   //  try{
                            System.out.println("Digite o Nome:");
                            nome=ler.nextLine();
                            System.out.println("Digite Idade:");
                            idade=ler.nextInt();
                            ler.nextLine();
                            System.out.println("Digite cpf:");
                            cpf=ler.nextLine();
                            System.out.println("Digite Endereço:");
                            endereco= ler.nextLine();
                            System.out.println("Digite Sexo:");
                            sexo= ler.nextLine();
                            System.out.println("Digite Telefone:");
                            telefone= ler.nextLine();
                            System.out.println("Digite Email:");
                            email=ler.nextLine();
                            System.out.println("Digite Turno:");
                            turno= ler.nextLine();
                    //  }catch(Exception e){
                   //      System.out.println("Tipo de dado errado");
                   //   }
    }
    public static void realizaCadastro(){
                            
                            if(opMenu==1){
                                System.out.println("Digite quantos alunos deseja Cadastrar:");
                                condicao=ler.nextInt();
                                ler.nextLine();
                                for(int i=0;i<condicao;i++){
                                System.out.println("Digite Matricula:");
                                mtr= ler.nextLine();
                                if(i!=0){
                                String aux=  cadastroAluno.get(i-1).getMatricula();
                                    if(aux.equals(mtr)){
                                    System.out.println("Matricula ja foi cadastrada");
                                    break;}}
                               // cadastropadrao();
                             //  try{
                                   cadastroPadrao();
                                System.out.println("Digite Curso:");
                                curso= ler.nextLine();
                                System.out.println("Digite Mensalidade:");
                                mens= ler.nextFloat();
                                System.out.println("Digite Av1: ");
                                av1=ler.nextFloat();
                                System.out.println("Digite Av2: ");
                                av2=ler.nextFloat();
                                System.out.println("Digite Av3: ");
                                av3=ler.nextFloat();
                                media= calculo(av1,av2,av3);
                             //  }catch(Exception e){
                             //    System.out.println("Tipo de dado errado");
                             //  }
                                cadastroAluno.add(new Aluno(mens,curso,mtr,nome,idade,cpf,endereco,sexo,telefone,email,turno,av1,av2,av3,media));
                                ler.nextLine();
                                    if ((i+1)==condicao) {
                                        System.out.println("\n------------"+
                                                "Cadastros Registrados."+"------------\n");
                                    } else {
                                        System.out.println("\n------------\n");
                                    }
                                }
                            }
                            if(opMenu==2){
                            System.out.println("Digite quantos Professores deseja Cadastrar:");
                            condicao=ler.nextInt();
                            ler.nextLine();
                            for(int i=0;i<condicao;i++){
                            System.out.println("Digite Matricula:");
                            mtr= ler.nextLine();
                            if(i!=0){
                            String aux=  cadastroProfessor.get(i-1).getMatricula();
                                if(aux.equals(mtr)){
                                System.out.println("Matricula ja foi cadastrada");
                                break;
                            }
                            }
                            cadastroPadrao();
                          //  try{
                            System.out.println("Digite Disciplina:");
                            curso= ler.nextLine();
                            System.out.println("Digite Salario:");
                            mens= ler.nextFloat();
                          //  }catch(Exception e){
                         //   System.out.println("Tipo de dado errado");
                          
                          //    }
                            cadastroProfessor.add(new Professor(mens,curso,mtr,nome,idade,cpf,endereco,sexo,telefone,email,turno));
                            ler.nextLine();
                            if ((i+1)==condicao) {
                                    System.out.println("\n------------"+
                                            "Cadastros Registrados."+"------------\n");
                                } else {
                                    System.out.println("\n------------\n");
                                }
                            }
                            }
                            if(opMenu==3){
                            System.out.println("Digite quantos Funcionarios deseja Cadastrar:");
                            condicao=ler.nextInt();
                            ler.nextLine();
                            for(int i=0;i<condicao;i++){
                            System.out.println("Digite Matricula:");
                            mtr= ler.nextLine();
                            if(i!=0){
                            String aux=  cadastroFuncionario.get(i-1).getMatricula();
                                if(aux.equals(mtr)){
                                System.out.println("Matricula ja foi cadastrada");
                                break;
                            }
                            }
                            cadastroPadrao();
                          // try{
                            System.out.println("Digite Função:");
                            curso= ler.nextLine();
                            System.out.println("Digite Salario:");
                            mens= ler.nextFloat();
                          //  }catch(Exception e){
                         //   System.out.println("Tipo de dado errado");
                          //  }
                            cadastroFuncionario.add(new Funcionario(mens,curso,mtr,nome,idade,cpf,endereco,sexo,telefone,email,turno));
                            ler.nextLine();
                            if ((i+1)==condicao) {
                                    System.out.println("\n------------"+
                                            "Cadastros Registrados."+"------------\n");
                                } else {
                                    System.out.println("\n------------\n");
                                }
                            }
                            }
    }/*Realiza o cadastro utilizando variaveis temporarias e alocando no construtor de Professor, Aluno e Funcionario, 
    que herdam atributos da superclasse Pessoa.*/
    public static void Consulta(){
        if(opMenu3==1){ 
        System.out.println("\n----------------Informe a matricula desejada:----------------\n");
                        mtr= ler.nextLine();
                            if (getPesquisaAluno(mtr)<0) {
                             System.out.println("\n----------------Cadastro não foi encontrado----------------\n"); 
                            } else {
                            cadastroAluno.get(getPesquisaAluno(mtr)).exibir();
                            excluirCadastro();
                            }
        }else if(opMenu3==2){
            System.out.println("\n----------------Informe a matricula desejada:----------------\n");
                        mtr= ler.nextLine();
                            if (getPesquisaProfessor(mtr)<0) {
                             System.out.println("\n----------------Cadastro não foi encontrado----------------\n"); 
                            } else {
                            cadastroProfessor.get(getPesquisaProfessor(mtr)).exibir();
                            excluirCadastro();
                            }
        
        }else if(opMenu3==3){
            System.out.println("\n----------------Informe a matricula desejada:----------------\n");
                        mtr= ler.nextLine();
                            if (getPesquisaFuncionario(mtr)<0) {
                             System.out.println("----------------Cadastro não foi encontrado----------------\n"); 
                            } else {
                            cadastroFuncionario.get(getPesquisaFuncionario(mtr)).exibir();
                            excluirCadastro();
                            }
        }
    }
    public static void excluirCadastro (){
                            System.out.println("Deseja excluir cadastro?");
                            System.out.println("\n[1]- Excluir cadastro\n"+"[2]- Voltar\n");
                            opMenu4= ler.nextInt();
    }
    private static int getPesquisaAluno(String item){
        for(int i=0;i<cadastroAluno.size();i++){
            if(cadastroAluno.get(i).getMatricula().equalsIgnoreCase(item)){
               return i; 
            }
        }
        return -1;
    }
    private static int getPesquisaProfessor(String item){
        for(int i=0;i<cadastroProfessor.size();i++){
            if(cadastroProfessor.get(i).getMatricula().equalsIgnoreCase(item)){
               return i; 
            }
        }
        return -1;
    }
    private static int getPesquisaFuncionario(String item){
        for(int i=0;i<cadastroFuncionario.size();i++){
            if(cadastroFuncionario.get(i).getMatricula().equalsIgnoreCase(item)){
               return i; 
            }
        }
        return -1;
    }
    public static void Menu(){
        System.out.println("Menu");
        System.out.println("[1]- Cadastrar");
        System.out.println("[2]- Exibir");
        System.out.println("[3]- Pesquisar/Excluir");
        System.out.println("[4]- Editar");
        System.out.println("[0]- Sair");
        System.out.println("Digite a opção: ");
    }
    public static void MenuCadastro(){
        System.out.println("Cadastrar:");
        System.out.println("[1]- Aluno");
        System.out.println("[2]- Professor");
        System.out.println("[3]- Funcionario");
        System.out.println("[0]- Sair");
        System.out.println("Digite a opção: ");
    }
    public static void MenuExibir(){
        System.out.println("Exibir");
        System.out.println("[1]- Aluno");
        System.out.println("[2]- Professor");
        System.out.println("[3]- Funcionario");
        System.out.println("[0]- Sair");
        System.out.println("Digite a opção: ");
        
    }
    public static void MenuPesquisar(){
        System.out.println("Pesquisar");
        System.out.println("[1]- Aluno");
        System.out.println("[2]- Professor");
        System.out.println("[3]- Funcionario");
        System.out.println("[0]- Sair");
        System.out.println("Digite a opção: ");
    }
    public static void MenuEscolher(){
        System.out.println("[1]- Nome");
        System.out.println("[2]- Idade");
        System.out.println("[3]- Sexo");
        System.out.println("[4]- CPF");
        System.out.println("[5]- Endereco");
        System.out.println("[6]- Telefone");
        System.out.println("[7]- Email");
        System.out.println("[8]- Turno");
    }
    public static void MenuEditar(){
        System.out.println("Editar:");
        System.out.println("[1]- Aluno");
        System.out.println("[2]- Professor");
        System.out.println("[3]- Funcionario");
        System.out.println("[0]- Sair");
        System.out.println("Digite a opção: ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        do{
   try{
                    Menu();
                    opcao=ler.nextInt();
                        switch(opcao){ 
                            case 1://Cadastro
                                MenuCadastro();
                                opMenu=ler.nextInt();
                                ler.nextLine();
                                switch(opMenu){ 
                                 case 1://Cadastro Aluno
                                 realizaCadastro();
                                 break;
                                 case 2://Cadastro Professor
                                 realizaCadastro();
                                 break;
                                 case 3://Cadastro Funcionário
                                 realizaCadastro();
                                 break;
                                 case 0:
                                 break;
                                            }
                            break;
            case 2://Exibir
                MenuExibir();
                opMenu2=ler.nextInt();
                switch(opMenu2){
                    case 1://Exibir aluno
                System.out.println("----------------");
                System.out.println("Foram cadastrados " + cadastroAluno.size()+" Alunos");
                for(int i=0;i<cadastroAluno.size();i++){
                System.out.println("----------------\n");
                System.out.println("Aluno  "+(i+1)+" :");
                cadastroAluno.get(i).exibir();
                }
                System.out.println("----------------Fim de Exibição----------------\n");
                break;
                    case 2://Exibir Professor
                System.out.println("----------------");
                System.out.println("Foram cadastrados " + cadastroProfessor.size()+" Professores");
                for(int i=0;i<cadastroProfessor.size();i++){
                System.out.println("----------------\n");
                System.out.println("Professor  "+(i+1)+" :");
                cadastroProfessor.get(i).exibir();
                }
                System.out.println("----------------Fim de Exibição----------------\n");
                    break;
                    case 3://Exibir Funcionario
                 System.out.println("----------------");
                 System.out.println("Foram cadastrados " + cadastroFuncionario.size()+" Funcionarios");
                 for(int i=0;i<cadastroFuncionario.size();i++){
                 System.out.println("----------------\n");
                 System.out.println("Funcionario  "+(i+1)+" :");
                 cadastroFuncionario.get(i).exibir();
                 }
                        System.out.println("\n----------------Fim de Exibição----------------\n");
                    break;
                    case 0:
                    break;
                }
            break;
            case 3://Pesquisar
                MenuPesquisar();
                opMenu3= ler.nextInt();
                ler.nextLine();
                switch(opMenu3){
                    case 1://Pesquisar aluno
                        Consulta();
                            switch(opMenu4){
                                case 1://Sim
                                    cadastroAluno.remove(getPesquisaAluno(mtr));
                                    System.out.println("\n----------------Aluno Excluido----------------\n");
                                    break;
                                case 2://Não
                                    break;
                            }
                        break;
                    case 2://Pesquisar o professor
                        Consulta();
                            switch(opMenu4){
                                case 1://Sim
                                    cadastroProfessor.remove(getPesquisaProfessor(mtr));
                                    System.out.println("\n----------------Professor Excluido----------------\n");
                                    break;
                                case 2://Não
                                    break;
                            }
                        break;
                    case 3://Pesquisar Funcionario
                        Consulta();
                            switch(opMenu4){
                                case 1://sim
                                    cadastroFuncionario.remove(getPesquisaFuncionario(mtr));
                                    System.out.println("\n----------------Funcionario Excluido----------------\n");
                                    break;
                                case 2://nao
                                    break;
                            }
                        break;
                }
             break;
            case 4://editar
               MenuEditar();
                opMenu5=ler.nextInt();
                ler.nextLine();
                switch(opMenu5){ 
                    case 1://Editar aluno
                        System.out.println("\n----------------Informe a matricula desejada:----------------\n");
                        mtr= ler.nextLine();
                        if (getPesquisaAluno(mtr)<0) {
                             System.out.println("----------------Cadastro não foi encontrado----------------\n"); 
                            } else {
                            cadastroAluno.get(getPesquisaAluno(mtr)).exibir();
                            }
                        System.out.println("\n----------------Digite a informação para ser trocada:----------------\n");
                        MenuEscolher();
                        System.out.println("[9]- Mensalidade");
                        System.out.println("[10]- Curso");
                        System.out.println("[11]- Av1");
                        System.out.println("[12]- Av2");
                        System.out.println("[13]- Av3");
                        System.out.println("opção:\n");
                        opMenu6= ler.nextInt();
                        ler.nextLine();
                        switch(opMenu6){
                            case 1://nome
                                System.out.println("Nome atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getNome());
                                System.out.println("Digite o novo nome: ");
                                nome=ler.nextLine();
                                cadastroAluno.get(getPesquisaAluno(mtr)).setNome(nome);
                                break;
                            case 2://idade
                                System.out.println("Idade atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getIdade());
                                System.out.println("Nova idade: ");
                                idade=ler.nextInt();
                                cadastroAluno.get(getPesquisaAluno(mtr)).setIdade(idade);
                                break;
                            case 3://sexo
                                System.out.println("Sexo atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getSexo());
                                System.out.println("Nova Sexo: ");
                                sexo=ler.nextLine();
                                cadastroAluno.get(getPesquisaAluno(mtr)).setSexo(sexo);
                                break;
                            case 4://cpf
                                System.out.println("Cpf atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getCpf());
                                System.out.println("Nova CPF: ");
                                cpf=ler.nextLine();
                                
                                cadastroAluno.get(getPesquisaAluno(mtr)).setCpf(cpf);
                                break;
                            case 5://endereco
                                System.out.println("Endereço atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getEndereco());
                                System.out.println("Nova Endereço: ");
                                endereco=ler.nextLine();
                                
                                cadastroAluno.get(getPesquisaAluno(mtr)).setEndereco(endereco);
                                 break;
                            case 6://telefone
                                System.out.println("Telefone atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getTelefone());
                                System.out.println("Nova Telefone: ");
                                telefone=ler.nextLine();
                                
                                cadastroAluno.get(getPesquisaAluno(mtr)).setTelefone(telefone);
                                 break;
                            case 7://email
                                System.out.println("Email atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getEmail());
                                System.out.println("Nova Email: ");
                                email=ler.nextLine();
                                
                                cadastroAluno.get(getPesquisaAluno(mtr)).setEmail(email);
                                 break;
                            case 8://turno
                                System.out.println("Turno atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getTurno());
                                System.out.println("Nova Turno: ");
                                turno=ler.nextLine();
                                
                                cadastroAluno.get(getPesquisaAluno(mtr)).setTurno(turno);
                                  break;
                            case 9://mensalidade
                                System.out.println("Mensalidade atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getMensalidade());
                                System.out.println("Nova Mensalidade: ");
                                mens=ler.nextFloat();
                                
                                cadastroAluno.get(getPesquisaAluno(mtr)).setMensalidade(mens);
                                  break;
                            case 10://curso
                                System.out.println("Curso atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getCurso());
                                System.out.println("Nova Curso: ");
                                curso=ler.nextLine();
                                
                                cadastroAluno.get(getPesquisaAluno(mtr)).setCurso(curso);
                                  break;
                            case 11://av1
                                System.out.println("Av1 atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getAv1());
                                System.out.println("Nova nota av1:");
                                av1=ler.nextFloat();
                                cadastroAluno.get(getPesquisaAluno(mtr)).setAv1(av1);
                                av2=cadastroAluno.get(getPesquisaAluno(mtr)).getAv2();
                                av3= cadastroAluno.get(getPesquisaAluno(mtr)).getAv3();
                                media= calculo(av1,av2,av3);
                                cadastroAluno.get(getPesquisaAluno(mtr)).setMedia(media);
                                  break;
                            case 12://av2
                                System.out.println("Av2 atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getAv2());
                                System.out.println("Nova nota Av2:");
                                av2=ler.nextFloat();
                                cadastroAluno.get(getPesquisaAluno(mtr)).setAv3(av2);
                                av1=cadastroAluno.get(getPesquisaAluno(mtr)).getAv1();
                                av3= cadastroAluno.get(getPesquisaAluno(mtr)).getAv3();
                                media= calculo(av1,av2,av3);
                                cadastroAluno.get(getPesquisaAluno(mtr)).setMedia(media);
                                 break;
                            case 13://av3
                                System.out.println("Av3 atual: "
                                + cadastroAluno.get(getPesquisaAluno(mtr)).getAv1());
                                System.out.println("Nova nota Av3:");
                                av3=ler.nextFloat();
                                cadastroAluno.get(getPesquisaAluno(mtr)).setAv3(av3);
                                av2=cadastroAluno.get(getPesquisaAluno(mtr)).getAv2();
                                av1= cadastroAluno.get(getPesquisaAluno(mtr)).getAv1();
                                media= calculo(av1,av2,av3);
                                cadastroAluno.get(getPesquisaAluno(mtr)).setMedia(media);
                                 break;

                        }
                        System.out.println("\n----------------Dados Atualizados----------------\n");
                        cadastroAluno.get(getPesquisaAluno(mtr)).exibir();
                        break;
                    case 2://Editar Professor
                        System.out.println("\n----------------Informe a matricula desejada:----------------\n");
                        mtr= ler.nextLine();
                        if (getPesquisaProfessor(mtr)<0) {
                             System.out.println("----------------Cadastro não foi encontrado----------------\n"); 
                            } else {
                            cadastroProfessor.get(getPesquisaProfessor(mtr)).exibir();
                            }
                        System.out.println("\n----------------Digite a informação para ser trocada:----------------\n");
                        MenuEscolher();
                        System.out.println("[9]- Salario");
                        System.out.println("[10]- Disciplina");
                        System.out.println("opção:\n");
                        opMenu6= ler.nextInt();
                        ler.nextLine();
                        switch(opMenu6){
                            case 1://nome
                                System.out.println("Nome atual: "
                                + cadastroProfessor.get(getPesquisaProfessor(mtr)).getNome());
                                System.out.println("Digite o novo nome: ");
                                nome=ler.nextLine();
                                cadastroProfessor.get(getPesquisaProfessor(mtr)).setNome(nome);
                                break;
                            case 2://idade
                                System.out.println("Idade atual: "
                                + cadastroProfessor.get(getPesquisaProfessor(mtr)).getIdade());
                                System.out.println("Nova idade: ");
                                idade=ler.nextInt();
                                cadastroProfessor.get(getPesquisaProfessor(mtr)).setIdade(idade);
                                break;
                            case 3://sexo
                                System.out.println("Sexo atual: "
                                + cadastroProfessor.get(getPesquisaProfessor(mtr)).getSexo());
                                System.out.println("Nova Sexo: ");
                                sexo=ler.nextLine();
                                cadastroProfessor.get(getPesquisaProfessor(mtr)).setSexo(sexo);
                                break;
                            case 4://cpf
                                System.out.println("Cpf atual: "
                                + cadastroProfessor.get(getPesquisaProfessor(mtr)).getCpf());
                                System.out.println("Nova CPF: ");
                                cpf=ler.nextLine();
                                
                                cadastroProfessor.get(getPesquisaProfessor(mtr)).setCpf(cpf);
                                break;
                            case 5://endereco
                                System.out.println("Endereço atual: "
                                + cadastroProfessor.get(getPesquisaProfessor(mtr)).getEndereco());
                                System.out.println("Nova Endereço: ");
                                endereco=ler.nextLine();
                                
                                cadastroProfessor.get(getPesquisaProfessor(mtr)).setEndereco(endereco);
                                 break;
                            case 6://telefone
                                System.out.println("Telefone atual: "
                                + cadastroProfessor.get(getPesquisaProfessor(mtr)).getTelefone());
                                System.out.println("Nova Telefone: ");
                                telefone=ler.nextLine();
                                
                                cadastroProfessor.get(getPesquisaProfessor(mtr)).setTelefone(telefone);
                                 break;
                            case 7://email
                                System.out.println("Email atual: "
                                + cadastroProfessor.get(getPesquisaProfessor(mtr)).getEmail());
                                System.out.println("Novo Email: ");
                                email=ler.nextLine();
                                
                                cadastroProfessor.get(getPesquisaProfessor(mtr)).setEmail(email);
                                 break;
                            case 8://turno
                                System.out.println("Turno atual: "
                                + cadastroProfessor.get(getPesquisaProfessor(mtr)).getTurno());
                                System.out.println("Novo Turno: ");
                                turno=ler.nextLine();
                                
                                cadastroProfessor.get(getPesquisaProfessor(mtr)).setTurno(turno);
                                  break;
                            case 9://salario
                                System.out.println("Salario atual: "
                                + cadastroProfessor.get(getPesquisaProfessor(mtr)).getSalario());
                                System.out.println("Novo Salario: ");
                                mens=ler.nextFloat();
                                
                                cadastroProfessor.get(getPesquisaProfessor(mtr)).setSalario(mens);
                                  break;
                            case 10://disciplina
                                System.out.println("Disciplina atual: "
                                + cadastroProfessor.get(getPesquisaProfessor(mtr)).getDisciplina());
                                System.out.println("Nova Curso: ");
                                curso=ler.nextLine();
                                
                                cadastroProfessor.get(getPesquisaProfessor(mtr)).setDisciplina(curso);
                                  break;
                        }
                        System.out.println("\n----------------Dados Atualizados----------------\n");
                        cadastroProfessor.get(getPesquisaProfessor(mtr)).exibir();
                        break;
                    case 3://Editar Funcionario
                        System.out.println("\n----------------Informe a matricula desejada:----------------\n");
                        mtr= ler.nextLine();
                        if (getPesquisaFuncionario(mtr)<0) {
                             System.out.println("----------------Cadastro não foi encontrado----------------\n"); 
                            } else {
                            cadastroFuncionario.get(getPesquisaFuncionario(mtr)).exibir();
                            }
                        System.out.println("\n----------------Digite a informação para ser trocada:----------------\n");
                        MenuEscolher();
                        System.out.println("[9]- Salario");
                        System.out.println("[10]- função");
                        System.out.println("opção:\n");
                        opMenu6= ler.nextInt();
                        ler.nextLine();
                        switch(opMenu6){
                            case 1://nome
                                System.out.println("Nome atual: "
                                + cadastroFuncionario.get(getPesquisaFuncionario(mtr)).getNome());
                                System.out.println("Digite o novo nome: ");
                                nome=ler.nextLine();
                                cadastroFuncionario.get(getPesquisaFuncionario(mtr)).setNome(nome);
                                break;
                            case 2://idade
                                System.out.println("Idade atual: "
                                + cadastroFuncionario.get(getPesquisaFuncionario(mtr)).getIdade());
                                System.out.println("Nova idade: ");
                                idade=ler.nextInt();
                                cadastroFuncionario.get(getPesquisaFuncionario(mtr)).setIdade(idade);
                                break;
                            case 3://sexo
                                System.out.println("Sexo atual: "
                                + cadastroFuncionario.get(getPesquisaFuncionario(mtr)).getSexo());
                                System.out.println("Nova Sexo: ");
                                sexo=ler.nextLine();
                                cadastroFuncionario.get(getPesquisaFuncionario(mtr)).setSexo(sexo);
                                break;
                            case 4://cpf
                                System.out.println("Cpf atual: "
                                + cadastroFuncionario.get(getPesquisaFuncionario(mtr)).getCpf());
                                System.out.println("Nova CPF: ");
                                cpf=ler.nextLine();
                                
                                cadastroFuncionario.get(getPesquisaFuncionario(mtr)).setCpf(cpf);
                                break;
                            case 5://endereco
                                System.out.println("Endereço atual: "
                                + cadastroFuncionario.get(getPesquisaFuncionario(mtr)).getEndereco());
                                System.out.println("Nova Endereço: ");
                                endereco=ler.nextLine();
                                
                                cadastroFuncionario.get(getPesquisaFuncionario(mtr)).setEndereco(endereco);
                                 break;
                            case 6://telefone
                                System.out.println("Telefone atual: "
                                + cadastroFuncionario.get(getPesquisaFuncionario(mtr)).getTelefone());
                                System.out.println("Nova Telefone: ");
                                telefone=ler.nextLine();
                                
                                cadastroFuncionario.get(getPesquisaFuncionario(mtr)).setTelefone(telefone);
                                 break;
                            case 7://email
                                System.out.println("Email atual: "
                                + cadastroFuncionario.get(getPesquisaFuncionario(mtr)).getEmail());
                                System.out.println("Novo Email: ");
                                email=ler.nextLine();
                                
                                cadastroFuncionario.get(getPesquisaFuncionario(mtr)).setEmail(email);
                                 break;
                            case 8://turno
                                System.out.println("Turno atual: "
                                + cadastroFuncionario.get(getPesquisaFuncionario(mtr)).getTurno());
                                System.out.println("Novo Turno: ");
                                turno=ler.nextLine();
                                
                                cadastroFuncionario.get(getPesquisaFuncionario(mtr)).setTurno(turno);
                                  break;
                            case 9://salario
                                System.out.println("Salario atual: "
                                + cadastroFuncionario.get(getPesquisaFuncionario(mtr)).getSalario());
                                System.out.println("Novo Salario: ");
                                mens=ler.nextFloat();
                                
                                cadastroFuncionario.get(getPesquisaFuncionario(mtr)).setSalario(mens);
                                  break;
                            case 10://funcao
                                System.out.println("Função atual: "
                                + cadastroFuncionario.get(getPesquisaFuncionario(mtr)).getFuncao());
                                System.out.println("Nova Função: ");
                                curso=ler.nextLine();
                                
                                cadastroFuncionario.get(getPesquisaFuncionario(mtr)).setFuncao(curso);
                                  break;
                        }
                        System.out.println("\n----------------Dados Atualizados----------------\n");
                        cadastroFuncionario.get(getPesquisaFuncionario(mtr)).exibir();
                        break;
                }
            break;
             case 0:
                 loop=0;
                break;
    }
                  }catch(Exception e){
                               System.out.println("\n----------------Tipo de dado errado----------------\n");
                               ler.nextLine();
                               
                             }
            }while(loop!=0); 
            }
        }
