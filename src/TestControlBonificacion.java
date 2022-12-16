
public class TestControlBonificacion {
public static void main(String[] args) {
	Funcionario july = new Funcionario();
	july.setSalario(2000000);
	
	Gerente camilo = new Gerente ();
	camilo.setSalario(4000000);
	
	ControlBonificacion controlBonificacion = 
			new ControlBonificacion();
	Contador nino = new Contador();
	nino.setSalario(3000000);
	
	controlBonificacion.registrarSalario(july);
	controlBonificacion.registrarSalario(camilo);
	controlBonificacion.registrarSalario(nino);
}
}

