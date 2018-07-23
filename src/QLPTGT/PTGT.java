package QLPTGT;

public class PTGT implements PT
{
	protected String Hang;
	protected String MauSac;
	protected int Gia;
	protected int NamSx;
	public String getHang() {
		return Hang;
	}
	public void setHang(String hang) {
		Hang = hang;
	}
	public String getMauSac() {
		return MauSac;
	}
	public void setMauSac(String mauSac) {
		MauSac = mauSac;
	}
	public int getGia() {
		return Gia;
	}
	public void setGia(int gia) {
		Gia = gia;
	}
	public int getNamSx() {
		return NamSx;
	}
	public void setNamSx(int namSx) {
		NamSx = namSx;
	}
	public PTGT() {};
	
	public PTGT(String hang, String mauSac, int gia, int namSx) {
		super();
		Hang = hang;
		MauSac = mauSac;
		Gia = gia;
		NamSx = namSx;
	}
	@Override
	public void ShowInfor()
	{
		System.out.println("Hang xe : " + this.getHang());
		System.out.println("Nam san xuat cua xe : " + this.getNamSx());
		System.out.println("Mau sac cua xe : " + this.getMauSac());
		System.out.println("Gia thanh cua xe : " + this.getGia());
	}
}
