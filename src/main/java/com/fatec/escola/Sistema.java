/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.escola;

/**
 *
 * @author fatec-dsm2
 */
public class Sistema {

    private String nomeAluno;
    private double[] notasAluno = new double[3];

    public void setNomeAluno(String nomeCompleto) {
        this.nomeAluno = nomeCompleto;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNotasAluno(double[] notas) {
        this.notasAluno = notas;
    }

    public double[] getNotasAluno() {
        return notasAluno;
    }

    private double calculoMedia(double[] notas) {
        double media = 0.0;
        notas = this.getNotasAluno();
        for (int i = 0; i < 3; i++) {
            media += notas[i];
        }
        media = media / 3;
        return media;
    }

    public double getMedia() {
        return this.calculoMedia(notasAluno);
    }
    
    private String calculoResultado() {

        double media = this.calculoMedia(this.getNotasAluno());
        String resultado;
        if (media >= 0 && media < 6.0) {
            resultado = "Reprovado";
        } else if (media >= 6.0 && media <= 9.0) {
            resultado = "Aprovado";
        } else if (media > 9.0 && media <= 10.0) {
            resultado = "Otimo Aproveitamento";
        } else {
            resultado = "Media invalida";
        }
        return resultado;
    }
    
    public String getResultado(){
        return this.calculoResultado();
    }
    
}
