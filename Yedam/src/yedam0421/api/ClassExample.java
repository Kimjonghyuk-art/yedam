package yedam0421.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		
		
		try {
			Class cls = Class.forName("java.lang.String");
			Method[] method = cls.getDeclaredMethods();
			
			for(Method i : method) {
				System.out.println(i.getName());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Class obj = ObjectExample.class;
		
		obj.getDeclaredConstructors();
		
		Constructor[] cons = obj.getDeclaredConstructors();
		for(Constructor i : cons) {
			System.out.println(i.getName());
		}
	}
}
