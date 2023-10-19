package Vehiculos;

public class VehiculoAcuatico extends Vehiculo implements Vela, Motor{

    public VehiculoAcuatico(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }
    
    void acelerar(int velocidad){
        int vel = velocidadActual+velocidad;
        if (vel>velocidadMaxima) {
            System.out.println("No se puede superar la velocidad máxima");
        } else {
            velocidadActual=vel;
        }
    }
    void frenar(int velocidad){
        int vel=velocidadActual-velocidad;
        if (vel<0) {
            System.out.println("No puede reducir la velocidad a un valor menor a 0");
        } else {
            velocidadActual=vel;
        }
    }
    public int calcularRevolucionesMotor(int fuerza, int radio){
        return (fuerza*radio);
    }
    public void recomendarVelocidad(int velocidadViento){
        if (velocidadViento>80||velocidadViento<10) {
            velocidadActual=0;
        }
    }
    
}
