package net.david.fernandez.oblogatorio.dda.server.dominio;

public class Estate extends Propiedades {

	

	private boolean construible;
	private boolean vendible;
	private int casas;
	private boolean hotel;
	private int precioCasa;
	private int precioHotel;
	private int rentaCasa1;
	private int rentaCasa2;
	private int rentaCasa3;
	private int rentaCasa4;
	private int rentaHotel;

	
	public Estate(String nombre, int precioPropiedad, int precioHipoteca,
			int renta,int precioCasa, int precioHotel, int rentaCasa1,
			int rentaCasa2, int rentaCasa3, int rentaCasa4, int rentaHotel) {
		super(nombre,precioPropiedad,precioHipoteca,renta);
		this.construible=false;
		this.vendible=false;
		this.casas=0;
		this.hotel=false;
		this.precioCasa=precioPropiedad;
		this.precioHotel=precioHotel;
		this.rentaCasa1=rentaCasa1;
		this.rentaCasa2=rentaCasa2;
		this.rentaCasa3=rentaCasa3;
		this.rentaCasa4=rentaCasa4;
		this.rentaHotel=rentaHotel;
		
	}


	public boolean isconstruible() {
		return construible;
	}



	public void setconstruible(boolean comprable) {
		this.construible = comprable;
	}



	public boolean isVendible() {
		return vendible;
	}



	public void setVendible(boolean vendible) {
		this.vendible = vendible;
	}



	public int getCasas() {
		return casas;
	}



	public void setCasas(int casas) {
		this.casas = casas;
	}



	public boolean isHotel() {
		return hotel;
	}



	public void setHotel(boolean hotel) {
		this.hotel = hotel;
	}



	public int getPrecioCasa() {
		return precioCasa;
	}



	public void setPrecioCasa(int precioCasa) {
		this.precioCasa = precioCasa;
	}



	public int getPrecioHotel() {
		return precioHotel;
	}



	public void setPrecioHotel(int precioHotel) {
		this.precioHotel = precioHotel;
	}



	public int getRentaCasa1() {
		return rentaCasa1;
	}



	public void setRentaCasa1(int rentaCasa1) {
		this.rentaCasa1 = rentaCasa1;
	}



	public int getRentaCasa2() {
		return rentaCasa2;
	}



	public void setRentaCasa2(int rentaCasa2) {
		this.rentaCasa2 = rentaCasa2;
	}



	public int getRentaCasa3() {
		return rentaCasa3;
	}



	public void setRentaCasa3(int rentaCasa3) {
		this.rentaCasa3 = rentaCasa3;
	}



	public int getRentaCasa4() {
		return rentaCasa4;
	}



	public void setRentaCasa4(int rentaCasa4) {
		this.rentaCasa4 = rentaCasa4;
	}



	public int getRentaHotel() {
		return rentaHotel;
	}



	public void setRentaHotel(int rentaHotel) {
		this.rentaHotel = rentaHotel;
	}



}
