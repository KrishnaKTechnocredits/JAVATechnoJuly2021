package technocredits1.exception;

public class AgeNotValidException extends Exception{
	
	public AgeNotValidException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return "UserDefined Exception : " + super.getMessage();
	}
	
	
}
