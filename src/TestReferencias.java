
public class TestReferencias {
 public static void main(String[] args) {
	//Funcionario funcionario = new Funcionario();
	Funcionario funcionario = new Gerente();
	funcionario.setNombre("July");
	
	Gerente gerente = new Gerente();
	gerente.setNombre("Camilo");
	
	funcionario.setSalario(2000000);
	gerente.setSalario(7000000); 
	
	//funcionario.iniciarSesion();
	
	gerente.iniciarSesion("_ddddd");
}
	

}
