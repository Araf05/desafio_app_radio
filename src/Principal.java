import io.araf.radiosound.modelos.Cancion;
import io.araf.radiosound.modelos.MisFavoritos;
import io.araf.radiosound.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setCantante("Kiss");
        miCancion.setTitulo("Forever");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 200; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 4000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalReproducciones());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favorito = new MisFavoritos();
        favorito.adiciona(miPodcast);
        favorito.adiciona(miCancion);
    }
}
