package com.java.general;

import java.io.File;

import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Xslt {
	public static void main(String args[]) throws Exception{	
		TransformerFactory tf = TransformerFactory.newInstance();
		Templates t = tf.newTemplates(new StreamSource(new File("C:/Users/mjain58/Desktop/ConvertInvestProduct2Levels.xslt")));
		t.newTransformer().transform(new StreamSource(new File("C:/Users/mjain58/Desktop/FlexMark_Select_Plus.xml")), new StreamResult(new File("C:/Users/mjain58/Desktop/FlexMark_Select_Plus_eApp.xml")));
		
		
		Transformer trs = tf.newTransformer(new StreamSource(new File("C:/Users/mjain58/Desktop/ConvertInvestProduct2Levels.xslt")));
		trs.transform(new StreamSource(new File("C:/Users/mjain58/Desktop/FlexMark_Select_Plus.xml")), new StreamResult(new File("C:/Users/mjain58/Desktop/FlexMark_Select_Plus_eApp1.xml")));
		
		
		
	}
}
