/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exerccicio2;

/**
 *
 * @author allan
 * A classe Gerente deve herdar da classe Empregado. Crie os métodos get e set
para a classe e o método toString. O método toString da classe Gerente deve
incluir a informação do departamento, além dos dados da superclasse. O
construtor da classe deve receber por parâmetro, além as informações da
superclasse, a informação do departamento.
 */
public class Gerente extends Empregado {
    
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }   
    public String toString() {
        return "";
    }
    
}
