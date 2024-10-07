public class Flor {
    //Declaración de atributos
    private String tipo;
    private String color;
    private float tamano;
    private String sexo;
    //Getter y Setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float getTamano() {
        return tamano;
    }
    public void setTamano(float tamano) {
        this.tamano = tamano;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //Metodo para imprimir
    public void imprimirDetalle(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Color: " + this.color);
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Tamaño: " + this.getTamano());
    }
}
