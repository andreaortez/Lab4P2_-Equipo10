package lab4p2_.equipo10;

import java.util.Scanner;

public class Lab4P2_Equipo10 {

    static Object[][] matrix = new Object[9][9];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String comando = "";
        String jugador;

        System.out.print("Ingrese el nombre del jugador de piezas blancas: ");
        sc = new Scanner(System.in);
        String j1 = sc.nextLine();
        System.out.print("Ingrese el nombre del jugador de piezas negras: ");
        sc = new Scanner(System.in);
        String j2 = sc.nextLine();

        Object[][] n = LlenarMatriz(matrix);
        System.out.println("\n" + Imprimir(n));
        
        jugador=j1;
        System.out.println("Turno de: " + jugador);

        System.out.print("Ingrese la pieza a mover y su destino ->\n[<pieza>|<ubicación actual>-<destino>]: ");//p|a2-a3
        sc = new Scanner(System.in);
        comando = sc.nextLine();

        do {
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
            
            if (jugador==j1) {//para validar que quiere mover las piezas blancas
                if (matrix[ubic1][ubic2] instanceof Pieza) {
                    if (((Pieza)matrix[ubic1][ubic2]).isColor()==false) {
                        break;
                    }
                }
            }
            
            if (jugador==j2) {//para validar que quiere mover las piezas negras
                if (matrix[ubic1][ubic2] instanceof Pieza) {
                    if (((Pieza)matrix[ubic1][ubic2]).isColor()==true) {
                        break;
                    }
                }
            }

            Object o = matrix[(char) ubic1][ubic2];

            boolean val;
            if (o instanceof Peon) {
                val = ((Peon) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
                if (val) {
                    matrix[ubic1][ubic2] = " ";
                    matrix[dest1][dest2] = ((Peon) o).rep;
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            } else if (o instanceof Caballo) {
                val = ((Caballo) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
                if (val) {
                    matrix[ubic1][ubic2] = " ";
                    matrix[dest1][dest2] = ((Caballo) o).rep;
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            } else if (o instanceof Alfil) {
                val = ((Alfil) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
                if (val) {
                    matrix[ubic1][ubic2] = " ";
                    matrix[dest1][dest2] = ((Alfil) o).rep;
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            } else if (o instanceof Torre) {
                val = ((Torre) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
                if (val) {
                    matrix[ubic1][ubic2] = " ";
                    matrix[dest1][dest2] = ((Torre) o).rep;
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            } else if (o instanceof Rey) {
                val = ((Rey) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
                if (val) {
                    matrix[ubic1][ubic2] = " ";
                    matrix[dest1][dest2] = ((Rey) o).rep;
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            } else if (o instanceof Dama) {
                val = ((Dama) o).Movimiento(ubic1, ubic2, dest1, dest2, matrix);
                if (val) {
                    matrix[ubic1][ubic2] = " ";
                    matrix[dest1][dest2] = ((Dama) o).rep;
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            }
            
            System.out.println("\n" + Imprimir(matrix));

            System.out.print("Ingrese la pieza a mover y su destino\n[<pieza>|<ubicación actual>-<destino>]: ");//p|a2-a3
            sc = new Scanner(System.in);
            comando = sc.nextLine();

        } while (comando != "gusbai");
    }

    static public Object[][] LlenarMatriz(Object[][] tablero) {
        int pos1 = 1, abc = 65;

        for (int i = 0; i < tablero.length; i++) {//fila
            for (int j = 0; j < tablero[0].length; j++) {//columna
                if (j == 0 && pos1<9) {//1-8
                    tablero[i][j] = pos1;
                    pos1++;
                } else if (i == tablero.length - 1 && j > 0) {//A-H
                    tablero[i][j] = (char) abc;
                    abc++;
                } else if (i == 1) {//peones negros
                    Peon p = new Peon('p', i, j,false);
                    tablero[i][j] = p.rep;
                } else if (i == 6) {//peones blancos
                    Peon P = new Peon('P', i, j,true);
                    tablero[i][j] = P.rep;
                } else if (i == 0 && (j == 1 || j == 8)) {//torres negras
                    Torre r = new Torre('r', i, j,false);
                    tablero[i][j] = r.rep;
                } else if (i == 7 && (j == 1 || j == 8)) {//torres blancas
                    Torre R = new Torre('R', i, j,true);
                    tablero[i][j] = R.rep;
                } else if (i == 0 && (j == 2 || j == 7)) {//caballos negros
                    Caballo n = new Caballo('n', i, j,false);
                    tablero[i][j] = n.rep;
                } else if (i == 7 && (j == 2 || j == 7)) {//caballos blancos
                    Caballo N = new Caballo('N', i, j,true);
                    tablero[i][j] = N.rep;
                } else if (i == 0 && (j == 3 || j == 6)) {//alfil negros
                    Alfil b = new Alfil('b', i, j,false);
                    tablero[i][j] = b.rep;
                } else if (i == 7 && (j == 3 || j == 6)) {//alfil blancos
                    Alfil B = new Alfil('B', i, j,true);
                    tablero[i][j] = B.rep;
                } else if (i == 0 && j == 4) {//reina negra
                    Dama q = new Dama('q', i, j,false);
                    tablero[i][j] = q.rep;
                } else if (i == 7 && j == 4) {//reina blanca
                    Dama Q = new Dama('Q', i, j,true);
                    tablero[i][j] = Q.rep;
                } else if (i == 0 && j == 5) {//rey negro
                    Rey k = new Rey('k', i, j,false);
                    tablero[i][j] = k.rep;
                } else if (i == 7 && j == 5) {//rey blanco
                    Rey K = new Rey('K', i, j,true);
                    tablero[i][j] = K.rep;
                } else {
                    tablero[i][j] = " ";
                }
            }
        }
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
