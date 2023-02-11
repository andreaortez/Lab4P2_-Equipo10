package lab4p2_.equipo10;

public class Caballo extends Pieza {

    public Caballo() {
    }

    public Caballo(char rep, int posI, int posJ, boolean color) {
        super(rep, posI, posJ, color);
    }

    @Override
    public String toString() {
        return super.toString() + " Caballo{" + '}';
    }

    @Override
    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        if (matriz[NovaI][NovaJ] == " ") {
            if ((matriz[PosI + 2][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {//negras --- derecha
                return true;
            } else if ((matriz[PosI + 2][PosJ - 1]) == (matriz[NovaI][NovaJ])) {//izquierda
                return true;
            } else if ((matriz[PosI - 2][PosJ + 1]) == (matriz[NovaI][NovaJ])) {//blanca derehca
                return true;
            } else if ((matriz[PosI - 2][PosJ - 1]) == (matriz[NovaI][NovaJ])) {//blanca izquierda
                return true;
//                        } else if ((matriz[PosI - 2][PosJ - 1]) == (matriz[NovaI][NovaJ])) {
//                            return true;
//                        } else if ((matriz[PosI - 2][PosJ - 1]) == (matriz[NovaI][NovaJ])) {
//                            return true;
//                        } else if ((matriz[PosI + 2][PosJ + 1]) == (matriz[NovaI][NovaJ])) {
//                            return true;
//                        } else if ((matriz[PosI + 2][PosJ - 1]) == (matriz[NovaI][NovaJ])) {
//                            return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
