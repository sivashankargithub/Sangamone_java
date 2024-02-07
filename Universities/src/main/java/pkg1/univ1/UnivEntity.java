package pkg1.univ1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="universities")
public class UnivEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int univ_id;
	String univ_name;
	public UnivEntity(String univ_name) {
		super();
		this.univ_name = univ_name;
	}
	public int getUniv_id() {
		return univ_id;
	}
	public void setUniv_id(int univ_id) {
		this.univ_id = univ_id;
	}
	public String getUniv_name() {
		return univ_name;
	}
	public void setUniv_name(String univ_name) {
		this.univ_name = univ_name;
	}
}
