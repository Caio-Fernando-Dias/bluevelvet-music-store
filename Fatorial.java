public class Fatorial {
    public int calcularFatorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("não existe fatorial de números negativos");
        }        
        int fatorial = 1;
	if(n != 0){
       		for (int i = 1; i <= n; i++) {
           		 fatorial *= i;
        	}
	}
        return fatorial;
    }
}
