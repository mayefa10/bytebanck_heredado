
public class Gerente extends Funcionario implements Autenticable{

	public double getBonificacion () {
		System.out.println("Ejecutando desde gerente ");
		return 9000;
		//return super.getSalario()+
			//	this.getSalario()*0.05;
	}

	

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
