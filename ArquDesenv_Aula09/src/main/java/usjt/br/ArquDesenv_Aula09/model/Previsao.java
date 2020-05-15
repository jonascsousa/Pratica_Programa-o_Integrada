package usjt.br.ArquDesenv_Aula09.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Previsao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String diaDaSemana;
	private Double tempMinima;
	private Double tempMaxima;
	private Double umidade;
	private String descricao;
	private Integer data;
	private Integer hora;
	private Double latitude;
	private Double longitude;
	
	public Long getId() {
		return id;
	}
	public String getDiaDaSemana() {
		return diaDaSemana;
	}
	public Double getTempMinima() {
		return tempMinima;
	}
	public Double getTempMaxima() {
		return tempMaxima;
	}
	public Double getUmidade() {
		return umidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public Integer getData() {
		return data;
	}
	public Integer getHora() {
		return hora;
	}
	public Double getLatitude() {
		return latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	public void setTempMinima(Double tempMinima) {
		this.tempMinima = tempMinima;
	}
	public void setTempMaxima(Double tempMaxima) {
		this.tempMaxima = tempMaxima;
	}
	public void setUmidade(Double umidade) {
		this.umidade = umidade;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	

}
