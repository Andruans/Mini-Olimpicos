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
public class Grupo {
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    private String nomDeporte;
    private int numDeportistas;
    Deportista[] deportista = new Deportista[numDeportistas];
    public Grupo(String nomDeporte, int numDeportistas, Deportista deportista[]) {
        this.nomDeporte = nomDeporte;
        this.numDeportistas = numDeportistas;
        this.deportista = deportista;
    }

    public int getNumDeportistas() {
        return numDeportistas;
    }

    public void setNumDeportistas(int numDeportistas) {
        this.numDeportistas = numDeportistas;
    }

    public Deportista[] getDeportista() {
        return deportista;
    }

    public void setDeportista(Deportista[] deportista) {
        this.deportista = deportista;
    }
    
    /*
    public void deportistas(numDepDelegacion){
        Deportista[] deportista = new Deportista[3];
        for(int j=0; j<numDeportistas;j++){
            String nombre;
            String apellido;
            String cedula;
            System.out.println("||----Ingrese nombre del deportista:   ");
            nombre=lectura.next();
            //deportista[j] = new Deportista(nombre, apellido cedula);
            //del1[i] = new Delegacion(pais,numDeportistas,numMedOro,numMedPlata,numMedBronce,deportista[j]);
        }
    }*/

    public Grupo(String nomDeporte) {
        this.nomDeporte = nomDeporte;
    }

    public String getNomDeporte() {
        return nomDeporte;
    }

    public void setNomDeporte(String nomDeporte) {
        this.nomDeporte = nomDeporte;
    }
}
