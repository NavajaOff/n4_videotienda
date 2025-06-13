/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * $Id: VideoTienda.java,v 1.1 2005/12/16 15:13:33 k-marcos Exp $
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingenieía de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n4_videotienda
 * Autor: Katalina Marcos - Diciembre 2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.videotienda.mundo;

/**
 * Esta clase representa una copia de una película en la videotienda
 */ 

public class Copia 
{
	//-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
	
	/**
	 * Titulo de la película
	 */
	private String tituloPelicula;
	
	/**
	 * Código único de la copia
	 */
	private int codigo;
	
	//-----------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------
	
	/**
	 * Crear una nueva copia de una película
	 * @param laPelicula Titulo de la película. laPicula != null
	 * @param elCodigo Código único de la copia. elCodigo > 0
	 */
	
	public Copia(String laPelicula, int elCodigo)
	{
		tituloPelicula = laPelicula;
		codigo = elCodigo;
	}
}
