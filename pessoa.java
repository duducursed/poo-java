package poo;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigInteger;


public class pessoa {


    private String cpf;
    private String nome;
    private int idade;
    private Date dtn;
    private String email;
    private BigInteger telnum;



public pessoa(String nome, int idade, String cpf, String dtn, String email, BigInteger telnum) throws ParseException {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.telnum = telnum;
    this.email = email;
    SimpleDateFormat formadata = new SimpleDateFormat("dd/MM/yyyy");
    this.dtn = formadata.parse(dtn);

    CalId();
 
 }

 public pessoa() {

 }

 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
}

public Date getDtn() {
    return dtn;
}

public void setDtn(Date dtn) {
    this.dtn = dtn;
}

public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;

}

private void CalId() {
    Date actdia = new Date();
    Calendar cld = Calendar.getInstance();
    cld.setTime(actdia);
    int actdd = cld.get(Calendar.DAY_OF_MONTH);
    int actmm = cld.get(Calendar.MONTH) + 1;
    int actyy = cld.get(Calendar.YEAR);

    cld.setTime(dtn); {
        int and = cld.get(Calendar.DAY_OF_MONTH);
        int mnd = cld.get(Calendar.MONTH) + 1;
        int ynd = cld.get(Calendar.YEAR);

        this.idade = (actyy - ynd);

            if (actmm < mnd) {
                this.idade--;
            }

            else if (actmm == mnd && actdd < and) {
                 this.idade--;
            }

            if (this.idade <= 0) {
                this.idade = 0;
            }

  }
}


public int getIdade() {
    return idade;

}

public void setIdade(int idade) {
    this.idade = idade;
}

public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}

public BigInteger getTelnum() {
    return telnum;
}

public void setTelnum(BigInteger telnum) {
    this.telnum = telnum;
}


}
