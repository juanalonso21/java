package poo;

public class Vehiculo {
    //una clase contiene propiedades y metodos
    //ambito de la propiedad o el metodo pueden ser public private o protected
    private String marca;
    private String modelo;
    //el this se usa para sustituir el llamar variables de clase en los estaticos

    public void setMarca (String Nombre){
        this.marca = Nombre.toUpperCase();
    }
    public void setModelo (String Nombre){
        this.modelo = Nombre.toLowerCase();
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void visualizacionClase() {
        System.out.println("Vehiculo 1 es un " + this.getMarca()+ " "+ this.getModelo());
    }
}
