/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        //LECTURA POR CONSOLA
        Scanner leer = new Scanner(System.in);

        //CONTROL PRIMARIO
        //variables
        int c1;//continuar en el programa
        do {
            //INGRESAR MESES
            //variables e inicializacion
            String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

            //INGRESAR VINOS
            //varaibles e inicializacion
            String[] vinos = {"manzana", "uva", "blanco"};

            //PRODUCCION VINO MANZANA
            //variables e inicializacion
            double[] vM = new double[meses.length];

            //leer produccion
            JOptionPane.showMessageDialog(null, "Registro de produccion del vino"
                    + " " + vinos[0]);
            for (int i = 0; i < meses.length; i++) {
                vM[i] = Double.parseDouble(JOptionPane.showInputDialog("Produccion "
                        + "del mes " + meses[i]));
            }

            //PRODUCCION VINO UVA
            //variables e inicializacion
            double[] vU = new double[meses.length];

            //leer produccion
            JOptionPane.showMessageDialog(null, "Registro de produccion del vino"
                    + " " + vinos[1]);
            for (int i = 0; i < meses.length; i++) {
                vU[i] = Double.parseDouble(JOptionPane.showInputDialog("Produccion "
                        + "del mes " + meses[i]));
            }

            //PRODUCCION VINO BLANCO
            //variables e inicializacion
            double[] vB = new double[meses.length];

            //leer produccion
            JOptionPane.showMessageDialog(null, "Registro de produccion del vino"
                    + " " + vinos[1]);
            for (int i = 0; i < meses.length; i++) {
                vB[i] = Double.parseDouble(JOptionPane.showInputDialog("Produccion "
                        + "del mes " + meses[i]));
            }

            //PROMEDIO DE PRODUCCION VINO MANZANA
            //variables
            double sumProVm;
            double promProVm;

            //inicializacion
            sumProVm = 0;

            //suma de produccion
            for (int i = 0; i < vM.length; i++) {
                sumProVm += vM[i];
            }

            //promedio
            promProVm = sumProVm / vM.length;

            //PROMEDIO DE PRODUCCION DE VINO UVA
            //variables
            double sumProVu;
            double promProVu;

            //inicializacion
            sumProVu = 0;

            //suma de produccion
            for (int i = 0; i < vU.length; i++) {
                sumProVu += vU[i];
            }

            //promedio
            promProVu = sumProVu / vU.length;

            //PROMEDIO DE PRODUCCION DE VINO BLANCO
            //variables
            double sumProVb;
            double promProVb;

            //inicializacion
            sumProVb = 0;

            //suma de produccion
            for (int i = 0; i < vB.length; i++) {
                sumProVb += vB[i];
            }

            //promedio
            promProVb = sumProVb / vB.length;

            //PRODUCCION TOTAL ANUAL POR VINO
            double[] prodTotVn = {sumProVm, sumProVu, sumProVb};

            //PROMEDIO DE PRODUCCION ANUAL POR VINO
            //variables e inicializacion          
            double[] promProdAnXVn = {promProVm, promProVu, promProVb};

            //CONTROL SECUNDARIO
            //variables
            int c2;

            do {
                //A. MES CON MAYOR PRODUCCION DE VINO POR TIPO DE VINO
                //variables
                int opMy;
                double proMy;

                //inicializacion                
                opMy = Integer.parseInt(JOptionPane.showInputDialog("consultar mes "
                        + "de mayor produccion de un vino:\n1." + vinos[0] + "\n2."
                        + vinos[1] + "\n3." + vinos[2] + "\nSeleccione una opcion:"));

                switch (opMy) {
                    case 1://manzana
                        proMy = 0;
                        for (int i = 0; i < vM.length; i++) {
                            if (vM[i] > proMy) {
                                proMy = vM[i];
                            }
                        }

                        for (int i = 0; i < vM.length; i++) {
                            if (vM[i] == proMy) {
                                JOptionPane.showMessageDialog(null, "Mes con mayor "
                                        + "produccion de vino " + vinos[0] + "\n"
                                        + meses[i] + ":" + proMy);
                            }
                        }
                        break;
                    case 2://uva
                        proMy = 0;
                        for (int i = 0; i < vU.length; i++) {
                            if (vU[i] > proMy) {
                                proMy = vU[i];
                            }
                        }

                        for (int i = 0; i < vU.length; i++) {
                            if (vU[i] == proMy) {
                                JOptionPane.showMessageDialog(null, "Mes con mayor "
                                        + "produccion de vino " + vinos[1] + "\n"
                                        + meses[i] + ":" + proMy);
                            }
                        }
                        break;
                    case 3://blanco
                        proMy = 0;
                        for (int i = 0; i < vB.length; i++) {
                            if (vB[i] > proMy) {
                                proMy = vB[i];
                            }
                        }

                        for (int i = 0; i < vB.length; i++) {
                            if (vB[i] == proMy) {
                                JOptionPane.showMessageDialog(null, "Mes con mayor "
                                        + "produccion de vino " + vinos[2] + "\n"
                                        + meses[i] + ":" + proMy);
                            }
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion invalida");
                }

                //CONTROL SECUNDARIO
                c2 = Integer.parseInt(JOptionPane.showInputDialog("Consultar otro "
                        + "vino\n1.Si\n2.No\nSeleccione una opcion:"));
            } while (c2 == 1);

            //CONTROL TERCIARIO
            int c3;

            do {
                //B.PRODUCCION TOTAL ANUAL POR VINO
                //variables
                int opProTotAn;

                //inicializacion
                opProTotAn = Integer.parseInt(JOptionPane.showInputDialog("consultar "
                        + "produccion anual por vino\n1.Vino"
                        + " 1\n2.Vino 2\n3.Vino3\nSeleccione una opcion:"));

                switch (opProTotAn) {
                    case 1://manzana
                        JOptionPane.showMessageDialog(null, "produccion anual de vino" + vinos[0] + prodTotVn[0]);
                        break;
                    case 2://uva
                        JOptionPane.showMessageDialog(null, "produccion anual de vino" + vinos[1] + prodTotVn[1]);
                        break;
                    case 3://blanco
                        JOptionPane.showMessageDialog(null, "produccion anual de vino" + vinos[2] + prodTotVn[2]);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion invalida");
                }

                //CONTROL TERCIARIO
                c3 = Integer.parseInt(JOptionPane.showInputDialog("Consultar de"
                        + "nuevo\n1.Si\n2.No\nSeleccione una opcion:"));
            } while (c3 == 1);

            //C.VINO QUE OBTUVO LA MAYOR PRODUCCION DE VINO
            //variables
            double prodVn = prodTotVn[0];
            int provN = 0;

            //comparar produccion total anual entre vinos
            for (int i = 0; i < prodTotVn.length; i++) {
                if (prodTotVn[i] > prodVn) {
                    prodVn = prodTotVn[i];
                    provN++;
                }
            }

            //escribimos
            if (prodVn == sumProVm) {
                JOptionPane.showMessageDialog(null, "Mayor produccion\n" + vinos[0] + prodVn);
            } else {
                if (prodVn == sumProVu) {
                    JOptionPane.showMessageDialog(null, "Mayor produccion\n" + vinos[1] + prodVn);
                } else {
                    if (prodVn == sumProVb) {
                        JOptionPane.showMessageDialog(null, "Mayor produccion\n" + vinos[2] + prodVn);
                    }
                }
            }
            
            //D.TOTAL DE PRODUCCION POR MES DE LOS VINOS
            //variables
            double [] prodMes = new double[meses.length];
            String pMes = " ";
            
            for (int i = 0; i < meses.length; i++) {
                prodMes [i] = vM[i] + vU[i] + vB[i];
                pMes = prodMes + ",";
            }
            
            JOptionPane.showMessageDialog(null, pMes);

            //CONTROL PRIMARIO
            c1 = Integer.parseInt(JOptionPane.showInputDialog("Continuar en el programa"
                    + "\n1.Si\n2.No\nSeleccione una opcion:"));
        } while (c1 == 1);
    }
}
