/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brunotia31604390;

/**
 *
 */
public class Calculos {

    public float calc(int[] digitos, int modo) {
        float rest = 0;
        switch (modo) {
            case 1:
                for (int i = 0; i < digitos.length; i++) {
                    rest += digitos[i];
                }
                break;

            case 2:
                for (int i = 0; i < digitos.length; i++) {
                    rest += digitos[i];
                }
                rest = rest / 8;
                break;

            case 3:
                for (int i = 0; i < digitos.length; i++) {
                    if (rest < digitos[i]) {
                        rest = digitos[i];
                    }
                }
                break;

            case 4:
                rest = digitos[0];
                for (int i = 1; i < digitos.length; i++) {
                    if (rest > digitos[i] && digitos[i] != 0) {
                        rest = digitos[i];
                    }
                }
                break;

            case 5:
                int vetor[] = new int[8];
                int vetor2[] = new int[8];

                int cont = 1;
                int num = 0;
                for (int i = 0; i < digitos.length; i++) {
                    cont = 0;
                    for (int j = 0; j < digitos.length; j++) {
                        if (digitos[i] == digitos[j]) {
                            cont++;
                        }
                        num = digitos[i];
                    }
                    vetor[i] = cont;
                    vetor2[i] = num;

                }

                for (int i = 0; i < digitos.length; i++) {

                    if (rest <= vetor[i]) {
                        rest = vetor2[i];
                    }

                }
                break;

            case 6:
                for (int i = 0; i < digitos.length; i++) {
                    if (digitos[i] % 2 == 0) {
                        rest += 1;
                    }
                }
                break;

            case 7:
                for (int i = 0; i < digitos.length; i++) {
                    if (digitos[i] % 2 != 0) {
                        rest += 1;
                    }
                }
                break;

            case 8:
                float p = 0;
                float u = 0;
                for (int i = 0; i < digitos.length; i++) {
                    if (i <= 3) {
                        p += digitos[i];
                    } else {
                        u += digitos[i];
                    }
                }
                rest = p / u;
                break;

            case 9:
                rest = 1;
                for (int i = 0; i < digitos.length; i++) {
                    if (digitos[i] != 0) {
                        rest *= digitos[i];
                    }
                }
                break;

            case 10:
                int prod = 1;
                int maior = 0;
                for (int i = 0; i < digitos.length; i++) {
                    if (digitos[i] != 0) {
                        prod *= digitos[i];
                    }
                }
                rest = prod;
                
                for (int i = 1; i < digitos.length; i++) {
                    if (maior < digitos[i]) {
                        maior = digitos[i];
                    }
                }
                
                rest = maior;
                break;
        }
        return rest;
    }
}
