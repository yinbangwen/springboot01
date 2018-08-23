package com.yin.gava;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {

	public static void main(String[] args) throws Exception{
//		String json = toJson();
//		System.out.println(json);

		parse();
	}

	public static String toJson(){
		Result<Person> result = new Result<Person>();
		result.setMsg("test msg");
		result.setStatus(200);
		
		Data<Person> data = new Data<Person>();
		
		Person[] persons = new Person[2];
		Person p1 = new Person("张三", 20, 30000.0);
		Person p2 = new Person("lisi", 30, 60000.0);
		
		persons[0] = p1;
		persons[1] = p2;
		data.setCount(2);
		data.setRows(persons);
		
		result.setData(data);
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(result);
			return json;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public static void parse() throws Exception{
		String s = "{\"msg\":\"test msg\",\"status\":200,\"data\":{\"count\":2,\"rows\":[{\"name\":\"张三\",\"age\":20,\"salary\":30000.0},{\"name\":\"lisi\",\"age\":30,\"salary\":60000.0}]}}";
		ObjectMapper mapper = new ObjectMapper();
//		mapper.getTypeFactory().constructParametrizedType(parametrized, parametersFor, parameterClasses)
//		Result result = mapper.readValue(s, new TypeReference<Result<T>>() {});
//		Object[] ps = result.getData().getRows();
//		for(Object o : ps){
//			
//			System.out.println(o.getClass().getName());
//		}
	}
}
