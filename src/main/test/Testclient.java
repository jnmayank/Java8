import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.java8.Impl.Car;
import com.java8.Impl.Car2;
import com.java8.Impl.Car3;
import com.java8.Impl.SimpleCar;
import com.java8.Impl.Util;
import com.java8.Interface.Interface5;


public class Testclient {
	public int print(Integer a){
		return a;
	}
	public static void main(String args []){
		List<String> l = new ArrayList<>(); // type inference
		
		List<String> l2 = new ArrayList<String>();
		
		l=l2;
		l2=l;
		
		SimpleCar car = new SimpleCar();
		car.run();
		car.stop();
		
		Car car1 = new Car();
		car1.flying();
		car1.run();
		
		Car2 car2 = new Car2();
		car2.flying();
		
		Car3 car3 = new Car3();
		car3.flying();
		
		Util u  = new Util();
		u.printStr("");
		Integer a;
	}

}
