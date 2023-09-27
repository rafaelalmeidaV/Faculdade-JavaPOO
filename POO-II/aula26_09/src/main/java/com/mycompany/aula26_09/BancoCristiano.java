package com.mycompany.aula26_09;

public class BancoCristiano implements Banco {

    private Conta contaBancoCristiano;

    public BancoCristiano(){
        this.contaBancoCristiano = new Conta();
        this.contaBancoCristiano.setNomeProprietario("Banco Cristiano");
        this.contaBancoCristiano.setNumero(0);
        this.contaBancoCristiano.setSaldo(0.00);
    }

    @Override
    public boolean saque(Conta conta, double valor) {
        if(conta.getSaldo() >= valor){
            double novoValor = conta.getSaldo() - valor;
            conta.setSaldo(novoValor);
            System.out.println("Saque efetuado");
            return true;
        }
        else{
            System.out.println("Não consegui fazer o saque!");
            extrato(conta);
            return false;
        }
    }

    @Override
    public boolean deposito(Conta conta, double valor) {
        double novoValor = conta.getSaldo() + valor;

        conta.setSaldo(novoValor);
        System.out.println("Deposito efetuado");
        return true;
    }

    @Override
    public void extrato(Conta conta) {
        System.out.println("\n -- BANCO CRISTIANO -- \n");
        System.out.println("\n -> EXTRATO CONTA\n");
        System.out.println("Nome: " + conta.getNomeProprietario());
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("\n-------------------------------\n");
    }

    
}
