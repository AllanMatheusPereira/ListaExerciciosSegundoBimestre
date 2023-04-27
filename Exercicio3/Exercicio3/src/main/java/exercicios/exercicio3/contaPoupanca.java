/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio3;

/**
 *
 * @author allan
 *  Classe ContaPoupança:
 atributo int dia de rendimento
 método calcularNovoSaldo, recebe a taxa de rendimento da poupança e atualiza o
saldo.
 */
public class contaPoupanca extends contaBancaria{
    
    public int dia_Rendimento;

    public contaPoupanca(String cliente, int num_Conta, float saldo) {
        super(cliente, num_Conta, saldo);
        this.dia_Rendimento = dia_Rendimento;
    }
        
    public void setDiaDeRendimento(int diaDeRendimento) {
        this.dia_Rendimento = diaDeRendimento;
    }
        
    public int getdia_Rendimento() {
        return dia_Rendimento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = (float) saldo;
    }

    public void calcularNovoSaldo(double taxaDeRendimento) {
        
        }
}
