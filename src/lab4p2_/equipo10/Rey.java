
package lab4p2_.equipo10;

public class Rey extends Pieza{

    public Rey(char rep, int posI, int posJ) {
        super(rep, posI, posJ);
    }

    
    
    public Rey() {
    }

    @Override
    public String toString() {
        return "Rey{" + '}';
    }
    
    @Override
    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        boolean Movvalid;
        boolean Inicio;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i == NovaI) && (j == NovaJ)) {
                    if ((j - 1 == -1 || j + 1 == 10)) {
                        if (i - 1 == -1 || i + 1 == 10) {
                            } else if (matriz[i][j] == " ") {
                                Movvalid = true;
                            } else {
                                Movvalid = false;
                            }
                        }
                    }
                    Movvalid = false;
                }
            }
        return false;    }

}

