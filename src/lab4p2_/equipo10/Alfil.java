package lab4p2_.equipo10;

import static lab4p2_.equipo10.Peon.first;

public class Alfil extends Pieza {

    public Alfil() {
    }

    public Alfil(char rep, int posI, int posJ, boolean color) {
        super(rep, posI, posJ, color);
    }
    
    @Override
    public String toString() {
        return super.toString() + " Alfil{" + '}';
    }

    @Override
    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                    if ((j - 1 == -1 || j + 1 == 10)) {
                        if (i - 1 == -1 || i + 1 == 10) {
                            } else if (matriz[i][j] == " ") {
                                
                            }
                        }
                }
            }
        return false;    }

}
