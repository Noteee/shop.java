package bolt;

import java.util.Date;

public class Tej extends Elelmiszer
{

	private final int LITER = 10;
	private final int FELLITER = 5;
	private final int POHAR = 2;
	private final double FELZSIROS = 1.5;
	int urtartalom;
	String gyarto;
	Date szavatossagiIdo;
	double zsirtartalom;
	long vonalKod;

	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom)
	{
		super(vonalKod, gyarto, szavatossagiIdo);
		this.urtartalom = urtartalom;
		this.zsirtartalom = zsirtartalom;
	}

	public boolean joMeg()
	{
		Date today = new Date();
		if (today.after(szavatossagiIdo))
		{
			return false;
		}
		return true;
	}

	public int getUrtartalom()
	{
		return urtartalom;
	}

	public double getZsirtartalom()
	{
		return zsirtartalom;
	}

	@Override
	public String toString()
	{
		return "Tej [urtartalom=" + urtartalom + ", gyarto=" + gyarto + ", szavatossagiIdo=" + szavatossagiIdo
				+ ", zsirtartalom=" + zsirtartalom + "]";

	}
}
