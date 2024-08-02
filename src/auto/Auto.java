public class Auto {
    private String marca;
    private String color;
    private String tipo;
    private String modelo;
    private int pasajeros;


    public Auto(String marca, String color, String tipo, String modelo, int pasajeros) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.modelo = modelo;
        this.pasajeros = pasajeros;
    }


    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getpasajeros() {
        return pasajeros;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setpasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void minfo() {
        System.out.println("mmarca: " + marca);
        System.out.println("color: " + color);
        System.out.println("tipo: " + tipo);
        System.out.println("modelo: " + modelo);
        System.out.println("pasajeros: " + pasajeros);
    }
}
