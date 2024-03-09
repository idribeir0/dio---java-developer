package Projetinhos;
//teste
public class smartTV {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public static void main(String[] args) {
        smartTV tv = new smartTV(); // Criando uma instância da classe SmartTV
        tv.ligar(); // Ligar a TV

        // Testando métodos para mudar canal e volume
        tv.mudarCanal(5);
        tv.aumentarVolume();
        tv.diminuirVolume();

        tv.desligar(); // Desligar a TV
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal alterado para: " + canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV desligada.");
    }
}
