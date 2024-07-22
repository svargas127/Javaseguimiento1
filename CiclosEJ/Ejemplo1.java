package CiclosEJ;

public class Ejemplo1 {
    public void Motos(int modelos){
        switch (modelos){
            case 1:
                System.out.println("Oh, tienes una: Naked" );
        break;

            case 2:
                System.out.println("Oh, tienes una: Sport");
                break;

            default:
                System.out.println("Oh, esa moto no esta categorizada");
                System.out.println("que buena elección");

        }
    }
}
