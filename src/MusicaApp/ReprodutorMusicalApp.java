package MusicaApp;

public class ReprodutorMusicalApp implements ReprodutorMusical{
    public void tocar() {
        System.out.println("Tocando musica!");

    }

    public void pausar() {
        System.out.println("Musica pausada");

    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica");

    }

    public void tocarPLaylist(String playlist) {
        System.out.println("Tocando Playlist selecionada");

    }
}