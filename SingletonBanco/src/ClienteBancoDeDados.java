public class ClienteBancoDeDados {
    public static void main( String args[] ){
        BancoDeDados bd = BancoDeDados.getInstance();
      
        /* AINDA A MESMA INST�NCIA DE bd */
        BancoDeDados bdNovo = BancoDeDados.getInstance();
       
    }
}