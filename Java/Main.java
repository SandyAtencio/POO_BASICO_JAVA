class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        // se crea un nuevo Objeto de la clase Car y se inicializa con los parametros
        // minimos en el construtor
        UberX uberX = new UberX("AMQ123", new Account("Sergio Rodriguez", "ABC123"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH345", new Account("Sandy Atencio", "DEF963"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

       
    }
}