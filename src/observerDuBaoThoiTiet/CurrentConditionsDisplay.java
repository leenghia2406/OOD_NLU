package observerDuBaoThoiTiet;

public class CurrentConditionsDisplay {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	public CurrentConditionsDisplay(WeatherData weatherData) {
	this.weatherData = weatherData;
//	weatherData.setConditionDisplay(this);
	}
	public void update(float temperature, float humidity, float pressure) {
	this.temperature = temperature;
	this.humidity = humidity;
	display();
	}
	public void display() {
	System.out.println("Current conditions: " + temperature
	+ "F degrees and " + humidity + "% humidity");
	}
}
