package A1;

public class Radio
{
	boolean isOn;
	int volume = 2;
	
	public Radio()
	{
		
	}

	public void volumeUp()
	{
		if (volume<=0 && volume<=10)
		{
			System.err.printf("Volumen Falsch%n");
			return;
		}
		this.volume++;
		System.out.printf("Volumen: %d%n",volume);
	}
	
	public void VolumeDown()
	{
		if (volume<=0 && volume<=10)
		{
			System.err.printf("Volumen Falsch%n");
			return;
		}
		
		this.volume--;
		System.out.printf("Volumen: %d%n",volume);
	}
	
	public void on()
	{
		isOn = true;
		System.out.printf("On %n");
	}
	
	public void off()
	{
		System.out.printf("Off %n");
		isOn = false;
	}
	
	public void StringtoString()
	{
		if (isOn=true)
		{
			System.out.printf("Radio = on %n");
		}
		else
		{
			System.out.printf("Radio = off %n");
		}
		 System.out.printf("Volume = %d%n", volume);
	}

}
