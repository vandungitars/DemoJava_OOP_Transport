package QLPTGT;

public abstract class MayBay extends PTGT
{
	protected int SoCanh;
	public int getSoCanh() {
		return SoCanh;
	}

	public void setSoCanh(int socanh) {
		SoCanh = socanh;
	}
	
	public MayBay()	{super();}
	
	public MayBay(String hang, String mauSac, int gia, int namSx, int socanh) {
		super(hang, mauSac, gia, namSx);
		SoCanh = socanh;
	}
	@Override
    public void ShowInfor()
	{
        super.ShowInfor();
        System.out.println("So canh cua may bay :" + getSoCanh());
    }
	public abstract void Fly();
}