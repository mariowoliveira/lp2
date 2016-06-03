package br.com.herbertrausch.spring.mongo;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.data.annotation.Id;





import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Troca implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private Date dataTroca;
	
	private Usuario donor;
	private Usuario receiver;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataTroca() {
		return dataTroca;
	}
	public void setDataTroca(Date dataTroca) {
		this.dataTroca = dataTroca;
	}
	public Usuario getDonor() {
		return donor;
	}
	public void setDonor(Usuario donor) {
		this.donor = donor;
	}
	public Usuario getReceiver() {
		return receiver;
	}
	public void setReceiver(Usuario receiver) {
		this.receiver = receiver;
	}
}
