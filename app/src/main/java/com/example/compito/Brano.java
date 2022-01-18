package com.example.compito;

import android.widget.Spinner;
import java.util.Date;

public class Brano {
    public String getTitolo() { return titolo; }

    public void setTitolo(String titolo) { this.titolo = titolo; }

    private String titolo;
    private int durata;
    private String autore;
    private Date datacreazione;
    public Brano(String titolo) {this.titolo=titolo;}


}
