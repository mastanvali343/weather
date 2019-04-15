package com.weather;

public class CiscoImpl implements WeatherInfo{

	public double getWeatherInfo(long zip) {
		
		CiscoWeatherInfo cwi = new CiscoWeatherInfo();
		double weather = cwi.ciscoWeatherInfo(zip);
		
		return weather;
	}
}
