/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exerccicio2;

/**
 *
 * @author allan
 * A classe Vendedor deve herdar também da classe Empregado. Deve possuir
ainda um método denominado calcularSalario. Esse método deve retornar
um valor do tipo float, correspondente ao valor do salário acrescido do
respectivo percentual de comissão. O construtor da classe deve receber por
parâmetro, além as informações da superclasse, a informação do percentual de
comissão do vendedor. O método toString da classe deve apresentar as
informações de nome do empregado, salário sem comissão, salario com
comissão e percentual de comissão.
 */
public class Vendedor extends Empregado {
    
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }
    
}
