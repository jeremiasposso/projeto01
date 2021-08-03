package util;

/**
 *
 * @author jeremias.posso
 */
public class GeradorUtil {
    
    /**
     * retorna um valor String conforme a qauntidade de número solicitado
     * 
     */
    public String gerarNumero(int qtde){
        String senha = "";
        int numero;
        for(int i = 0; i < qtde; i++){
            numero = (int) (Math.random() * 10);
            senha = senha + numero;
            
        }
        return senha;
    }
    
    
    public String gerarCpf(){
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) +
                "-" + gerarNumero(2);
        
    }
    
    public double gerarSalario(){
        int numero = (int) (Math.random() * 100000);
        return numero;
    }
    
    
    public static void main(String[] args) {
       GeradorUtil util = new GeradorUtil();
        String cpf = util.gerarCpf();
        System.out.println("CPF: " + cpf);
    }
}
