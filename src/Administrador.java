
public class Administrador extends Funcionario implements Autenticable {

	private AuteticacionUtil util;
	
	

	public  Administrador() {
		this.util = new AuteticacionUtil();
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.util.iniciarSesion(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
		}
	}

