package uniandes.cupi2.videotienda.mundo;

import java.util.ArrayList;

public class Cliente
{

   //-----------------------------------------------------------------
   // Atributos
   //-----------------------------------------------------------------

   private String Cedula;
   
   
   private String Nombre;
   
   
   private String Direccion;
   
   
   private int Saldo;

   private ArrayList<Copia>  alquiladas;
   //-----------------------------------------------------------------
   // Constructores
   
   
   public Cliente (String cedula, String nombre, String direccion)
   {
	   Cedula = cedula;
	   Nombre = nombre;
	   Direccion = direccion;
	   Saldo = 0;
	   alquiladas = new ArrayList<>();
   }
   
   public String darCedula()
   {
	   return Cedula;
   }
   
   public String darNombre()
   {
	   return Nombre;
   }
   
   public String darDireccion()
   {
	   return Direccion;
   }
   
   public int darSaldo()
   {
	   return Saldo;
   }
   
   public int cargarSaldo(int monto)
   {
	   return Saldo += monto;
   }
   
   public int descargarSaldo(int monto)
   {
	   return Saldo -= monto;
   }
   
   public void alquilarCopia(Copia copia)
   {
	    alquiladas.add(copia);
   }
   
   public int darNumeroAlquiladas() 
   {
	    return alquiladas.size();
   }
   
   public ArrayList<Copia> darAlquiladas() 
   {
	    return alquiladas;
   }
   
   public Copia buscarPeliculaAlquilada(String titulo, int numeroCopia) 
   {
	    for (Copia copia : alquiladas) {
	    	if (copia.darTituloPelicula().equals(titulo) && copia.darCodigo() == numeroCopia)
	    		return copia;
	    }
   
   return null;
}
   public void devolverCopia(String titulo, int numeroCopia) 
   {
	    Copia copiaADevolver = null;
	    for (Copia copia : alquiladas) {
	    	if (copia.darTituloPelicula().equals(titulo) && copia.darCodigo() == numeroCopia) {
	    	copiaADevolver = copia;
	    	break;
	    }
   }
   if (copiaADevolver != null) {
	   alquiladas.remove(copiaADevolver);
   }
}
}