package com.cleancode.functions.functions;

import java.util.List;
import java.util.Map;

public class MainFinal {
	
	public static void main(String[] args) {
		String[] cityStateArray = getCityStateArray();
		Map<String,List<String>> stateCityMap = 
				separateCityAndStateIntoAMap(cityStateArray);
		printOutputMap(stateCityMap);
	}

	private static void printOutputMap(Map<String, List<String>> stateCityMap) {
		// TODO Auto-generated method stub
		
	}

	private static Map<String, List<String>> separateCityAndStateIntoAMap(String[] cityStateArray) {
		Map<String, List<String>> stateCityMap = createStateCityMap();
		for( String cityAndState : cityStateArray){
			separateCityAndState(cityAndState, stateCityMap);
		}
		return stateCityMap;
	}

	private static void separateCityAndState(String cityAndState, Map<String, List<String>> stateCityMap) {
		// TODO Auto-generated method stub
		
	}

	private static Map<String, List<String>> createStateCityMap() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String[] getCityStateArray() {
		return new String[]{
				""
		};
	}

}
