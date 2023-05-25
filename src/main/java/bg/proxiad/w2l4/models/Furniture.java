package bg.proxiad.w2l4.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FURNITURE")
public class Furniture {

	@Id
	@Column(name = "FURNITURE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column
	Double price;
	
	@Column(name = "FURNITURE_TYPE")
	String type;
	
	public Furniture() {
	}
	
	public Furniture(Long id, Double price, String type) {
		super();
		this.id = id;
		this.price = price;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
