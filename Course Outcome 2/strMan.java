package CO2;
public class strMan
{
	public static void main(String [] args)
  {
		String s="Who are you ?";
		System.out.println("UpperCase : "+s.toUpperCase());
		System.out.println("LowerCase : "+s.toLowerCase());
		System.out.println("Trim : "+s.trim());
		System.out.println("Replace : "+s.replace("are you","am I"));
		System.out.println("Length : "+s.length());
		System.out.println("Character at position : "+s.charAt(4));
	}
}
