
public class TestCuenta {
 public static void main(String[] args) {
	CuentaCorriente cc = new CuentaCorriente(1,1);
	CuentaAhorros ca = new CuentaAhorros (2,3);
	
	cc.deposita (300000);
	cc.transfiere(100000, ca);
	
	System.out.println("CC: " + cc.getSaldo());
	System.out.println("CA: " + ca.getSaldo());
	
	

}
 
 
}
