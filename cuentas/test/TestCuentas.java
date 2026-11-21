package clearminds.cuentas.test;
import clearminds.cuentas.Cuentas;

public class TestCuentas {

	public static void main(String[] args) {
		// 1. Creación de instancias con diferentes constructores
		Cuentas cuenta1 = new Cuentas("03476");
		cuenta1.setSaldo(675);
		Cuentas cuenta2 = new Cuentas("09384", "A", 150);
		Cuentas cuenta3 = new Cuentas("03029");
		cuenta3.setTipo("D");
		
		// 2. Visualización inicial
		System.out.println("-------- Valores Iniciales ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		
		System.out.println("CUENTA 4 : Valores asignados");
		Cuentas cuenta4 = new Cuentas("04623");
		cuenta4.imprimir();
		
		System.out.println("CUENTA 5 : Valores asignados");
		Cuentas cuenta5 = new Cuentas("02938","A",360);
		cuenta5.imprimir();
		
		System.out.println("CUENTA 6 : Valores asignados");
		Cuentas cuenta6 = new Cuentas("03832","C",0);
		cuenta6.imprimir();
	}

}
