import java.util.Random;
public class Cuenta {
    private long numero;
    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.numero = new Random().nextInt(1000000000);
        this.saldo = saldo;
        this.titular = titular;
    }

    public void setIngreso(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Se le agregó: " + cantidad + " a su cuenta, ahora tiene: " + this.saldo + "$\n");
    }

    public void setRetirar(double cantidad){
        if(cantidad > this.saldo)  {
            System.out.println("No cuenta con el saldo suficiente!\n");
        } else {
            this.saldo -= cantidad;
            System.out.println("Retiró exitosamente: " + cantidad + " de su cuenta, Saldo nuevo disponible: " + this.saldo + "$\n");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getDatos(){
        return "Numero: " + this .numero + "\nSaldo: " + this.saldo + "$\nTitular: " + this.titular + ".\n";
    }
}
