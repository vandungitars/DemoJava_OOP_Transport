package QLPTGT;
import CacLoaiMayBay.PhanLuc;
import CacLoaiMayBay.TrucThang;

public class main 
{

	public static void main(String[] args) {
		MayBay mb = new PhanLuc("AirLine","Mau vang",10000,2010,2);
		mb.ShowInfor();
		mb.Fly();
		System.out.println();
		XeMay xm = new XeMay();
		xm.Hang = "Honda";
		xm.MauSac = "mau trang";
		xm.Gia = 5000;
		xm.NamSx = 1998;
		xm.setCongSuat(1000);
		PT pt = xm;
		pt.ShowInfor();
		
	}

}
