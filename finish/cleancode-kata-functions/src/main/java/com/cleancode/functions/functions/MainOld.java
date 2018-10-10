package com.cleancode.functions.functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainOld {

	public static void main(String[] args) {
		String[] cityStateArray = {
				"Nagpur-Maharashtra",
		        "Raipur-Chattisgad",
		        "Mumbai-Maharashtra",
		        "Surat-Gujarat"
		};
		
		// do the processing
		Map<String, List<String>> stateCityMap
		= new HashMap<>();
		
		for( String cityStateValue : cityStateArray) {
			String[] cityStateParts = cityStateValue.split("-");
			List<String> cityList = stateCityMap.get(cityStateParts[1]);
			if( cityList == null ) {
				cityList = new ArrayList<String>();
				stateCityMap.put(cityStateParts[1], cityList);
			}
			
			cityList.add(cityStateParts[0]);
		}
		
		System.out.println("Input Data");
		for( String cityStateValue : cityStateArray) {
			System.out.println(cityStateValue);
		}
		
		System.out.println("Map Output");
		for( String stateName : stateCityMap.keySet()) {
			System.out.println("State:" + stateName);
			List<String> cityList = stateCityMap.get(stateName);
			for( String cityName : cityList) {
				System.out.println(cityName);
			}
		}
	}
}