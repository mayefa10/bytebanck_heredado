
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		//gerente.setSalario(1000000);
		
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(9000000);
		gerente.setClave ("AluraCurosOnline");
		gerente.setTipo(1);
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCurosOnline"));
		
	}

}
