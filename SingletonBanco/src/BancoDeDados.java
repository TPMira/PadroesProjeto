public class BancoDeDados {
    private volatile static BancoDeDados instance;
    

    private BancoDeDados(){
        
    }

    public static BancoDeDados getInstance(){
        if( instance == null ){
            
            synchronized (BancoDeDados.class){
                if( instance == null ) {
                    instance = new BancoDeDados();
                }
            }
        }
        return instance;
    }
    
}