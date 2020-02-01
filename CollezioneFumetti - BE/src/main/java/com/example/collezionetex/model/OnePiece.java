package com.example.collezionetex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OnePiece implements Comparable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private int numero;
    @Column
    private String titolo;
    @Column
    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public OnePiece() {
    }

    public OnePiece(int numero, String titolo) {
        this.numero = numero;
        this.titolo = titolo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        return "OnePiece{" + "id=" + id + ", numero=" + numero + ", titolo=" + titolo + ", img=" + img + '}';
    }

    
    @Override
    public int compareTo(Object o) {
        int ret = 0;
        OnePiece other = (OnePiece) o;
        if (this.numero == other.numero) {
            ret = 0;
        }
        if (this.numero < other.numero) {
            ret = -1;
        }
        if (this.numero > other.numero) {
            ret = 1;
        }
        return ret;    }
    
}
