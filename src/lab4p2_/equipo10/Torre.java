package lab4p2_.equipo10;

public class Torre extends Pieza {

    public Torre() {
    }

    public Torre(char rep, int posI, int posJ, boolean color) {
        super(rep, posI, posJ, color);
    }

    @Override
    public String toString() {
        return super.toString() + " Torre{" + '}';
    }

    @Override
    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        for (int i = 1; i < matriz.length - 1; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                if ((NovaI < -1 || NovaJ > 10)) {
                    return false;
                } else if (NovaI < -1 || NovaJ > 10) {
                    return false;
                } else {
                    int cont = 0;
                    int a1 = 1;
                    int b1 = -1;
                    while (cont == 100) {
                        if ((matriz[PosI][PosJ = PosJ + a1]).equals(matriz[NovaI][NovaJ])) {
                            return true;
                        } else if ((matriz[PosI][PosJ = PosJ - b1]) == (matriz[NovaI][NovaJ])) {
                            return true;
                        } else {
                            if ((matriz[PosI][PosJ]) instanceof Pieza) {
                                return false;
                            }
                            a1 = a1 + 1;
                            b1 = b1 - 1;
                            cont = cont + 1;
                        }
                    }

                }
            }
        }
        return false;

    }

}
