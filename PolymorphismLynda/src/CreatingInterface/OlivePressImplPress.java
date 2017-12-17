package CreatingInterface;

import java.util.ArrayList;

import Olives.Olive;

public class OlivePressImplPress implements Press{

	private int totalOil;

	@Override
	public void getOil(ArrayList<Olive> olives) {
		// TODO Auto-generated method stub
		int oil = 0;
		
		for (Olive olive : olives) {
			oil += olive.crush();
		}
		
		setTotalOil(oil);

	}

	@Override
	public int getTotalOil() {
		// TODO Auto-generated method stub
		return totalOil;
	}

	@Override
	public void setTotalOil(int totalOil) {
		// TODO Auto-generated method stub
		this.totalOil += totalOil;

	}

}
