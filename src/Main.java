//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Objeto Rosa
        Flor rosa = new Flor();
        rosa.setTipo("Californica");
        rosa.setColor("Roja");
        rosa.setSexo("Hermafrodita");
        rosa.setTamano(17.8f);
        rosa.imprimirDetalle();

        //Objeto Girasol
        Flor girasol = new Flor();
        girasol.setTipo("Teddy Bear");
        girasol.setColor("Amarilla");
        girasol.setSexo("Hermafrodita");
        girasol.setTamano(30f);
        girasol.imprimirDetalle();

        //Objeto Tulipan
        Flor tulipan = new Flor();
        tulipan.setTipo("Bakeri");
        tulipan.setColor("Rosada");
        tulipan.setSexo("Macho");
        tulipan.setTamano(12.9f);
        tulipan.imprimirDetalle();

    }
}