package uniandes.cupi2.videotienda.mundo;


public class Cliente
{

   //-----------------------------------------------------------------
   // Atributos
   //-----------------------------------------------------------------

   private String Cedula;
   
   
   private String Nombre;
   
   
   private String Direccion;
   
   
   private int Saldo;

   //-----------------------------------------------------------------
   // Constructores
   
   
   public Cliente (String cedula, String nombre, String direccion)
   {
	   this.Cedula = cedula;
	   this.Nombre = nombre;
	   this.Direccion = direccion;
	   this.Saldo = 0;
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
   
}