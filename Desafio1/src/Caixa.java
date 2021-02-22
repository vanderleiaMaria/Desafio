
public class Caixa {

	
		
	public double calculaValorFinal(Produto p, int quantidade) {
	
		double resultado = p.getValor() * quantidade;
	
		if(p.getTipo() == 1 || quantidade >5){
			return resultado * 0.9;
			} else
			if(p.getTipo()==2){
				return resultado * 0.8;
			}
		return resultado;	
	
			
	
	}

}
