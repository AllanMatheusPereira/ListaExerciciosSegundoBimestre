/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio1;

/**
 *
 * @author allan
 * 1. Exercício sobre Ingressos
Crie uma classe chamada Ingresso que possua um atributo valor e um método
toString que retorne à informação do valor do ingresso.
a) Crie uma classe IngressoVIP, que herda de Ingresso e possui um atributo
valor Adicional. O método toString da classe IngressoVIP deve considerar
que o valor do ingresso é o valor da superclasse somado ao valor Adicional
do IngressoVIP.
b) Crie uma classe para testar os objetos das classes Ingresso e IngressoVIP.
 */
public class IngressoVip extends Ingresso{
    
    private float valorAdicional;
    
    public IngressoVip(float valor, float valorAdicional) {
        super();
        this.valorAdicional = valorAdicional;
}
    public double getValorAdicional() {
        return valorAdicional;
}    
    public String toString() {
        float valorTotal = (float) (getValor() + valorAdicional);
        return "Valor ingressoVIP R$" + valorTotal; 

    }
}