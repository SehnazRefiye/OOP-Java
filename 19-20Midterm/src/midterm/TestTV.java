package midterm;

public class TestTV 
{
	public static void main(String[] args) 
	{
		TV tv1 = new TV();
		tv1.turnOn();
		setChannel(tv1, 10);
		setVolume(tv1, 3);
		TV tv2 = new TV();
		tv2.turnOn();
		setChannel(tv2, 99);
		setVolume(tv2, 4);
		System.out.println("tv1's channel is " + tv1.getChannel() + " and volume level is " + tv1.getVolumeLevel());
		System.out.println("tv2's channel is " + tv2.getChannel() + " and volume level is " + tv2.getVolumeLevel());
	}
	public static void setChannel(TV tv, int channel)
	{
		tv.setChannel(channel);
	}
	public static void setVolume(TV tv, int volume)
	{
		tv.setVolume(volume);
	}
}
