/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublechecked;

/**
 *
 * @author Deki
 */
public class DoubleCheckedSingleton {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Abc obj = Abc.getInstance();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Abc obj = Abc.getInstance();
			}
		});
		t1.start();
		t2.start();
	}

}

class Abc {
	static Abc obj;

	private Abc() {
		System.out.println("Instance created");
	}

	public static Abc getInstance() {

		if (obj == null) {

			synchronized (Abc.class) {

				if (obj == null) {

					obj = new Abc();
				}

			}
		}
		return obj;
	}
}
