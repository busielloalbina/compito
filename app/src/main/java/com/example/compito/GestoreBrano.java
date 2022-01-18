package com.example.compito;
import  java.util.ArrayList;


public class GestoreBrano
{
    ArrayList<Brano> listaBrani;
    public  GestoreBrano() {
        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(){
        String titolo;
        Brano nb = new Brano(titolo:"");
        listaBrani.add(nb);
    }
}
