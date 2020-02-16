/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.util.Scanner;

/**
 * realiza una solucion alagoritmo de los vinos utilizando vectores, que
 * almacene lo producido cada mes por un ano de tres vinos. Dadas los promedios
 * de produccion anual de n vinos se requiere realizar un algoritmo que permita
 * obtener las siguientes estadisticas: a.mes en el que se obtuvo mayor
 * produccionde un vino dado y el valor de dicha produccion. b.el total de
 * produccion del ano de cada vino c.vino que tuvo mayor produccion de vino
 * d.total de produccion por mes de los vinos
 */
/**
 *
 * @author ADMIN
 */
public class vinos {

    public static void main(String[] args) {
        //LECTURA POR TECLADO
        Scanner leer = new Scanner(System.in);

        //PRODUCCION POR 12 MESES O CADA MES POR 1 AÑO 
        //variables
        int prod_mes;

        //inicializacion
        prod_mes = 12;

        //PRODUCCION DE PRIMER VINO
        //variables
        int[] vino1;

        //inicializacion
        vino1 = new int[prod_mes];
        
        //leer produccion de vinos o leer vector
//        System.out.println("Ingresar produccion del vino 1:");
        for (int i = 0; i < vino1.length; i++) {
////            System.out.print("Produccion del mes " + (i + 1) + ":");
            vino1[i] = (int) (Math.random()* 100) + 1;
        }
        
        //PRODUCCION DE SEGUNDO VINO
        //variables
        int[] vino2;

        //inicializacion
        vino2 = new int[prod_mes];
        
        //leer produccion de vinos o leer vector
//        System.out.println("Ingresar produccion del vino 2:");
        for (int i = 0; i < vino2.length; i++) {
//            System.out.print("Produccion del mes " + (i + 1) + ":");
            vino2[i] = (int) (Math.random()* 100) + 1;
        }
        
        //PRODUCCION DE TERCER VINO
        //variables
        int[] vino3;

        //inicializacion
        vino3 = new int[prod_mes];
        
        //leer produccion de vinos o leer vector
//        System.out.println("Ingresar produccion del vino 3:");
        for (int i = 0; i < vino3.length; i++) {
//            System.out.print("Produccion del mes " + (i + 1) + ":");
            vino3[i] = (int) (Math.random()* 100) + 1;
        }
        
        //PROMEDIO DE PRODUCCION VINO 1
        //variables
        int sumProV1;
        double promProV1;
        
        //inicializacion
        sumProV1 = 0;
        
        //suma de produccion
        for (int i = 0; i < vino1.length; i++) {
            sumProV1 += vino1[i];
        }
        
        //promedio
        promProV1 = sumProV1 / prod_mes;
        
        //PROMEDIO DE PRODUCCION VINO 2
        //variables
        int sumProV2;
        double promProV2;
        
        //inicializacion
        sumProV2 = 0;
        
        //suma de produccion
        for (int i = 0; i < vino2.length; i++) {
            sumProV2 += vino2[i];
        }
        
        //promedio
        promProV2 = sumProV2 / prod_mes;
        
        //PROMEDIO DE PRODUCCION VINO 3
        //variables
        int sumProV3;
        double promProV3;
        
        //inicializacion
        sumProV3 = 0;
        
        //suma de produccion
        for (int i = 0; i < vino3.length; i++) {
            sumProV3 += vino3[i];
        }
        
        //promedio
        promProV3 = sumProV3 / prod_mes;
        
        //PROMEDIO DE PRODUCCION DE TODOS LOS VINO POR AÑO
        //variables
        double sumProVs;
        double promProVs;
        
        //inicalizacion
        sumProVs = 0;
        
        //suma de promedios de produccin de cada vino
            sumProVs += promProV1 + promProV2 + promProV3;
        
        //promedio
        promProVs = sumProVs / 3;
        
        //MES CON MAYOR PRODUCCION DE UN VINO DADO
        //variables
        int opProMes;
        double prodMay;
        
        //inicializacion
        System.out.println("consultar mes de mayor produccion de un vino\n1.Vino"
                + " 1\n2.Vino 2\n3.Vino3\nSeleccione una opcion:");
        opProMes = leer.nextInt();
              
        switch (opProMes){
            case 1:
                prodMay = 0;
                for (int i = 0; i < vino1.length; i++) {
                    if (vino1[i] > prodMay) {
                        prodMay = vino1[i];
                    } else {
                        System.out.println("No hay");
                    }
                }
                
                System.out.println("Mes con mayor produccion:");
                for (int i = 0; i < vino1.length; i++) {
                    if (vino1[i] == prodMay) {
                        System.out.println((i + 1) + ":" + prodMay);
                    }
                }
                break;
            case 2:
                prodMay = 0;
                for (int i = 0; i < vino2.length; i++) {
                    if (vino2[i] > prodMay) {
                        prodMay = vino1[i];
                    } else {
                        System.out.println("No hay");
                    }
                }
                
                System.out.println("Mes con mayor produccion:");
                for (int i = 0; i < vino2.length; i++) {
                    if (vino2[i] == prodMay) {
                        System.out.println((i + 1) + ":" + prodMay);
                    }
                }
                break;
            case 3:
                prodMay = 0;
                for (int i = 0; i < vino3.length; i++) {
                    if (vino3[i] > prodMay) {
                        prodMay = vino3[i];
                    } else {
                        System.out.println("No hay");
                    }
                }
                
                System.out.println("Mes con mayor produccion:");
                for (int i = 0; i < vino3.length; i++) {
                    if (vino3[i] == prodMay) {
                        System.out.println((i + 1) + ":" + prodMay);
                    }
                }
                break;
            default:
                System.out.println("Opcion invalida");
        }
        
        //PRODUCCION TOTAL ANUAL POR VINO
        //variables
        int opProTotAn;
        
        //inicializacion
        System.out.println("consultar produccion anual por vino\n1.Vino"
                + " 1\n2.Vino 2\n3.Vino3\nSeleccione una opcion:");
        opProTotAn = leer.nextInt();
        
        switch(opProTotAn){
            case 1:
                System.out.print("produccion anul de vino 1 " + sumProV1);
                break;
            case 2:
                System.out.print("produccion anul de vino 1 " + sumProV2);
                break;
            case 3:
                System.out.print("produccion anul de vino 1 " + sumProV3);
                break;
            default:
                System.out.println("opcion invalida");
        }
        
        //VINOCON MAYOR PRODUCCION
        
    }
}
