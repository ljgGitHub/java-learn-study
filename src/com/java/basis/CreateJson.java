package com.java.basis;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * @date 2015-05-25
 * @author jack 
 *
 */
public class CreateJson {

	public static void main(String[] args) {
		//新建json对象就可以直接增加属性了
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("cat", "it");
		
		//建立json数组，数组里面是一组或多组json对象的数据
		JsonArray jsonArray = new JsonArray();

		JsonObject jObject1 = new JsonObject();
		jObject1.addProperty("id", 1);
		jObject1.addProperty("name", "java");
		jObject1.addProperty("ide", "Eclipse");
		jsonArray.add(jObject1);

		JsonObject jObject2 = new JsonObject();
		jObject2.addProperty("id", 2);
		jObject2.addProperty("name", "Swift");
		jObject2.addProperty("ide", "X-code");
		jsonArray.add(jObject2);

		JsonObject jObject3 = new JsonObject();
		jObject3.addProperty("id", 3);
		jObject3.addProperty("name", "C#");
		jObject3.addProperty("ide", "Visual Studio");
		jsonArray.add(jObject3);

		jsonObject.add("languages", jsonArray);
		jsonObject.addProperty("pop", "true");
		System.out.println(jsonObject.toString());
	}
}

