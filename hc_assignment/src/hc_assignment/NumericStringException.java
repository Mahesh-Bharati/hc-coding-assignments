package hc_assignment;

@SuppressWarnings("serial")
public class NumericStringException extends Exception {

	String str;
	public NumericStringException(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}
	public String getException()
	{
		return str;
	}

}
