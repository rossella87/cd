package com.github.rossella87.cd.model;

/**
 * Created by CNIT on 30/10/2014.
 */
public class Cd {

    private String titolo;
    private String genere;
    private String ntraccia;
    private String ncopie;


    //definire i metodi get e set

    public String getTitolo(){
        return titolo;
    }

    public String getGenere(){ return genere; }

    public String getNtraccia(){
        return ntraccia;
    }

    public String getNcopie(){ return ncopie; }


    public void setTitolo(String titolo){
        this.titolo=titolo;
    }

    public void setGenere(String genere){
        this.genere=genere;
    }

    public void setNtraccia(String ntraccia){ this.ntraccia=ntraccia;}

    public void setNcopie(String ncopie){
        this.ncopie=ncopie;
    }


}
