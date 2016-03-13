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
public class Delegacion {
     java.util.Scanner lectura = new java.util.Scanner(System.in);
    private String Pais;//variable de instancia
    private int numDeportistas;//variable de instancia
    private int numGrupos;//variable de instancia
    private int numMedOro;//variables de instancia
    private int numMedPlata;//variables de instancia
    private int numMedBronce;//variables de instancia
    private Grupo[] grupo = new Grupo[numGrupos];
    Deportista[] deportista = new Deportista[numDeportistas];
    public Delegacion(String Pais,int numGrupos, int numDeportistas, int numMedOro, int numMedPlata, int numMedBronce) {
        this.Pais = Pais;
        this.numDeportistas = numDeportistas;
        this.numGrupos = numGrupos;
        this.numMedOro = numMedOro;
        this.numMedPlata = numMedPlata;
        this.numMedBronce = numMedBronce;
    }

    
    public Delegacion(String Pais,int numGrupos, int numMedOro, int numMedPlata, int numMedBronce, Grupo grupo[]) {
        this.Pais = Pais;
        this.numDeportistas = numDeportistas;
        this.numGrupos = numGrupos;
        this.numMedOro = numMedOro;
        this.numMedPlata = numMedPlata;
        this.numMedBronce = numMedBronce;
        this.grupo = grupo;
        this.deportista = deportista;
        
    }
    /*public void crearGrupo(){
        for(int i=0;i<numGrupos;i++){
            Grupo[] grup1 = new Grupo[numGrupos];
            System.out.println("Ingrese nombre del deporte de cada grupo");
            String nombreDeporte = lectura.next();
            grup1[i] = new Grupo(nombreDeporte,numDeportistas);
        }
    }
    public void crearGrupo(int numGrupos, int numDeportistas){
        for(int i=0;i<numGrupos;i++){
            Grupo[] grup1 = new Grupo[numGrupos];
            System.out.println("Ingrese nombre del deporte de cada grupo");
            String nombreDeporte = lectura.next();
            grup1[i] = new Grupo(nombreDeporte,numDeportistas);
        }
    }*/
    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    public int getNumGrupos() {
        return numGrupos;
    }

    public void setNumGrupos(int numGrupos) {
        this.numGrupos = numGrupos;
    }
    
    public int getNumDeportistas() {
        return numDeportistas;
    }

    public void setNumDeportistas(int numDeportistas) {
        this.numDeportistas = numDeportistas;
    }

    public int getNumMedOro() {
        return numMedOro;
    }

    public void setNumMedOro(int numMedOro) {
        this.numMedOro = numMedOro;
    }

    public int getNumMedPlata() {
        return numMedPlata;
    }

    public void setNumMedPlata(int numMedPlata) {
        this.numMedPlata = numMedPlata;
    }

    public int getNumMedBronce() {
        return numMedBronce;
    }

    public void setNumMedBronce(int numMedBronce) {
        this.numMedBronce = numMedBronce;
    }

    public Grupo[] getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo[] grupo) {
        this.grupo = grupo;
    }
}
