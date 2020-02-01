package com.example.collezionetex.dto;


public class RicercaDto {
    
    private String criterio;
    private int criterioNum;

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    public int getCriterioNum() {
        return criterioNum;
    }

    public void setCriterioNum(int criterioNum) {
        this.criterioNum = criterioNum;
    }

    @Override
    public String toString() {
        return "RicercaDto{" + "criterio=" + criterio + ", criterioNum=" + criterioNum + '}';
    }
    
    
    
    

    

   
        
}
