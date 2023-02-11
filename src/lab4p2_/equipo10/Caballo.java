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
        for (int i = 1; i < matriz.length - 1; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                if ((i == NovaI) && (j == NovaJ)) {
                    if ((j - 1 == 0 || j + 1 == 9)) {
                        if (i - 1 == 0 || i + 1 == 9) {
                            if ((matriz[PosI + 1][PosJ + 2]).equals(matriz[NovaI][NovaJ])) {
                                return true;
                            } else if ((matriz[PosI + 1][PosJ - 2]) == (matriz[NovaI][NovaJ])) {
                                return true;
                            } else if ((matriz[PosI - 1][PosJ + 2]) == (matriz[NovaI][NovaJ])) {
                                return true;
                            } else if ((matriz[PosI - 1][PosJ - 2]) == (matriz[NovaI][NovaJ])) {
                                return true;
                            } else if ((matriz[PosI - 2][PosJ - 1]) == (matriz[NovaI][NovaJ])) {
                                return true;
                            } else if ((matriz[PosI - 2][PosJ - 1]) == (matriz[NovaI][NovaJ])) {
                                return true;
                            } else if ((matriz[PosI + 2][PosJ + 1]) == (matriz[NovaI][NovaJ])) {
                                return true;
                            } else if ((matriz[PosI + 2][PosJ - 1]) == (matriz[NovaI][NovaJ])) {
                                return true;
                            } else {
                            }

                        }
                    }
                }
            }
        }
        return false;
    }

}
