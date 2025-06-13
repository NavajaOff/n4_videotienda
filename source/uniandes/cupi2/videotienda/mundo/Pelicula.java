/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * $Id: Pelicula.java,v 1.1 2005/12/16 15:13:33 k-marcos Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n4_videotienda
 * Autor: Katalina Marcos - Diciembre 2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.videotienda.mundo;

import java.util.ArrayList;

/**
 * Esta clase representa una pel�cula que se encuentra en la videotienda y
 * de la cual puede haber copias disponibles o prestadas.
 */ 
public class Pelicula
{

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * T�tulo de la pel�cula
     */
    private String titulo;

    /**
     * Lista de copias disponibles
     */
    private ArrayList disponibles;

    /**
     * Lista de copias prestadas
     */
    private ArrayList prestadas;

    /**
     * N�mero de la siguiente copia a adicionar
     */
    private int codigoSiguienteCopia;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------
    /**
     * Crea una pel�cula de la videotienda con el t�tulo dado. <br>
     * <b>post: </b> La pel�cula se crea sin copias disponibles ni prestadas.
     * @param unTitulo T�tulo de la pel�cula. unTitulo != null.
     */
    public Pelicula( String unTitulo )
    {
    	titulo = unTitulo;
		disponibles = new ArrayList<>();
		prestadas = new ArrayList<>();
		codigoSiguienteCopia = 1;
    	//TODO implementar inicializando los atributos
    }

    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------

    /**
     * Adiciona una nueva copia de la pel�cula. <br>
     * <b>post: </b>La lista de pel�culas disponibles tiene una nueva copia.
     * @return c�digo de la copia creada. c�digo >= 1;
     */
    public int agregarCopia( )
    {
    	Copia nueva = new Copia(codigoSiguienteCopia);
    	disponibles.add(nueva);
    	return codigoSiguienteCopia ++;
    	//TODO implementar. Recuerde retornar lo indicado en la documentaci�n. 
    }

}