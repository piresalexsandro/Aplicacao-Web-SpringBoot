package com.eventoapp.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Table(name = "Eventos")
@Entity
@Access(value=AccessType.FIELD)
public class Eventos {

	@Id
	@GeneratedValue
    @Column(name="codigo")
	private Long codigo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
}
