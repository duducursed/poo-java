package poo;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigInteger;
import java.util.Random;

public class main {
   
   

    public static void main(String[] args) throws ParseException {
       
       // GERAR NUM ALEATORIOS MATRICULA, SENHA,  //

       // RA
        Random aleat = new Random();

        BigInteger limInf =  BigInteger.TEN.pow(7);
        BigInteger limSup =  BigInteger.TEN.pow(8).subtract(BigInteger.ONE);
       
        BigInteger amp = limSup.subtract(limInf);

        BigInteger gerador = new BigInteger(amp.bitLength(), aleat);

        //separacao

        // MATRICULA
        Random aleatMM = new Random();

        BigInteger limInfMM =  BigInteger.TEN.pow(6);
        BigInteger limSupMM =  BigInteger.TEN.pow(7).subtract(BigInteger.ONE);
       
        BigInteger ampMM = limSupMM.subtract(limInfMM);

        BigInteger gerMM = new BigInteger(ampMM.bitLength(), aleatMM);

        if (gerMM.compareTo(limInfMM) < 0) {
            gerMM = gerMM.add(limInfMM);
        }

        //separacao

        // SENHA
        Random aleatSS = new Random();

        BigInteger limInfSS =  BigInteger.TEN.pow(4);
        BigInteger limSupSS =  BigInteger.TEN.pow(5).subtract(BigInteger.ONE);
       
        BigInteger ampSS = limSupSS.subtract(limInfSS);

        BigInteger gerSS = new BigInteger(ampSS.bitLength(), aleatSS);

        if (gerSS.compareTo(limInfSS) < 0) {
            gerSS = gerSS.add(limInfSS);
        }

      // FIM //

       aluno estd = new aluno();

       estd.setNome("CoxinhaHighlight2831");
       estd.setCpf("700.320.594-94");
       estd.setEmail(estd.getNome() + "@gmail.com");
       estd.setIdade(18);
       estd.setTelnum(new BigInteger("84981323939"));
       estd.setMatricula(gerMM);
       estd.setSenha(gerSS);
       estd.setRa(gerador);

       SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
       Date dtn= dateFormat.parse("25/11/2004");
       estd.setDtn(dtn);
       

       String dtnfm = dateFormat.format(estd.getDtn());
       System.out.println(dtnfm);
       System.out.printf("128" + "%08d%n", estd.getRa());
       System.out.printf("%07d%n", estd.getMatricula());
       System.out.printf("%04d%n", estd.getSenha());
       
    }

}
