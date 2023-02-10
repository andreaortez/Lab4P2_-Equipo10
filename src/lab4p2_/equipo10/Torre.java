
package lab4p2_.equipo10;

public class Torre extends Pieza{

    
    public Torre(int posI, int posJ, int novaPosI, int novaPosJ, boolean validarMov) {
        super(posI, posJ, validarMov);
    }
    
    public Torre() {
    }

    @Override
    public String toString() {
        return super.toString()+" Torre{" + '}';
    }
    
    @Override
        public boolean Movimiento(int NovaI, int NovaJ, Object [][] matriz){
        return false;
    }

}
