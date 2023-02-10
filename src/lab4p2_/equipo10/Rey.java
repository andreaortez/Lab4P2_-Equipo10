
package lab4p2_.equipo10;

public class Rey extends Pieza{

    public Rey(int posI, int posJ, int novaPosI, int novaPosJ, boolean validarMov) {
        super(posI, posJ, novaPosI, novaPosJ, validarMov);
    }
    
    
    public Rey() {
    }

    @Override
    public String toString() {
        return "Rey{" + '}';
    }
    
    public boolean Movimiento(int NovaI, int NovaJ, Object [][] matriz) {
        boolean Movimiento= false;
        return Movimiento;
    }
}
