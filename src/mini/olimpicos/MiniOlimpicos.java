/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.olimpicos;

/**
 *
 * @author Andruans
 */
public class MiniOlimpicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        char salir = 'n';
        int numDelegaciones = 2;
        Delegacion[] del1 = new Delegacion[numDelegaciones];
        int numGrupos= 0;
        menu: while(salir == 'n'){
        System.out.println("||--------------BIENVENIDO A LOS MINIJUEGOS OLIMPICOS--------------||");
        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||--- Que desea hacer:    -----------------------------------------||");
        System.out.println("||--- 1) Ingresar las 5 Delegaciones   ----------------------------||");
        System.out.println("||--- 2) Consultar Delegacion   -----------------------------------||");
        //System.out.println("||--- 3) Modificar cantidad de medallas ---------------------------||");
        System.out.println("||--- 3) ¿Cual es la delegacion mas campeona?----------------------||");
        int menu1 = 0;
        menu1=lectura.nextInt();
        
            switch (menu1){
                case 1: 
                    System.out.println("||-----------------------------------------------------------------||");
                    System.out.println("||------------INGRESE INFORMACION DE LAS DELEGACIONES--------------||");
                    for(int i=0; i<numDelegaciones;i++){
                        int numDeportistas = 0;
                        int numMedOro = 0;
                        int numMedPlata = 0;
                        int numMedBronce = 0;
                        System.out.println("||----Ingrese nombre del pais:   --------------------");
                        String pais = lectura.next();
                        System.out.println("||----Ingrese numero de grupos inscritos:   ----");
                        numGrupos=lectura.nextInt();
                        System.out.println("||----Ingrese nombre de grupos inscritos:   ----");
                        Grupo[] grup1 = new Grupo[numGrupos];
                        for (int j=0; j<numGrupos; j++ ){
                            System.out.println("Deporte grupo " + (j+1) + " es: ");
                            String nomGrupo = lectura.next();
                            
                            System.out.println("||----Ingrese numero de deportistas inscritos a este deporte:   ----");
                            numDeportistas=lectura.nextInt();
                            while(numDeportistas<2 || numDeportistas>10){
                                System.out.println("El numero de participantes debe ser entre 2 y 10, ingrese nuevamente el valor");
                                numDeportistas=lectura.nextInt();
                            };
                            Deportista depor1[]= new Deportista[numDeportistas];
                            for(int k=0; k<numDeportistas;k++){
                                System.out.println("||----Ingrese nombre de deportista inscrito a este deporte:   ----");
                                String nombreD =lectura.next();
                                System.out.println("||----Ingrese apellido de deportista inscrito a este deporte:   ----");
                                String apellidoD =lectura.next();
                                depor1[k]= new Deportista(nombreD,apellidoD);
                            }
                            grup1[j]= new Grupo(nomGrupo,numDeportistas,depor1);
                        }                   
                        System.out.println("||----Ingrese numero de medallas de oro que tiene:   ");
                        numMedOro=lectura.nextInt();
                        System.out.println("||----Ingrese numero de medallas de plata que tiene: ");
                        numMedPlata=lectura.nextInt();
                        System.out.println("||----Ingrese numero de medallas de bronce que tiene:");
                        numMedBronce=lectura.nextInt();
                        del1[i] = new Delegacion(pais,numGrupos,numMedOro,numMedPlata,numMedBronce,grup1);
                                             
                    }
                    continue menu;
                case 2:
                    System.out.println("||-----------------------------------------------------------------||");
                    System.out.println("||------------CONSULTE INFORMACION DE TODAS LAS DELEGACIONES-------||");
                    System.out.println("||------------------                                               ||");
                    System.out.println("||---                                                              ||");
                    /*String deporte = lectura.next();
                    for(int i=0;i<numDelegaciones;i++){
                            int z = del1[i].getNumGrupos();
                            Grupo[] grup1 = new Grupo[z];
                            grup1=del1[i].getGrupo();
                            for(int j=0; j<z; j++){
                                String W = grup1[j].getNomDeporte();
                                if( W== deporte){
                                    System.out.println("La delegacion" + del1[i].getPais() + "tiene equipo de "+ grup1[j].getNomDeporte() );
                                }
                                //grup1[j].getNomDeporte();
                            //System.out.println("grupo 1"+ del1[i].getGrupo().getNomDeporte());
                            }

                    }*/
                    for(int i=0; i<numDelegaciones;i++){
                        System.out.println("la delegacion numero" + (i+1) + ": el pais " + del1[i].getPais() + " tiene: " );
                        System.out.println( del1[i].getNumMedOro() + " medallas de oro ");
                        System.out.println( del1[i].getNumMedPlata() + " medallas de plata " );
                        System.out.println( del1[i].getNumMedBronce() + " medallas de Bronce" );
                        System.out.println( "Es decir que tiene "+ (del1[i].getNumMedBronce() + del1[i].getNumMedPlata() + del1[i].getNumMedOro() )+ " medallas en total" );
                        int z = del1[i].getNumGrupos();
                        System.out.println("Consta de " + del1[i].getNumGrupos() + " grupos");
                        for(int j=0; j<z; j++){
                            Grupo[] grup1 = new Grupo[z];
                            grup1=del1[i].getGrupo();
                            System.out.println("el deporte de el grupo 1 es:" + grup1[j].getNomDeporte() + " y esta compuesto por los deportistas" );//grup1[j].getNomDeporte();
                            int z1 = grup1[i].getNumDeportistas();
                            for(int k=0;k<z1;k++){
                                Deportista[] depor1 = new Deportista[z1];
                                depor1=grup1[j].getDeportista();
                                System.out.println(" - " + (k+1) + ")" + depor1[k].getNombre() + " " + depor1[k].getApellido());
                            }
                        }
                    }
                    
                    continue menu;
                case 3:
                    System.out.println("||-----------------------------------------------------------------||");
                    System.out.println("||--------------- LA DELEGACION MAS CAMPEONA ES : -----------------||");
                    int[] medallasTotal = new int[numDelegaciones];
                    for(int i=0;i<numDelegaciones;i++){
                        medallasTotal[i] =(del1[i].getNumMedBronce() + del1[i].getNumMedPlata() + del1[i].getNumMedOro() );
                        System.out.println("La suma del total de las medallas de la delegacion de " + del1[i].getPais() + " es " + medallasTotal[i]);
                    }
                    
                    continue menu;
                    
                default: 
                    System.out.println("usted a salido");
                    salir = 'y';
                    break;

            }
        }    
    }
    
}
