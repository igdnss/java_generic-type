package com.research.generic;

public class Test {

	public static void main(String[] args) {
		User1<String> gg = new User1<String>();
		gg.setName("�߸�");
		gg.setSchool("����");
		User1<Integer> dg = new User1<Integer>();
		dg.setName(new Integer(1));
		dg.setSchool(new Integer(2));
		//��֤���Ͳ���
		System.out.println(gg.getClass() == dg.getClass());
		
		User2<String,Integer> bt = new User2<>();
		bt.setName("�߸�");
		bt.setSchool(new Integer(1));
		User3<String> user3 =new User3<>();
		user3.say1("Hello world!!!");
		//��������������岻��������Ϊ����ʾָ������
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
