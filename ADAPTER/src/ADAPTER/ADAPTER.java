package ADAPTER;

public class ADAPTER extends DATA {

	private DATAINVERTIDA dataInvertida;

	@Override
	public int getAno() {
		// TODO Auto-generated method stub
		return super.getAno();
	}

	@Override
	public int getMes() {
		// TODO Auto-generated method stub
		return super.getMes();
	}

	@Override
	public int getDia() {
		// TODO Auto-generated method stub
		return super.getDia();
	}

	public ADAPTER (DATAINVERTIDA dataInvertida) {
		this.dataInvertida = dataInvertida;
	}

	public void criarDataInvertida() {

		dataInvertida.dataInvertida(getDia(), getMes(), getAno());
	}

}