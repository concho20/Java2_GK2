
public class model {
	private String tenhang;
	private int dongia;
	private int soluong;
	private int thanhtien;
	


	public model(String tenhang, int dongia, int soluong, int thanhtien) {
        this.tenhang = tenhang;
        this.dongia = dongia;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
        
    }

	public String getTenhang() {
		return tenhang;
	}

	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}

	public int getDongia() {
		return dongia;
	}

	public void setDongia(int dongia) {
		this.dongia = dongia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public int getThanhtien() {
		return thanhtien;
	}

	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}

	
	
}
