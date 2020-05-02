package ADAPTER;

public class MAIN {

	public static void main(String[] args) {

		DATAINVERTIDA dt = new DATAINVERTIDA();

		ADAPTER adpt = new ADAPTER(dt);
		
		adpt.criarDataInvertida();

	}

}