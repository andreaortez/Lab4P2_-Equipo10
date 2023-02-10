
package lab4p2_.equipo10;

public abstract class Pieza {
    public int posI, posJ; 
    public boolean validarMov;
    
    
    public Pieza() {
        
    }

    public Pieza(int posI, int posJ, boolean validarMov) {
        this.posI = posI;
        this.posJ = posJ;
        this.validarMov = validarMov;
    }

    public int getPosI() {
        return posI;
    }

    public void setPosI(int posI) {
        this.posI = posI;
    }

    public int getPosJ() {
        return posJ;
    }

    public void setPosJ(int posJ) {
        this.posJ = posJ;
    }


    public boolean isValidarMov() {
        return validarMov;
    }

    public void setValidarMov(boolean validarMov) {
        this.validarMov = validarMov;
    }

    @Override
    public String toString() {
        return "Pieza{" + "posI=" + posI + ", posJ=" + posJ + ", novaPosI=" + ", validarMov=" + validarMov + '}';
    }    
    
    public abstract boolean Movimiento(int NovaI, int NovaJ, Object [][] matriz);//NOVAI - COORDP, NOVAJ - COORDC;
        
}
