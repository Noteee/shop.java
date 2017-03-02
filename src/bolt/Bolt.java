package bolt;

import java.util.Hashtable;

public class Bolt
{
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable tejpult;

	public Bolt(String nev, String cim, String tulajdonos, Hashtable tejpult)
	{
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
	}

	public Bolt(String nev, String cim, String tulajdonos)
	{
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}

	public String getNev()
	{
		return nev;
	}

	public String getCim()
	{
		return cim;
	}

	public String getTulajdonos()
	{
		return tulajdonos;
	}

	public boolean vanMegTej()
	{
		return false;
	}

	public Tej vasarolTej(Tej m)
	{
		return null;
	}

	public void feltoltTej(Tej m)
	{

	}

	public void torolElelmiszert(Long vonalKod)
	{

	}

	public void feltoltElelmiszerrel(Long vonalKod, long mennyiseg)
	{
		
	}

	public void feltoltUjElelmiszerrel(Elelmiszer e, long mennyiseg, long ar)
	{
		
	}

	class BoltBejegyzes
	{

		private long ar;
		private long mennyiseg;

		public BoltBejegyzes(long ar, long mennyiseg)
		{
			this.ar = ar;
			this.mennyiseg = mennyiseg;
		}

		public long getMennyiseg()
		{
			return mennyiseg;
		}

		public void setMennyiseg(long mennyiseg)
		{
			this.mennyiseg = mennyiseg;
		}

		public void adMennyiseg(long mennyiseg)
		{
			this.mennyiseg += mennyiseg;
		}

		public void levonMennyiseg(long mennyiseg)
		{
			this.mennyiseg -= mennyiseg;
		}

		public long getAr()
		{
			return ar;
		}

		public void setAr(long ar)
		{
			this.ar = ar;
		}

	}

}
