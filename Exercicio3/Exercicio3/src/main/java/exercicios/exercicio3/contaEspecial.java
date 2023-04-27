/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio3;

/**
 *
 * @author allan
 * Classe ContaEspecial
 atributo float limite
 redefinição do método sacar, permitindo saldo negativo até o valor do limite.
 */
public class contaEspecial {
    
     private float limite;

    public contaEspecial(String cliente, int num_Conta, float saldo, float limite) {
        super(cliente, num_Conta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar(float valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
    