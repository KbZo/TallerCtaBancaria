package CTaBanco;

public class CuentaAhorro extends CuentaBancaria {
    private double interes;
   
    @Override
    double  getInteresDeposito(){
           return 0.02;
    }
    public double getInteres() {
    return interes;
    }

    public void setInteres(double interes) {
    this.interes = interes;
    }
	
    /*@Override
    public void deposito(double deposito) {
    double interes=0;
	if(deposito<1000)
            interes = deposito * 0.02;	
    this.saldo = this.saldo +deposito + interes;
    }*/   
}
