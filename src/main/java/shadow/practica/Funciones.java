/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shadow.practica;

/**
 *
 * @author diana
 */
public class Funciones {
    public String EsPositivo(int _numero){
        if (_numero>0){
            return "Es positivo";
        }else if (_numero<0){
            return "Es Negativo";
         }else{
            return "Es cero";
        }
    }
    
    public String EsParONon(int _numero){
        if (_numero%2 == 0 ){
            return "Es par";
        }else{
            return "Es Non";
        }
    }
}
