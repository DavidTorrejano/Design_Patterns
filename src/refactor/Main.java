package refactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ConstructorLargoBuilder persona = new ConstructorLargoBuilder("Mateo")
                .apellido("Prada")
                .identidad(25355)
                .profesion("Escultor")
                .hobbie("Tocar la guitarra");


    }

    public static void imprimeMayorMenor(int[] numeros){
        int mayor = Arrays.stream(numeros).reduce(numeros[0], Math::max);
        int menor = Arrays.stream(numeros).reduce(numeros[0], Math::min);

        System.out.println("Máximo: " + mayor + ", mínimo: " + menor);
    }
}
