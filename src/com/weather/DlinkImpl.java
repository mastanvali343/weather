package com.weather;

public class DlinkImpl implements WeatherInfo{
	
	public double getWeatherInfo(long zip) {
		
		DlinkWeatherFinder dwi = new DlinkWeatherFinder();
		double weather = dwi.dlinkWeatherInfo(String.valueOf(zip));
		return weather;
	}

}
