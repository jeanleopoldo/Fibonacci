import javax.swing.JOptionPane;

public class View {

	private Fibonacci fib;

	public View(Fibonacci fib) {

		this.fib = fib;
		this.telaInicial();

	}

	public void telaInicial() {

		int termo = Integer.parseInt(JOptionPane.showInputDialog("Número a ser calculado: "));
		int numeroDaSequencia = this.fib.calcularNEsimoTermoRecursivo(termo);
		this.telaResultado(termo, numeroDaSequencia);
		
	}

	public void telaResultado(int termo, int numeroDaSequencia) {
		JOptionPane.showMessageDialog(null, "O " + termo + "º número da sequência é: " + numeroDaSequencia);
	}
}