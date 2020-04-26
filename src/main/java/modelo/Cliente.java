package modelo;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "Ciente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name="nombres", nullable = false, length = 70 )
	private String nombres;
	@Column(name="apellidos", nullable = false, length = 80 )
	private String apellidos;
	@Column(name="direccion", nullable = true, length = 100 )
	private String direccion;
	@Column(name="telefono", nullable = true, length =  15 )
	private String telefono;
	@Column(name="mail", nullable = true, length = 30 )
	private String mail;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

}
