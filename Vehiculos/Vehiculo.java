package Vehiculos;

/**
 * Vehiculo
 */
public abstract class Vehiculo {
    int velocidadActual;
    int velocidadMaxima;
    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }
    void imprimir(){
        System.out.println("Velocidad actual = " +velocidadActual);
        System.out.println("velocidadMaxima = " +velocidadMaxima);
    }
    abstract void acelerar(int velocidad);
    abstract void frenar(int velocidad);

    
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    
    
    
}