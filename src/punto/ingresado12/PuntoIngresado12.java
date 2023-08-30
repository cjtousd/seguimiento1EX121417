/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto.ingresado12;

import java.util.Scanner;
/*
*NOM: Nombre del trabajador. 
*NHT: Número de horas trabajadas. 
*VHN: Valor hora normal trabajada. 
*HET: Horas extras trabajadas. 
*HEE8: Horas extras que exceden de 8. 
*SALARIO: Pago total que recibe el trabajador
*/
public class PuntoIngresado12 {
    public static void main(String[] args) {
        String NOM;
        int NHT,HET,HEE8;
        double VHN, SALARIO;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese NOM:");
        NOM = entrada.nextLine();
        System.out.println("Ingrese NHT:");
        NHT = entrada.nextInt();
        System.out.println("Ingrese HEE8:");
        HEE8 = entrada.nextInt();
        System.out.println("Ingrese VHN:");
        VHN = entrada.nextDouble();
        System.out.println("Ingrese SALARIO:");
        SALARIO = entrada.nextDouble();
        
        if(NHT>40){
            HET = NHT - 40;
            if(HET>8){
               HEE8 = HET - 8;
               SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            }
            else {
               SALARIO = 40 * VHN + HET * 2 * VHN;
                    }
        }
        else{
            SALARIO = NHT * VHN;
            }
    System.out.println(" El trabajador " + NOM + " devengo " + SALARIO); 
    }
 }
