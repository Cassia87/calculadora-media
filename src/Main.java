import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Entre com uma nota:");
            double nota = sc.nextDouble();
            notas.add(nota);
        }
        double maior = max(notas);
        double menor = min(notas);
        double media = media(notas);
        showResult(maior, menor, media);


    }

    public static double max(Collection<Double> notas) {
        return Collections.max(notas);
    }

    public static double min(Collection<Double> notas) {
        return Collections.min(notas);
    }

    public static double media(ArrayList<Double> notas) {
        if (notas.isEmpty()) {
            System.out.println("Array vazio, adicionar elementos no array");
            return 0.0;
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public static void showResult(double max, double min, double media) {
        System.out.println("O maior número é: " + max + " , o menor é: " + min + " e a média é: " + media);
    }

}