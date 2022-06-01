package Crear_excepcion;

public class EValorNoValido extends Exception
{
  public EValorNoValido() {}
  public EValorNoValido(String mensaje)
  {
    super(mensaje);
  }
}
