package lab4p2_.equipo10;

public class Rey extends Pieza {

    public Rey() {
    }

    public Rey(char rep, int posI, int posJ, boolean color) {
        super(rep, posI, posJ, color);
    }

    @Override
    public String toString() {
        return "Rey{" + '}';
    }

    @Override
    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        if ((NovaI < 1 || NovaJ > 8)) {
            if (matriz[NovaI][NovaJ] == " ") {
                if ((matriz[PosI + 1][PosJ]).equals(matriz[NovaI][NovaJ])) {//arriba
                    return true;
                } else if ((matriz[PosI][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {//lado derecho
                    return true;
                } else if ((matriz[PosI + 1][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {//arriba derecha
                    return true;
                } else if ((matriz[PosI + 1][PosJ - 1]).equals(matriz[NovaI][NovaJ])) {//arriba izquierda
                    return true;
                } else if ((matriz[PosI - 1][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {//abajo derecho
                    return true;
                } else if ((matriz[PosI - 1][PosJ - 1]).equals(matriz[NovaI][NovaJ])) {//abajo izquierda
                    return true;
                } else if ((matriz[PosI][PosJ - 1]).equals(matriz[NovaI][NovaJ])) {//lado izquierdo
                    return true;
                } else if ((matriz[PosI - 1][PosJ]).equals(matriz[NovaI][NovaJ])) {//abajo
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}
