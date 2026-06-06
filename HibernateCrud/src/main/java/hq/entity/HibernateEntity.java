package hq.entity;

import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Libtable")
public class HibernateEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int libId;

	private String libName;
	private String libCity;
	private long libMob;
	
	public HibernateEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HibernateEntity(int libId, String libName, String libCity, long libMob) {
		super();
		this.libId = libId;
		this.libName = libName;
		this.libCity = libCity;
		this.libMob = libMob;
	}

	public int getLibId() {
		return libId;
	}

	public void setLibId(int libId) {
		this.libId = libId;
	}

	public String getLibName() {
		return libName;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}

	public String getLibCity() {
		return libCity;
	}

	public void setLibCity(String libCity) {
		this.libCity = libCity;
	}

	public long getLibMob() {
		return libMob;
	}

	public void setLibMob(long libMob) {
		this.libMob = libMob;
	}

	@Override
	public String toString() {
		return "HibernateEntity [libId=" + libId + ", libName=" + libName + ", libCity=" + libCity + ", libMob="
				+ libMob + "]";
	}

	public HibernateEntity(String libName, String libCity, long libMob) {
		super();
		this.libName = libName;
		this.libCity = libCity;
		this.libMob = libMob;
	}

	public HibernateEntity(int libId) {
		super();
		this.libId = libId;
	}
	
	

}
