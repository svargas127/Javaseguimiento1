package Operadores1;

public class Aritmeticos {
        int valor1;
        int valor2;
        int resultado;
  void suma(){
     resultado = valor1 + valor2;
      System.out.println("resultado:"+ resultado);
  }
  void resta(){
      resultado = valor1 - valor2;
      System.out.println("resultado:"+ resultado);
  }
void dividir(){
      resultado = valor1 / valor2;
    System.out.println("Resultado:"+ resultado);
}
    public static void main(String[] args) {
       var valores = new Aritmeticos();
        valores.valor1 = 4;
        valores.valor2 = 2;
        valores.suma();
        valores.resta();
        valores.dividir();
  }
}


