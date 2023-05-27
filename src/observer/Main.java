package observer;

public class Main {
    public static void main(String[] args) {

        Emisora emisora= new Emisora();

        ReceptorTV receptorTV = new ReceptorTV();
        ReceptorRadio receptorRadio = new ReceptorRadio();
        ReceptorSatelite receptorSatelite = new ReceptorSatelite();

        emisora.nuevoReceptor(receptorTV);
        emisora.nuevoReceptor(receptorRadio);
        emisora.nuevoReceptor(receptorSatelite);

        emisora.emite();

    }
}
