package util;

/**
 *
 * @author jeremias.posso
 */
public class GeradorUtil {
    public double gerarSalario(){
        int numero = (int) (Math.random() * 100000);
        return numero;
    }
    
    
    public static void main(String[] args) {
       GeradorUtil objetoDessaClasse = new GeradorUtil();
        System.out.println("Salario: " + objetoDessaClasse.gerarSalario());
        
    }
}
