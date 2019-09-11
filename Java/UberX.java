class UberX extends Car{

    String brand;
    String model;

    //metodo construtor que debe coincider con la clase padre: Car
    public UberX(String license, Account driver, String brand, String model){
        //estamos llamando el metodo construtor de la clase Car
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    //sobre escribi este metodo que pertenece a la clase padre: Car y le cambie el comportamiento
    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Marca: " + brand);
    }
}