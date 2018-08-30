package phones;
import messages.Message;
import protocols.MessageProtocol;
import storage.ICloud;

public final class IPhone extends Phone implements MessageProtocol {

	public IPhone()
	{
		super(new ICloud());
	}
	
	public boolean send(Message message)
	{
		System.out.println();
		return false;	
	}
	
	
	public boolean receive(Message message) {
		System.out.println();
		return false;
	}
}
