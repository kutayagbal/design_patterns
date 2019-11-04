package creational.singleton;

/*
 * Suppose that there are two threads running.
 * Both can get inside of the if statement concurrently when the instance is null. 
 * Then, one thread enters the synchronized block to initialize the instance, while the other is blocked. 
 * When the first thread exits in the synchronized block, the waiting thread enters and creates another singleton object. 
 * Note that when the second thread enters the synchronized block, it does not check to see if the instance is non-null.
 */
public class Singleton {
	private static Singleton _instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (_instance == null) {
			synchronized (Singleton.class) {
				if (_instance == null) { // double lock
					_instance = new Singleton();
				}
			}
		}

		return _instance;
	}
}
