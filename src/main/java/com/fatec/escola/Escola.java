/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fatec.escola;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Escola {

    public static void main(String[] args) {
        Sistema s = new Sistema();
        String nomeCompleto;
        String[] nota = new String[3];
        double[] notas = new double[3];

        System.out.println("");
        nomeCompleto = JOptionPane.showInputDialog(
                null,
                "Digite o nome do aluno por extenso: ",
                ""
        );
        s.setNomeAluno(nomeCompleto);

        System.out.println("Digite as 3 notas desse aluno para criar a media: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota" + i);
            nota[i] = JOptionPane.showInputDialog(
                    null,
                    "Digite a nota" + (i + 1) + ": ",
                    ""
            );

            notas[i] = Double.parseDouble(nota[i]);
        }

        s.setNotasAluno(notas);

        System.out.println("Resultado: \n");
        s.getMedia();
        String mensagem = "";

        mensagem += String.format("""
                                    Nome do aluno: %s
                                    Media: %.2f
                                    Resultado: %s""",
                s.getNomeAluno(),
                s.getMedia(),
                s.getResultado()
        );

        JOptionPane.showMessageDialog(null, mensagem, "Resultado da Projeção", JOptionPane.INFORMATION_MESSAGE);
    }
}
