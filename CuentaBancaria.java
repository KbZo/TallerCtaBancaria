package CTaBanco;
public  abstract class CuentaBancaria {

   private String nombre;
   protected double saldo; //_Para poder acceder a saldo en otra parte 
	//private double interesDeposito;
	abstract double getInteresDeposito();//_Metodo
	/*
	public double getInteresDeposito() {
		return interesDeposito;
	}

	public void setInteresDeposito(double interesDeposito) {
		this.interesDeposito = interesDeposito;
	}
	*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void retiro(double retiro){
		this.saldo -=retiro;
	}    
        //_Metodo Calculo    
	public void deposito(double deposito){
		double totalInteres =0;
		if(deposito<1000)
			totalInteres = deposito*getInteresDeposito();
		this.saldo += deposito + totalInteres;
	}
}
