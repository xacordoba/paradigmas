Import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ruleta {
    private static final int NUMERO_DIVISIONES = 3;
    private static int divisionGanadora;

    public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random random = new Random();

        List<String> continentes = new ArrayList<>();
        continentes.add("Europa");
        continentes.add("América");
        continentes.add("Asia");

        // Generar un ángulo de giro aleatorio entre 0 y 360 grados
        int randomAngle = random.nextInt(360);

        divisionGanadora = (randomAngle / (360 / NUMERO_DIVISIONES));

        // Obtener el continente ganador utilizando la división ganadora
        String continenteGanador = continentes.get(divisionGanadora);

        // Imprimir el resultado
        System.out.println("El continente seleccionado es: " + continenteGanador);
}
}