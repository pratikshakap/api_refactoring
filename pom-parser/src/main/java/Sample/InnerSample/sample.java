package Sample.InnerSample;




import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import com.github.javaparser.JavaParser;
import com.github.javaparser.version.Java10PostProcessor;
import com.google.common.base.Converter;

import CS230.pom_parser.App;
import Sample.Sample1;
import javassist.tools.reflect.Sample;
import junit.framework.Assert;


public class sample {

//	private int add(String c,File s,BufferedReader br,Converter<Integer, String> p){
//		int a=0,b=0;
//		return a+b;
//	}
	protected String hello(){
		return "Hello World :) ";
	}
	private static boolean haha(){
		return true;
	}
	
	static public int ya(){
		return 0;
		
	}
	public void  foo(){
		//int c= add("ha",new File(""),new BufferedReader(null),null);
		//String f=hello();
		App a=new App();
		App.just();
		Sample1 s = new Sample1();
		Assert.assertTrue(s.alwaysTrue());
		Assert.assertFalse(5<10);
	}
	
	
	public void stuff() throws IOException{
		File file = new File("c:\\file.xml");
	      InputStream inputStream= new FileInputStream(file);
	      Reader reader = new InputStreamReader(inputStream,"UTF-8");
	      reader.read();
	      System.out.println( haha());
	}
	
}