package CreatingInterface;

import java.util.ArrayList;

import Olives.Olive;

public interface Press {
	public void getOil(ArrayList<Olive> olives);
	public int getTotalOil();
	public void setTotalOil(int totalOil);
}
