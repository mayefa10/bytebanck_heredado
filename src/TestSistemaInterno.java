
public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sitema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		
		sitema.autentica(gerente1);
		sitema.autentica(admin);
		
	}

}
