package com.cleancode.functions.functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String[] cityStateArray = getCityStateArray();
		printInputArray(cityStateArray);
		
		Map<String, List<String>> stateCityMap = 
				initializeStateCityMap();
		separateCityAndStateIntoAMap(stateCityMap, cityStateArray);
		printOutputMap(stateCityMap);
	}

	private static String[] getCityStateArray() {
		return new String[]{
				"Nagpur-Maharashtra",
		        "Raipur-Chattisgad",
		        "Mumbai-Maharashtra",
		        "Surat-Gujarat"
		};
	}

	private static void separateCityAndStateIntoAMap(
			Map<String, List<String>> stateCityMap,
			String[] cityStateArray) {		
		
		for( String cityStateValue : cityStateArray) {
			addStateKeyWithCityCollection(stateCityMap, cityStateValue);
		}
	}

	private static Map<String, List<String>> initializeStateCityMap() {
		return new HashMap<String, List<String>>();
	}

	private static void addStateKeyWithCityCollection(Map<String, List<String>> stateCityMap, String cityStateValue) {
		String[] cityStateParts = cityStateValue.split("-");
		String stateName = cityStateParts[1];
		List<String> cityList = getCityListWithExistCheck(stateCityMap, stateName);
		
		String cityName = cityStateParts[0];
		cityList.add(cityName);
	}

	private static List<String> getCityListWithExistCheck(Map<String, List<String>> stateCityMap, String stateName) {
		List<String> cityList = stateCityMap.get(stateName);
		if( cityList == null ) {
			cityList = new ArrayList<String>();
			stateCityMap.put(stateName, cityList);
		}
		return cityList;
	}

	private static void printInputArray(String[] cityStateArray) {
		System.out.println("Input Data");
		for( String cityStateValue : cityStateArray) {
			System.out.println(cityStateValue);
		}
	}

	private static void printOutputMap(Map<String, List<String>> stateCityMap) {
		System.out.println("Map Output");
		for( String stateName : stateCityMap.keySet()) {
			printStateDetailsWithCities(stateCityMap, stateName);
		}
	}

	private static void printStateDetailsWithCities(Map<String, List<String>> stateCityMap, String stateName) {
		System.out.println("State:" + stateName);
		List<String> cityList = stateCityMap.get(stateName);
		printCityList(cityList);
	}

	private static void printCityList(List<String> cityList) {
		for( String cityName : cityList) {
			System.out.println(cityName);
		}
	}
}