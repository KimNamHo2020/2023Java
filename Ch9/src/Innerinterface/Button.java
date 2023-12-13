package Innerinterface;

public class Button {
	OnClickListener listener;
	
	void SetOnClickListener(OnClickListener listener)
	{
		this.listener = listener;
	}
	
	public void touch() 
	{
		listener.onClick();
	}
	
	public interface OnClickListener{
		void onClick();
	}
	
}
