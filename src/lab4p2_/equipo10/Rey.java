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
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i == NovaI) && (j == NovaJ)) {
                    if ((j - 1 == -1 || j + 1 == 10)) {
                        if (i - 1 == -1 || i + 1 == 10) {
                            if (matriz[NovaI][NovaJ] == " ") {
                                if ((matriz[PosI][PosJ + 2]).equals(matriz[NovaI][NovaJ])) {
                                    return true;
                                } else if ((matriz[PosI][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {
                                    return true;
                                }
                            } else {
                                if ((matriz[PosI + 1][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {
                                    return true;
                                } else if ((matriz[PosI - 1][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {
                                    return true;
                                }
                            }
                        } else {
                            if ((matriz[PosI][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
