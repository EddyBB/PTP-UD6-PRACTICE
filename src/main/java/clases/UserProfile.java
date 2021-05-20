package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Esta clase perfil de usuario tiene los datos del usuario
 * en una famosa red Social
 * 
 * @author eserrano
 *
 */
public class UserProfile{
	
	/**
	 * Atributos de la clase
	 * 
	 * <b>nick</b> atributo de tipo cadena. Los nick son unicos. Solo
	 * puede haber un usuario con el mismo nick. No se distingue entre
	 * Mayusculas y minusculas 
	 * 
	 * <b>regDate</b> atributo de tipo fecha "LocalDate". Registra la fecha en la que
	 * el usuario se dio de alta en la red social. La fecha sigue el formato
	 * "dd/MM/yyyy"
	 * 
	 * <b>rating</b> atributo de tipo Float. almacena la media de las puntuaciones
	 * recibidas por popularidad recibida de otros usuarios.
	 */
	
	private String nick;
	private LocalDate regDate;
	private Float rating;
	
	/**
	 * 
	 */
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nick
	 * @param regDate
	 * @param rating
	 */
	public UserProfile(String nick, LocalDate regDate, Float rating) {
		this.nick = nick;
		this.regDate = regDate;
		this.rating = rating;
	}
	
	
	/**
	 * Metodos de la clase
	 * 
	 * Generar el constructor por defecto 
	 * Generar constructor sobrecargado con todos los atributos.
	 * Generar todos los getters/setters
	 * Generar un metodo equals que devuelve verdadero cuando el
	 * nick es el mismo y falso en caso contrario
	 */
	
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public String getNick() {
		return nick;
	}

	/**
	 * @return the regDate
	 */
	public LocalDate getRegDate() {
		return regDate;
	}

	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	/**
	 * @return the rating
	 */
	public Float getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Float rating) {
		this.rating = rating;
	}

	@Override
	public boolean equals(Object o) {
		boolean retorno = false;
		
		if(o instanceof UserProfile) {
			UserProfile ob = (UserProfile) o;
			retorno = nick.equalsIgnoreCase(ob.nick);
		}
		return retorno;
	}
	
	public String toStringFichero() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return nick + ">" + regDate.format(formatter) + ">" + rating;
		
	}
}
