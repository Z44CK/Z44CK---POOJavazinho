import MusicaApp.ReprodutorMusical;
import MusicaApp.ReprodutorMusicalApp;
import NavegadorApp.NavegadorInternet;
import NavegadorApp.NavegadorInternetApp;
import TelefoneApp.Telefone;
import TelefoneApp.TelefoneAppc;

public class Celular {
    public static void main(String[] args) {
        
        ReprodutorMusical reprodutor = new ReprodutorMusicalApp();
        reprodutor.selecionarMusica("Tocando Musica");
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.tocarPLaylist("Tocaando Playlist");

        System.out.println("\n");
        Telefone ligar = new TelefoneAppc();
        ligar.atender();
        ligar.desligar();
        ligar.ligar("Digitando numero");
        ligar.slavarContatos("Lista de Contatos");

        System.out.println("\n");
        NavegadorInternet navega = new NavegadorInternetApp();
        navega.barraPesquisa();
        navega.atualizarPagina();
        navega.exibirPaginaWeb("URL");
        navega.novaAba();
    }

}
