
public class TestPattern {

	public static void main(String[] args) {
		
		// create publisher and subscriber objects
		MySubscriber aSubscriber = new MySubscriber();
		MySubscriber aSubscriber2 = new MySubscriber();
		MySubscriber aSubscriber3 = new MySubscriber();
		MyPublisher aPublisher = new MyPublisher(3);
		
		//Register a subscriber
		aPublisher.register(aSubscriber);
		aPublisher.register(aSubscriber2);
		aPublisher.register(aSubscriber3);
	
		
		//Increment Publisher object to cause state changes
		aPublisher.increment();
		aPublisher.increment();
		
		//this one will exceed/equal the count and notify all subscribers
		aPublisher.increment();
		
		

	}

}
