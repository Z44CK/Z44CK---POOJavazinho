package TelefoneApp;

public class TelefoneAppc implements Telefone {
    public void ligar(String numero){
        System.out.println("Ligando");
    }

    public void desligar() {
        System.out.println("Desligando chamada");
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void slavarContatos(String contato) {
        System.out.println("Salvando contato novo");
    }
}
