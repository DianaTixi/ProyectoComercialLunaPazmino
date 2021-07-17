package comerciallunapazmino.com.ComercialLunaP.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Banners")
public class Banners {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String url1;
	String url2;
	String url3;
	String url4;
	
	public Banners() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Banners(int id, String url1, String url2, String url3, String url4) {
		super();
		this.id = id;
		this.url1 = url1;
		this.url2 = url2;
		this.url3 = url3;
		this.url4 = url4;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl1() {
		return url1;
	}
	public void setUrl1(String url1) {
		this.url1 = url1;
	}
	public String getUrl2() {
		return url2;
	}
	public void setUrl2(String url2) {
		this.url2 = url2;
	}
	public String getUrl3() {
		return url3;
	}
	public void setUrl3(String url3) {
		this.url3 = url3;
	}
	public String getUrl4() {
		return url4;
	}
	public void setUrl4(String url4) {
		this.url4 = url4;
	}
	
	
}
