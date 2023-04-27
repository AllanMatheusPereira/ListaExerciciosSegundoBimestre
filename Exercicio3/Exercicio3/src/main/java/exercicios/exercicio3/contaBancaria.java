/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio3;

/**
 *
 * @author allan
 * 3. Exercício sobre Conta bancária

Elabore uma classe ContaBancaria, com os seguintes membros:
 atributo String cliente
 atributo int num_conta
 atributo float saldo
 método sacar (o saldo não pode ficar negativo)
 método depositar
 */
public class contaBancaria {
    
    public String cliente;
    public int num_Conta;
    public float saldo;
    
    public contaBancaria(String cliente, int num_Conta, float saldo) {
        this.cliente = cliente;
        this.num_Conta = num_Conta;
        this.saldo = saldo;
    }
    
    public void sacar(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }
    
    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }
}
