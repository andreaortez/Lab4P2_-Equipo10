
package lab4p2_.equipo10;

public abstract class Pieza {
    public int posI, posJ, novaPosI, novaPosJ; 
    public boolean validarMov;
    
    
    public Pieza() {
        
    }

    public Pieza(int posI, int posJ, int novaPosI, int novaPosJ, boolean validarMov) {
        this.posI = posI;
        this.posJ = posJ;
        this.novaPosI = novaPosI;
        this.novaPosJ = novaPosJ;
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

    public int getNovaPosI() {
        return novaPosI;
    }

    public void setNovaPosI(int novaPosI) {
        this.novaPosI = novaPosI;
    }

    public int getNovaPosJ() {
        return novaPosJ;
    }

    public void setNovaPosJ(int novaPosJ) {
        this.novaPosJ = novaPosJ;
    }

    public boolean isValidarMov() {
        return validarMov;
    }

    public void setValidarMov(boolean validarMov) {
        this.validarMov = validarMov;
    }

    @Override
    public String toString() {
        return "Pieza{" + "posI=" + posI + ", posJ=" + posJ + ", novaPosI=" + novaPosI + ", novaPosJ=" + novaPosJ + ", validarMov=" + validarMov + '}';
    }    
    
    public boolean Movimiento(int NovaI, int NovaJ, Object [][] matriz){
        return false;
    }
        
}
