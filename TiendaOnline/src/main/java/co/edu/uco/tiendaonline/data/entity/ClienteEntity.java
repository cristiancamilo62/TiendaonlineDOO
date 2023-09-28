package co.edu.uco.tiendaonline.data.entity;

import java.sql.Date;
import java.util.UUID;

import co.edu.uco.tiendaonline.data.entity.support.CorreoElectronicoClienteEntity;
import co.edu.uco.tiendaonline.data.entity.support.NombreCompletoClienteEntity;
import co.edu.uco.tiendaonline.data.entity.support.NumeroTelefonoClienteEntity;

public class ClienteEntity {
	private UUID id;
	private TipoIdentificacionEntity tipoIdentificacion;
	private String identificacion;
	private NombreCompletoClienteEntity nombreCompleto;
	private CorreoElectronicoClienteEntity correoElectronico;
	private NumeroTelefonoClienteEntity numeroTelefono;
	private Date fechaNacimiento;



	private ClienteEntity(final UUID id, final TipoIdentificacionEntity tipoIdentificacion, final String identificacion, final NombreCompletoClienteEntity nombreCompleto,
			CorreoElectronicoClienteEntity correoElectronico, NumeroTelefonoClienteEntity numeroTelefono, final Date fechaNacimiento) {
		setId(id);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(identificacion);
		setNombreCompleto(nombreCompleto);
		setCorreoElectronico(correoElectronico);
		setNumeroTelefono(numeroTelefono);
		setFechaNacimiento(fechaNacimiento);
	}
	
	public static final ClienteEntity crear(final UUID id, final TipoIdentificacionEntity tipoIdentificacion, final String identificacion, final NombreCompletoClienteEntity nombreCompleto,
			CorreoElectronicoClienteEntity correoElectronico, NumeroTelefonoClienteEntity numeroTelefono,final Date fechaNacimiento) {
		
		return new ClienteEntity(id, tipoIdentificacion, identificacion, nombreCompleto, correoElectronico, numeroTelefono,fechaNacimiento);
	}
	
	private final void setId(UUID id) {
		this.id = id;
	}
	private final void setTipoIdentificacion(final TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	private final void setIdentificacion(final String identificacion) {
		this.identificacion = identificacion;
	}
	
	private final void setNombreCompleto(final NombreCompletoClienteEntity nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	private final void setCorreoElectronico(final CorreoElectronicoClienteEntity correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	private final void setNumeroTelefono(final NumeroTelefonoClienteEntity numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	private final void setFechaNacimiento(final Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public final UUID getId() {
		return id;
	}
	public final TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public final String getIdentificacion() {
		return identificacion;
	}
	
	public final NombreCompletoClienteEntity getNombreCompleto() {
		return nombreCompleto;
	}

	public final CorreoElectronicoClienteEntity getCorreoElectronico() {
		return correoElectronico;
	}

	public final NumeroTelefonoClienteEntity getNumeroTelefono() {
		return numeroTelefono;
	}

	public final Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	

}
