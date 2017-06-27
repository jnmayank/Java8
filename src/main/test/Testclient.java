import java.util.Comparator;

import com.java8.Impl.Car;
import com.java8.Impl.Car2;
import com.java8.Impl.Car3;
import com.java8.Impl.SimpleCar;
import com.java8.Impl.Util;
import com.java8.Interface.Interface5;


public class Testclient {
	
	public static void main(String args []){
		
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
	}

}
