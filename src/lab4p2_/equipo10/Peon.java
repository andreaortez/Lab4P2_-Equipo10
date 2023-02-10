package lab4p2_.equipo10;

public class Peon extends Pieza {

    boolean First;

    public Peon() {
    }

    public Peon(int posI, int posJ, int novaPosI, int novaPosJ, boolean validarMov, boolean first) {
        super(posI, posJ, novaPosI, novaPosJ, validarMov);
        First = true;
    }

    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        boolean Movvalid;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i == NovaI) && (j == NovaJ)) {
                    if ((j != 0 && j != 8)) {
                        if(matriz[i][j+1] != " "){
                            return Movvalid= true;
                        }else{
                            return Movvalid= false;
                        }
                    } else if (matriz[i][j] == " ") {
                        //Validacion verdadera
                    }
                }//
            }

        }
        return false;
    }
            public static boolean first(int NovaI, int NovaJ, Object[][]){
            matriz [][]
        }
            
    @Override
    public String toString() {
        return "Peon{" + '}';
    }

}
