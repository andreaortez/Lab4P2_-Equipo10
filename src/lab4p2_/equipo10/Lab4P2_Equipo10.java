package lab4p2_.equipo10;

import java.util.Scanner;

public class Lab4P2_Equipo10 {

    static Object[][] matrix = new Object[9][9];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String comando = "";

        System.out.print("Ingrese el nombre del jugador de piezas blancas: ");
        sc = new Scanner(System.in);
        String j1 = sc.nextLine();
        System.out.print("Ingrese el nombre del jugador de piezas negras: ");
        sc = new Scanner(System.in);
        String j2 = sc.nextLine();

        Object[][] n = LlenarMatriz(matrix);
        System.out.println("\n" + Imprimir(n));

        do {
            System.out.print("Ingrese la pieza a mover y su destino: [<pieza>|<ubicación actual>-<destino>]");//p|a2-a3
            sc = new Scanner(System.in);
            comando = sc.nextLine();

            String[] coord = comando.split("|");
            String[] mov = coord[1].split("-");
            String mov1 = mov[0];//ubicacion actual
            String mov2 = mov[1];//destino

            char pos = mov1.charAt(0);
            int ubic1 = (int) pos - 49;//primera coordenada
            int ubic2 = mov1.charAt(1);//segunda coordenada

            pos = mov2.charAt(0);
            int dest1 = (int) pos - 49;
            int dest2 = mov2.charAt(1);

            Object o = matrix[(char) ubic1][ubic2];

            boolean val;
            if (o instanceof Peon) {
                val = ((Peon) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
            } else if (o instanceof Caballo) {
                val = ((Caballo) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
            } else if (o instanceof Alfil) {
                val = ((Alfil) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
            } else if (o instanceof Torre) {
                val = ((Torre) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
            } else if (o instanceof Rey) {
                val = ((Rey) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
            } else if (o instanceof Dama) {
                val = ((Dama) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
            }

            if (val==true) {
                matrix[ubic1][ubic2] = " ";
                matrix[dest1][dest2] = 
            }else{
                System.out.print("Movimiento no válido\n");
            }

            System.out.print("Ingrese la pieza a mover y su destino: [<pieza>|<ubicación actual>-<destino>]");//p|a2-a3
            sc = new Scanner(System.in);
            comando = sc.nextLine();

        } while (comando != "gusbai");
    }

    static public Object[][] LlenarMatriz(Object[][] tablero) {
        int pos1 = 8, abc = 65;

        for (int i = 0; i < tablero.length; i++) {//fila
            for (int j = 0; j < tablero[0].length; j++) {//columna
                if (j == 0 && pos1 > 0) {//8-1
                    tablero[i][j] = pos1;
                    pos1--;
                } else if (i == tablero.length - 1 && j > 0) {//A-H
                    tablero[i][j] = (char) abc;
                    abc++;
                } else if (i == 1) {//peones negros
                    Peon p = new Peon();
                    tablero[i][j] = p;
                } else if (i == 6) {//peones blancos
                    Peon P = new Peon();
                    tablero[i][j] = P;
                } else if (i == 0 && (j == 1 || j == 8)) {//torres negras
                    Torre r = new Torre();
                    tablero[i][j] = r;
                } else if (i == 7 && (j == 1 || j == 8)) {//torres blancas
                    Torre R = new Torre();
                    tablero[i][j] = R;
                } else if (i == 0 && (j == 2 || j == 7)) {//caballos negros
                    Caballo n = new Caballo();
                    tablero[i][j] = n;
                } else if (i == 7 && (j == 2 || j == 7)) {//caballos blancos
                    Caballo N = new Caballo();
                    tablero[i][j] = N;
                } else if (i == 0 && (j == 3 || j == 6)) {//alfil negros
                    Alfil b = new Alfil();
                    tablero[i][j] = b;
                } else if (i == 7 && (j == 3 || j == 6)) {//alfil blancos
                    Alfil B = new Alfil();
                    tablero[i][j] = B;
                } else if (i == 0 && j == 4) {//reina negra
                    Dama q = new Dama();
                    tablero[i][j] = q;
                } else if (i == 7 && j == 4) {//reina blanca
                    Dama Q = new Dama();
                    tablero[i][j] = Q;
                } else if (i == 0 && j == 5) {//rey negro
                    Rey k = new Rey();
                    tablero[i][j] = k;
                } else if (i == 7 && j == 5) {//rey blanco
                    Rey K = new Rey();
                    tablero[i][j] = K;
                } else {
                    tablero[i][j] = " ";
                }
            }
        }
//        R1 = 6 + sc.nextInt(4);
//        R2 = 0 + sc.nextInt(10);
//        int O1 = 6 + sc.nextInt(4);
//        int O2 = 0 + sc.nextInt(10);
//        mapa[R1][R2] = "R";
//        mapa[O1][O2] = "O";
        return tablero;
    }

    static public String Imprimir(Object[][] tablero) {
        String cad = "";
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (j == 0) {
                    cad += tablero[i][j];
                } else if (i == tablero.length - 1) {
                    cad += " " + tablero[i][j] + " ";
                } else {
                    cad += "[" + tablero[i][j] + "]";
                }
            }
            cad += "\n";
        }
        return cad;
    }
}
