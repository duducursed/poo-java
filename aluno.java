package poo;

import java.util.Date;

import javax.naming.Binding;

import java.text.ParseException;
import java.math.BigInteger;

public class aluno extends pessoa {
    private BigInteger matricula;
    private BigInteger ra;
    private BigInteger senha;
    private String curso;

    

    public aluno(String nome, int idade, String cpf, String dtn, String email, BigInteger telnum) throws ParseException {
        super(nome, idade, cpf, dtn, email, telnum);
        
}

    public void setDtnValue(Date dtn) {
        setDtn(dtn);
    }

    //GETTERS E SETTERS

    public BigInteger getMatricula() {
        return matricula;
    }

    public void setMatricula(BigInteger matricula) {
        this.matricula = matricula;
    }

    public BigInteger getRa() {
        return ra;
    }

    public void setRa(BigInteger ra) {
        this.ra = ra;
    }

    public BigInteger getSenha() {
        return senha;
    }

    public void setSenha(BigInteger senha) {
        this.senha = senha;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // FIM

    //CONSTRUTOR
    public aluno() {
        
    }



}
