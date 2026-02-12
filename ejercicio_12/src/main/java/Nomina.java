/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camil
 */
public class Nomina {
    
    public static double calcular_salario_bruto(double horas_trabajadas, double valor_hora) {
        return horas_trabajadas*valor_hora;
    }
    public static double calc_valor_retef(double porcentaje_retef, double salario_bruto){
        return porcentaje_retef * salario_bruto;
    }
    public static double calc_salario_neto(double salario_bruto, double valor_retefuente){
        return salario_bruto - valor_retefuente;
    }
    
}
