/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exerccicio2;

/**
 *
 * @author allan
 * A classe Empregado deve possuir dois atributos, nome e salario. Salario deve
ser do tipo protected. Crie os métodos get e set para classes e o método toString.
 */
public class Empregado {
    
    public String nome;
    protected double salario;
    
    public Empregado(String nome, double salario) {
      this.nome = nome;
      this.salario = salario;
    
    }
}
