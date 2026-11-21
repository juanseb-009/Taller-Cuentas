package clearminds.cuentas;

public class Cuentas {
	private String id;
	private String tipo;
	private double saldo;
	
	
	public Cuentas(String A) {
		this.id = A;
		
		
	}
	public Cuentas(String A, String tipo, double saldo) {
		this.id = A;
		this.tipo = tipo;
		this.saldo = saldo;
		
	}
	public void imprimir() {
	    imprimirConMiEstilo();
	}


public void imprimirConMiEstilo() {

    System.out.println();
    System.out.println("  +------------------------------------------+");
    System.out.println("  |                                          |");
    System.out.println("  |           B A N C O   D I G I T A L      |");
    System.out.println("  |                                          |");
    System.out.println("  +------------------------------------------+");
    System.out.println("  |                                          |");
    System.out.println("  |  INFORMACION DE LA CUENTA                |");
    System.out.println("  |                                          |");
    System.out.printf ("  |  Numero de cuenta : " + id,             "|");
    System.out.println("  |                                          |");   
    System.out.printf ("  |  Tipo de cuenta   : "+ tipo,            "|");            
    System.out.println("  |                                          |");
    System.out.println("  +------------------------------------------+");
    System.out.println("  |                                          |");
    System.out.printf ("  |  SALDO DISPONIBLE : $ "+ saldo,         "|");
    System.out.println("  |                                          |");
    System.out.println("  +------------------------------------------+");

    System.out.println();
}

	
	
	public String getId() {
		return id;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
