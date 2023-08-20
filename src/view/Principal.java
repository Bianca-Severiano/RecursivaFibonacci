package view;
import controller.ControllerFibonacci;
public class Principal {

	public static void main(String[] args) {
		int n = 5;
		
		ControllerFibonacci cf = new ControllerFibonacci();
		System.out.println(cf.Fibonacci(n));
	}
	


}
