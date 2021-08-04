package util;

import java.util.Arrays;

/**
 *
 * @author jeremias.posso
 */
public class GeradorUtil {

    /**
     * retorna um valor String conforme a qauntidade de número solicitado
     *
     */
    public String gerarNumero(int qtde) {
        String senha = "";
        int numero;
        for (int i = 0; i < qtde; i++) {
            numero = (int) (Math.random() * 10);
            senha = senha + numero;

        }
        return senha;
    }

    public String gerarCpf() {
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3)
                + "-" + gerarNumero(2);

    }

    public double gerarSalario() {
        int numero = (int) (Math.random() * 100000);
        return numero;
    }

    public String gerarCnpj() {
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3)
                + "/" + gerarNumero(3) + "-" + gerarNumero(2);
    }

    public String gerarTelefoneFixo() {
        return "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);

    /**
     *
     * @return
     */
    public String gerarCep() {
        return gerarNumero(5) + "-" + gerarNumero(3);
    }

    public String gerarCelular() {
        return "(48) 9" + gerarNumero(4) + "-" + gerarNumero(4);
    }

    public String gerarNome() {
        String[] nomes = {"Jota", "Joana", "Joaquina", "Jorge", "Bruno", "Senna",
            "Monica", "Maiara", "Maraisa", "Simone", "Simaria", "Matheus", "Hagi",
            "Carlos", "Rafael", "Gian", "Daniel", "Ubirajara", "Valdete", "Jeremias"};

      
        int indice = (int) (Math.random() * nomes.length);
       
        return nomes[indice] + " " + gerarSobrenome();
    }
    
    private String gerarSobrenome(){
        String[] sobrenomes = {"Silva", "Mota", "Oliveira", "Abravanel", "Rocha",
            "Pereira", "Santos", "Pires", "Percicotte", "Souza", "Zen", "Stark",
            "Peixes", "Fisch", "Smitch", "Tango", "Carvalho", "Peixoto", "Alvez", "Almeida"};
        int indice = (int) (Math.random() * sobrenomes.length);
        return sobrenomes[indice]; 
    
    }
    public static void main(String[] args) {
      GeradorUtil util = new GeradorUtil();
      String cpf = util.gerarCpf();
      String cnpj = util.gerarCnpj();
      String telefoneFixo = util.gerarTelefoneFixo();
      String celular = util.gerarCelular();
      String cep = util.gerarCep();
      String nome = util.gerarNome();
      
      System.out.println("CPF: " + cpf);       System.out.println("CNPJ: " + cnpj);        System.out.println("Telefone Fixo: " + telefoneFixo);
      System.out.println("CEP: " + cep);
      System.out.println("Celular: " + celular);
      System.out.println("Sobrenome: " + nome);
    }
}

    
}
