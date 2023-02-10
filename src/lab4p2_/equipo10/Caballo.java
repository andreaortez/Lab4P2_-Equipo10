
package lab4p2_.equipo10;

public class Caballo extends Pieza{

    public Caballo(int posI, int posJ, int novaPosI, int novaPosJ, boolean validarMov) {
        super(posI, posJ, validarMov);
    }
    
    public Caballo() {
    }
    
    @Override
    public String toString() {
        return super.toString() +" Caballo{" + '}';
    }
    
        public boolean Movimiento(int NovaI, int NovaJ, Object [][] matriz) {
        return false;
    }

}
