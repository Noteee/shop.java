package bolt;

import java.util.Date;

public class Elelmiszer extends Aru
{
	long vonalKod;
	String gyarto;
	Date szavatossagiIdo;

	public Elelmiszer(long vonalKod, String gyarto, Date szavatossagiIdo)
	{
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
	}

	public long getVonalKod()
	{
		return vonalKod;
	}

	public String getGyarto()
	{
		return gyarto;
	}

	public Date getSzavatossagiIdo()
	{
		return szavatossagiIdo;
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

	@Override
	public String toString()
	{
		return "Elelmiszer [vonalKod=" + vonalKod + ", gyarto=" + gyarto + ", szavatossagiIdo=" + szavatossagiIdo + "]";
	}

}
