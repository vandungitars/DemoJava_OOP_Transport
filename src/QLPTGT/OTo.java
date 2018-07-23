package QLPTGT;

public class OTo extends PTGT
{
	private int ChoNgoi;

	public int getChoNgoi() {
		return ChoNgoi;
	}

	public void setChoNgoi(int chongoi) {
		ChoNgoi = chongoi;
	}
	public OTo()  {super();}
	
	public OTo(String hang, String mauSac, int gia, int namSx, int chongoi) {
		super(hang, mauSac, gia, namSx);
		ChoNgoi = chongoi;
	}
	@Override
    public void ShowInfor()
	{
        super.ShowInfor();
        System.out.println("So cho ngoi cua o to :" + getChoNgoi());
    }
}
