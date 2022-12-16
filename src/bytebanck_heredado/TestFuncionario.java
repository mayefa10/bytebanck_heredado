package bytebanck_heredado;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario july = new Funcionario();
		july.setNombre("July");
		july.setDocumento("123883883");
		july.setSalario (1000000);
		
		System.out.println(july.getSalario());
		System.out.println(july.getBonificacion());
		
	}

}
