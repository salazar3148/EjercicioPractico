public class Banco {
    Cuenta[] cuentas;

    public Banco(){
        cuentas = new Cuenta[2];
    }
    public Banco(Cuenta cuenta1, Cuenta cuenta2){
        this();
        cuentas[0] = cuenta1;
        cuentas[1] = cuenta2;
    }

    public void transferir(double monto){
        System.out.println("Transferencia pendiente...\n");
        if(cuentas[0].validarMonto(monto)){
            cuentas[1].setIngreso(monto);
            System.out.println("Transferencia exitosa!");
        } else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
