public class Main {
    public static void main(String[] args) {
        System.out.println("-- Bienvenido a tu Cajero Municipal de confianza --");
        Cuenta myBankAccount = new Cuenta("Christian Salazar", 500000);
        System.out.println(myBankAccount.getDatos());
        System.out.println("Su cuenta tiene: " + myBankAccount.getSaldo() + "$\n");
        myBankAccount.setIngreso(100000);
        myBankAccount.setRetirar(700000);
        myBankAccount.setRetirar(450000);

        Cuenta newAccount = new Cuenta("Jorge Velez", 50000);
        System.out.println(newAccount.getDatos());
        newAccount.setRetirar(50000);
        newAccount.setIngreso(70000);
        System.out.println("Su cuenta tiene: " + newAccount.getSaldo() + "$\n");

        Banco bancolombia = new Banco(myBankAccount, newAccount);
        bancolombia.transferir( 15000);
        System.out.println("Christian Salazar account's: " + myBankAccount.getSaldo() + "$\n");
        System.out.println("Jorge Velez account's: " + newAccount.getSaldo() + "$\n");

        bancolombia.transferir( 500000);
    }
}