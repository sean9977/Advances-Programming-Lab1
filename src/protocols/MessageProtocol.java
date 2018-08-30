package protocols;

import messages.Message;

public interface MessageProtocol {

	public boolean send(Message meassage);
	public boolean receive(Message message);
	
}
