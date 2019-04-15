package com.weather;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetWeatherServlet")
public class GetWeatherServlet extends HttpServlet {
	WeatherInfo wi;
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		long zip = Long.parseLong(request.getParameter("zip"));
		wi = new CiscoImpl();
		double temp = wi.getWeatherInfo(zip);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("weather info "+temp);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
