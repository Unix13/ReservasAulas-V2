/**
 * 
 */
package org.iesalandalus.programacion.reservasaulas.mvc.modelo;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria.FactoriaFuenteDatosMemoria;

/**
 * @author vivas
 *
 */
public enum FactoriaFuenteDatos {
	
	MEMORIA {
		public IFuenteDatos crear() {
			return new FactoriaFuenteDatosMemoria();
		}
	};

	public abstract IFuenteDatos crear();

}
