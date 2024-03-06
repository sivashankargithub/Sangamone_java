package pkg1.univ1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UnivEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String univname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUnivname() {
		return univname;
	}
	public void setUnivname(String univname) {
		this.univname = univname;
	}
	public UnivEntity(String univname) {
		super();
		this.univname = univname;
	}
	public UnivEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
