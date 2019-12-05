package com.example.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.activation.FileDataSource;

import java.util.Set;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


/**
 * 
 * @author 武超凡
 *
 */
@EnableAutoConfiguration
@MapperScan("com.example.demo.mapper")
@SpringBootApplication
public class DemoApplication {

	private static Logger logger=LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) throws FileNotFoundException {
		
		
		SpringApplication.run(DemoApplication.class, args);
//		String s="{name:'wcf',age:123,gender:'male'}";
//		JSONObject jsono=JSONObject.parseObject(s);
//		System.out.println("name:"+jsono.getString("name")+"   age:"+(jsono.getInteger("age")+100000)+"   gender:"+jsono.getString("gender"));
		User user=new User(
			"wcf","M",22
		);
		Gson gson=new Gson();
//		GsonBuilder gsonBuilder=new GsonBuilder();
//		gsonBuilder.excludeFieldsWithoutExposeAnnotation();
//		Gson gson=gsonBuilder.create();
//		String gsonStr=gson.toJson(user);
//		System.out.println("gsonStr:  "+gsonStr);
		String str="{'name':'www','sex':'F','age':24}";
//		User newUser=gson.fromJson(str, User.class);
//		System.out.println(newUser.getName()+newUser.getSex()+newUser.getAge());
		
		
//		String names="['a','b','c']";
//		String[] ns=gson.fromJson(names, String[].class);
//		for (String string : ns) {
//			System.out.println(string);
//		}
		List<User> lists=new ArrayList<User>();
		lists.add(user);
//		lists.add(newUser);
		String usersstr=gson.toJson(lists);
//		System.out.println(usersstr);
		
		String s1="[{name:'wcf',sex:'M',age:22},{name:'www',gender:'F',age:24},{name:'wee',sex:'F',age:34}]";
		Type type=new TypeToken<ArrayList<User>>(){}.getType();
		List<User> listss=gson.fromJson(s1, type);
		Iterator<User> iter=listss.iterator();
		while(iter.hasNext()) {
			User user1=(User)iter.next();
//			System.out.println(user1.getName()+user1.getSex()+user1.getAge());
		}
		Field[] fields=User.class.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		List<User> users=new ArrayList<User>();
		User user1=new User("w1");
		User user2=new User("w2");
		User user3=new User("w3");
		User user4=new User("w4");
//		User newUser1=new User("w1");
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		List<User> users1=new ArrayList<User>();
		User user6=new User("w6");
		User user7=new User("w7");
		users1.add(user6);
		users1.add(user7);
		users.addAll(users1);
//		System.out.println(user1.equals(newUser1));
//		System.out.println(users.contains(newUser1));
		for (User userq : users) {
//			System.out.println(userq.getName());
		}
		Set<User> usetSet=new HashSet<User>(users);
//		System.out.println(usetSet);
		System.out.println(usetSet.hashCode());
//		System.out.println(users.stream());
		
//		Map<String,Object> map=new HashMap<String, Object>();
//		map.put("name", "wcf");
//		map.put("age", 22);
//		System.out.println(map);
//		System.out.println(map.containsKey("name"));
//		System.out.println(map.containsValue(22));
//		Set<Entry<String, Object>> set=map.entrySet();
//		System.out.println(set);
//		System.out.println(map.keySet());
//		System.out.println(map.values());
		
//		Set<User> userSet = new HashSet<>(userList);
//	    List<User> list = new ArrayList<>(userSet);
		
		 String filenameString="E:\\p.jpg"; 
		 File file=new File(filenameString);
//		 try { if(!file.exists()) { file.createNewFile(); } } catch (IOException e) {}
//		 
//		
//		Path path=Paths.get("E:\\photo1\\123.jpg");
//		try {
//			Files.copy(path,new FileOutputStream(file));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		/*
		 * File file1=new File("e://file1.txt"); File file2=new File("e://file1.txt");
		 * InputStream in=new FileInputStream(file1); OutputStream out=new
		 * FileOutputStream(file2); try { for(int i=0;i<1000;i++) { out.write('A');
		 * out.write('B'); out.write('C'); } } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }finally { try {
		 * logger.info("文件大小: {}",in.available()); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } }
		 */
		
		
		
	}
	

}
