package CacLoaiMayBay;
import QLPTGT.MayBay;

public class PhanLuc extends MayBay
{
	public PhanLuc() {super();}
	public PhanLuc(String hang, String mauSac, int gia, int namSx, int socanh) {
		super(hang, mauSac, gia, namSx, socanh);
		
	}
	@Override
	public void Fly()
	{
		System.out.println("May bay phan luc bay void toc anh sang");
	}
}
