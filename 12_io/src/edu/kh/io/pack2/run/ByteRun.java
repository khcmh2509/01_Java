package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		
		/*
		// 불변성(Immutable)의 String
		
		// 1. new 연산자 
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(System.identityHashCode(str1)); // 681842940
		System.out.println(System.identityHashCode(str2)); // 1392838282
		str1 = str1 + " world";
		System.out.println(System.identityHashCode(str1)); // 1706377736
	
		
		// 2. 리터럴 표기법
		String str3 = "Hello";
		String str4 = "Hello";
		System.out.println(System.identityHashCode(str3)); // 523429237
		System.out.println(System.identityHashCode(str4)); // 523429237
		// String 상수 풀
		str3 = str3 + " world";
		System.out.println(System.identityHashCode(str3)); // 1804094807
		
		
		// 가변성(Mutable)의 StringBuilder, StringBuffer
		StringBuilder sb = new StringBuilder();
		System.out.println(System.identityHashCode(sb)); // 951007336
		sb.append("Hello world!");
		sb.append("12345");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb)); // 951007336
		*/
		
		ByteService service = new ByteService();
		//service.fileByteOutput();
		// service.bufferedFileByteOutput();
		//service.fileByteInput();
		//service.bufferedFileByteInput();
		//service.fileCopy();
	}

}
