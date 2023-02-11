package lab4p2_.equipo10;

public class Dama extends Pieza {

    public Dama() {
    }

    public Dama(char rep, int posI, int posJ, boolean color) {
        super(rep, posI, posJ, color);
    }

    @Override
    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        if ((NovaI < 1 || NovaJ > 8)) {
            return false;
        } else {
            int cont = 0, a1 = 1, b1 = -1, a = 1, b = -1, PosI2 = PosI, PosJ2 = PosJ;
            while (cont < 100) {
                if ((matriz[PosI = PosI + a][PosJ = PosJ + a]).equals(matriz[NovaI][NovaJ])) {
                    return true;
                } else if ((matriz[PosI = PosI + a][PosJ = PosJ - b]) == (matriz[NovaI][NovaJ])) {
                    return true;
                } else if ((matriz[PosI = PosI - b][PosJ = PosJ + a]) == (matriz[NovaI][NovaJ])) {
                    return true;
                } else if ((matriz[PosI = PosI - b][PosJ = PosJ - b]) == (matriz[NovaI][NovaJ])) {
                    return true;
                } else {
                    if ((matriz[PosI][PosJ]) instanceof Pieza) {
                        return false;
                    }
                }
                if ((matriz[PosI2][PosJ2 = PosJ2 + a1]).equals(matriz[NovaI][NovaJ])) {
                    return true;
                } else if ((matriz[PosI2][PosJ2 = PosJ2 - b1]) == (matriz[NovaI][NovaJ])) {
                    return true;
                } else {
                    if ((matriz[PosI2][PosJ]) instanceof Pieza) {
                        return false;
                    }
                    a1 = a1 + 1;
                    b1 = b1 - 1;
                    a = a + 1;
                    b = b - 1;

                    cont = cont + 1;
                }
            }
        }
        return false;
    }

}
