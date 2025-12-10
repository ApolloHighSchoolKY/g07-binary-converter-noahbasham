public class BinaryConverter
{
	//Instance Variables
	private int value;
	private String binaryValue;

	//Default Constructor
    public BinaryConverter()
    {
    	value=0;
    	binaryValue="";
    }

    //Modified  Constructor(s)
    public BinaryConverter(int newValue)
    {
    	value=newValue;
    	binaryValue="";
    }

    public BinaryConverter(String newBinary)
    {
    	value=0;
    	binaryValue=newBinary;
    }

    //Methods
    public int getValue()
    {
    	return value;
    }

    public String getBinary()
    {
    	return binaryValue;
    }

    public void setValue(int newValue)
    {
    	value=newValue;
    }

    public void setBinary(String newBinary)
    {
    	binaryValue = newBinary;
    }

    public String toBinary()
    {
    	//Convert the integer value to binary
        int x = value;
        //loop to find the binary value
        for(int i=7; i>=0; i--)
        {
            if(x - (int)Math.pow(2,i) >= 0)
            {
                x = x - (int)Math.pow(2,i);
                binaryValue = binaryValue + "1";
            }
            else
                binaryValue = binaryValue + "0";
        }

    	return binaryValue;
    }

    public int toDecimal()
    {
    	//Convert the binary value to decimal
        String x = binaryValue;
        //loop to find the decimal value
        for(int i=0; i<=7; i++)
        {
            if(x.charAt(i)=='1')
                value = value + (int)Math.pow(2,7-i);

        }

    	return value;
    }

    public String toString()
    {
        String str = "" + "The decimal value is " + getValue() + "\n"
                   + "The binary value is " + getBinary();

        return str;
        
    }
}