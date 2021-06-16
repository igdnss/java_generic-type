package com.research.generic;

public class Test {

	public static void main(String[] args) {
		User1<String> gg = new User1<String>();
		gg.setName("高歌");
		gg.setSchool("哈佛");
		User1<Integer> dg = new User1<Integer>();
		dg.setName(new Integer(1));
		dg.setSchool(new Integer(2));
		//验证泛型擦除
		System.out.println(gg.getClass() == dg.getClass());
		
		User2<String,Integer> bt = new User2<>();
		bt.setName("高歌");
		bt.setSchool(new Integer(1));
		User3<String> user3 =new User3<>();
		user3.say1("Hello world!!!");
		//创建这个对象意义不大，这里是为了显示指定类型
		/*
		 * User4<String> user4 =new User4<>(); // User4.say1("1"); User4.say2(1);
		 */
		User4.say2("hello");
		
		User5<Number> user50 = new User5<>();
		User3<Integer> user31 = new User3<>();
		User3<Number> user32 = new User3<>();
		user50.set(user31);
		user50.set(user32);
	}

}
