
public class Principal {

	public static void main(String[] args) {// TODO Auto-generated method stub

		Caixa caixa = new Caixa();
		Produto p1 = new Produto();
		
		p1.setNome("banana");
		p1.setValor(0.99);
		p1.setTipo(2);
		
		Produto p2 = new Produto();
		p2.setNome("Energético");
		p2.setValor(5.49);
		p2.setTipo(3);
		
		Produto p3 = new Produto();
		p3.setNome("Arroz");
		p3.setValor(20.00);
		p3.setTipo(1);
		
		Produto p4 = new Produto();
		p4.setNome("Chocolate");
		p4.setValor(4.50);
		p4.setTipo(1);
		
		Produto p5 = new Produto();

		p5.setNome("Leite");
		p5.setValor(3.73);
		p5.setTipo(3);
		
		Produto p6 = new Produto();

		p6.setNome("Abacaxi");
		p6.setValor(2.40);
		p6.setTipo(2);
		
		System.out.println(p1.getNome() + " R$ " +  caixa.calculaValorFinal(p1, 3));
	    System.out.println(p2.getNome() + " R$ " +  caixa.calculaValorFinal(p2, 7));
	    System.out.println(p3.getNome() + " R$ " +  caixa.calculaValorFinal(p3, 1));
	    System.out.println(p4.getNome() + " R$ " +  caixa.calculaValorFinal(p4, 20));
	    System.out.println(p5.getNome() + " R$ " +  caixa.calculaValorFinal(p5, 3));
	    System.out.println(p6.getNome() + " R$ " +  caixa.calculaValorFinal(p6, 4));


	}

}
