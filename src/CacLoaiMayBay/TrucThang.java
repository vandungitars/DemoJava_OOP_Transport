package CacLoaiMayBay;
import QLPTGT.MayBay;

public class TrucThang extends MayBay
{
	public TrucThang()	{super();}
	public TrucThang(String hang, String mauSac, int gia, int namSx, int socanh) {
		super(hang, mauSac, gia, namSx, socanh);
		
	}
	@Override
	public void Fly()
	{
		System.out.println("May bay truc thang bay cham nhu rua");
	}
}
