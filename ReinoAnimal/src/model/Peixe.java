package model;

public class Peixe extends Animal{
	
	private String caracteristica;

	public Peixe() {
		super();
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	@Override
	public void dados() {
		super.dados();
		System.out.println("Característica: " + caracteristica);
	}

}
