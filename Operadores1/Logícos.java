package Operadores1;

public class Logícos {
        boolean expresion1;
        boolean expresion2;

        void verificarExpresiones() {
            System.out.println("*** con AND ***");
            boolean resultadoAnd = expresion1 && expresion2;
            System.out.println("Resultado de expresion1 && expresion2: " + resultadoAnd);

            System.out.println("*** con OR ***");
            boolean resultadoOr = expresion1 || expresion2;
            System.out.println("Resultado de expresion1 || expresion2: " + resultadoOr);

            System.out.println("*** con NOT ***");
            boolean resultadoNot = !expresion1;
            System.out.println("Resultado de !expresion1: " + resultadoNot);
        }

        public static void main(String[] args) {
            var operaciones = new Logícos();
            operaciones.expresion1 = true;
            operaciones.expresion2 = false;
            operaciones.verificarExpresiones();
        }
    }
