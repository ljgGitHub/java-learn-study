package com.java.basis;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ReadJson {

	public static void main(String[] args) {
		String JsonContext = new Util().ReadFile("data.txt");
		JSONArray jsonArray = JSONArray.fromObject(JsonContext);
		int size = jsonArray.size();
		System.out.println("Size: " + size);
		for(int  i = 0; i < size; i++){
		JSONObject jsonObject = jsonArray.getJSONObject(i);
		System.out.println("[" + i + "]id:" + jsonObject.get("id"));
		System.out.println("[" + i + "]name:" + jsonObject.get("name"));
		System.out.println("[" + i + "]descript:" + jsonObject.get("descript"));
		}
		}


	}

 class Util {

	public String  ReadFile(String Path){
		BufferedReader reader = null;
		String laststr = "";
		try{
			FileInputStream fileInputStream = new FileInputStream(Path);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
			reader = new BufferedReader(inputStreamReader);
			String tempString = null;
			while((tempString = reader.readLine()) != null){
				laststr += tempString;
			}
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return laststr;
	}
}