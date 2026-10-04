/*
 * SomaVetor.java
 * 
 * Copyright 2026 GNU GPLv3.0 <Mateus Iuri Rocha>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
 
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;               

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = ler.nextInt(); 
		}

        for (int i = 0; i < 5; i++) {
            soma = soma + numeros[i]; 
        }

        if (soma > 15) {
            System.out.println("\nA soma dos elementos é: " + soma);
        } else {
			System.out.println("\nA soma deu " + soma + " (não é maior que 15).");
        }

        ler.close();
    }
}

