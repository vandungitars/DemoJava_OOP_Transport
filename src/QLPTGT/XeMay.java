package QLPTGT;

public class XeMay extends PTGT
{
	private int CongSuat;

	public int getCongSuat() {
		return CongSuat;
	}

	public void setCongSuat(int congSuat) {
		CongSuat = congSuat;
	}
	public XeMay()	{super();}
	
	public XeMay(String hang, String mauSac, int gia, int namSx, int congsuat) {
		super(hang, mauSac, gia, namSx);
		CongSuat = congsuat;
	}
	@Override
    public void ShowInfor()
	{
        super.ShowInfor();
        System.out.println("Cong suat xe may :" + getCongSuat());
    }
}
