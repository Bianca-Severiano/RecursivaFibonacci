package controller;

public class ControllerFibonacci {

	public ControllerFibonacci() {
		super();
	}

	public int Fibonacci(int valor) {
		int fib = 0;
		if (valor == 1 || valor == 2) { // Quando valor da posição for 1 ou 2 retornar 1 para seguir com as consecutivas somatórias
			return 1;
		} else {
			fib = Fibonacci(valor - 1) + Fibonacci(valor - 2);
			return fib;
		}
	}

}

/*f(5) =  f(4) + f(3) --> 5
 * f(4) = f(3) + f(2) --> 3
 * f(3) = f(2) + f(1) --> 2
 * f(2) = 1
 * f(1) = 1
 * */
