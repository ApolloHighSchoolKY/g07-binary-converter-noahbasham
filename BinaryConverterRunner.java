
public class BinaryConverterRunner
{

    public static void main(String[] args)
    {
    	BinaryConverter steve = new BinaryConverter();

    	System.out.println(steve.getValue());

    	steve.setValue(100);

    	System.out.println(steve.getValue());

    	System.out.println(steve.toBinary());

		System.out.println(steve);

    	System.out.println((int)Math.pow(2,4));

    	BinaryConverter jane = new BinaryConverter("11111111");

    	System.out.println(jane.getBinary());

    	System.out.println(jane.toDecimal());

		System.out.println(jane);
    }


}