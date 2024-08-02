public class Principal {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Rojo", "Sedan", "Corolla", 5);

        miAuto.minfo();

        miAuto.setColor("Azul");
        miAuto.setpasajeros(4);

        System.out.println("\nInformación actualizada del auto:");
        miAuto.minfo();
    }
}
