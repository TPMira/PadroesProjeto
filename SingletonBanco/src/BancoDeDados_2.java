public class BancoDeDados_2 {
    private volatile static BancoDeDados_2 instance = new BancoDeDados_2();
   

    private BancoDeDados_2(){
      
    }

    public static BancoDeDados_2 getInstance(){
        return instance;
    }
   
}