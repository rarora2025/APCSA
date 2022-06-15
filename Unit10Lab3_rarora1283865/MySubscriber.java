
public class MySubscriber extends Subscriber {
	private static int number_of_subs;
	int current_subscriber;
	
	public MySubscriber() {
		number_of_subs++;
		current_subscriber = number_of_subs;
		
	}
	public void update() {
		System.out.printf("\nSubscriber %d has been notified", current_subscriber);
	}
	
	
	

}
