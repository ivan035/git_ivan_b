package Crear_excepcion;

public class CMiClase
{
  // ...
  public void m(int a) throws EValorNoValido
  {
    // ...
    if (a == 0)
      throw new EValorNoValido("Error: valor cero");
    
    // ...
  }
  // ...
}
