package NavegadorApp;

public class NavegadorInternetApp implements NavegadorInternet {

    public void exibirPaginaWeb(String url) {
        System.out.println("Exibindo pagina web requisitada");

    }

    public void novaAba() {
        System.out.println("Exibindo nova aba");

    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina web");

    }

    public void barraPesquisa() {
        System.out.println("Pesquisado pela barra de pesquisa do navegador");

    }
}
