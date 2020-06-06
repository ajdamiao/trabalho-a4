package com.company;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {
    protected double limite;

    public ContaPoupanca(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(limite > saldo-valor)
        {
            System.out.println("Limite ultrapassado");
        }
        else
        {
            this.saldo = saldo-valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public double saldo()
    {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Numero da conta: " + super.getNumeroConta() + "Saldo: " + super.getSaldo() + "Taxa Operação: " + getLimite());
    }
}
