package phones;

import messages.Message;
import protocols.MessageProtocol;
import storage.Google;


public class Android extends Phone implements MessageProtocol {

	public Android() {
		
		super(new Google());
		
	}

	public boolean send(Message message)
	{
		System.out.println("Sender " + message.toString());
		return false;	
	}
	
	
	public boolean receive(Message message) {
		System.out.println("Received " + message.toString());
		return false;
	}
}
