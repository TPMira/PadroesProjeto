package strategy;

public class EditorDeTextoTest {
	
	private EditorDeTexto editor;
	
	public void AbreEditorEscreveTexto() {
		editor = new EditorDeTexto();
		editor.digitar("abc\ndef");
	}
	
	public void exportarParaTxt() {
		assertEquals("abc\ndef\n", editor.exportar(new ExportadorTXT()));
	}
	
	private void assertEquals(String string, String exportar) {	
	}

	public void exportarParaHtml() {
		assertEquals("<html><body><p>abc</p><p>def</p></body></html>", editor.exportar(new ExportadorHTML()));
	}

}
