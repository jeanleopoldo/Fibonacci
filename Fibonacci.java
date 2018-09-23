public class Fibonacci {

	private View view;

	public Fibonacci() {

		this.view = new View(this);
		
	}

	public int calcularNEsimoTermoIterativo(int termoFinal) {

		int n1 = 1;
		int n2 = 1;
		int tf = termoFinal - 2;
		int numeroDaSequenciaAtual = 0;		

		if (termoFinal == 1 || termoFinal == 2) {
			return 1;
		}
		
		for (int i = 0; i < tf; i++) {
			
			numeroDaSequenciaAtual = n1 + n2;
			n1 = n2;
			n2 = numeroDaSequenciaAtual;
			
		}
		
		return numeroDaSequenciaAtual;
	}

	public int calcularNEsimoTermoRecursivo(int termoFinal) {
		
		int numeroDaSequenciaAtual = 0;
		
		for (int termoAtual = 1; termoAtual <= termoFinal; termoAtual++) {
			numeroDaSequenciaAtual = this.calc(termoAtual);
		}
		
		return numeroDaSequenciaAtual;
	}

	private int calc(int termoAtual) {
		
		if (termoAtual == 1 || termoAtual == 2) {
			return 1;
		}
		
		return this.calcularNEsimoTermoRecursivo(termoAtual - 1) + this.calcularNEsimoTermoRecursivo(termoAtual - 2);
	}
}