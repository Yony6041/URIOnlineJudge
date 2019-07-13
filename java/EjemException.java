public class EjemException{
  public static void main(String[] args){
    try{
        System.out.println(5/0);
    }
    catch(ArithmeticException exception){
      System.out.println("No se puede la division por cero");
    }

    System.out.println("Adios");
    //ArrayIndexOutOfBounds
    try{
      int[] array = {2,3,4,5};
      System.out.println(array[4]);
    }
    catch(ArrayIndexOutOfBoundsException exception){
      System.out.println("Se genero una exception, indice incorrecto");
    }
    catch(Exception exception){
      System.out.println("Entró al ");
    }

  }
}
