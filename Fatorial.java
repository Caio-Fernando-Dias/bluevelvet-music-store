public class Fatorial {
	//Versão iterativa do cálculo do fatorial
	public int calcularFatorial(int n){
		int resultado = 1;
		
		for(int i = 1; i <= n; i++){
			resultado *= i;
		}
		return resultado;
	}
}
