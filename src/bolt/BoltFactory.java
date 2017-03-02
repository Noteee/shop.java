package bolt;

import java.util.Date;

import bolt.aruk.Sajt;
import bolt.aruk.Szappan;
import bolt.aruk.Tej;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;

public class BoltFactory
{
	public Tej ujTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagido, double zsirtartalom)
	{
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagido, zsirtartalom);
	}

	public Tej ujFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagido, double zsirtartalom)
	{
		return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagido, zsirtartalom);
	}

	public Tej ujFelzsirosTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagido)
	{
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagido, 2.8);
	}

	public Tej ujZsirosTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagido)
	{
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagido, 3.6);
	}

	public Tej ujFelzsirosFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagido)
	{
		return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagido, 2.8);
	}

	public Tej ujZsirosFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagido)
	{
		return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagido, 3.6);
	}

	public Tej ujFelzsirosLiteresTartosTej(Long vonalKod, String gyarto, Date szavatossagido)
	{
		return new TartosTej(vonalKod, 10, gyarto, szavatossagido, 2.8);
	}

	public Tej ujZsirosLiteresFeltartosTej(Long vonalKod, String gyarto, Date szavatossagido)
	{
		return new FeltartosTej(vonalKod, 10, gyarto, szavatossagido, 3.6);
	}

	public Tej ujZsirosLiteresTartosTej(Long vonalKod, String gyarto, Date szavatossagido)
	{
		return new TartosTej(vonalKod, 10, gyarto, szavatossagido, 3.6);
	}

	public Tej ujFelzsirosLiteresFelTartosTej(Long vonalKod, String gyarto, Date szavatossagido)
	{
		return new FeltartosTej(vonalKod, 10, gyarto, szavatossagido, 2.8);
	}
}