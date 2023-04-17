package masterMind;

import java.util.Random;

public class Functions
{
    
    /**
     * It's a process that checks if the Codecorrector is equals, or not then the code.
     *
     * @param codecorrectorthe 
     * 
     * @return a token with value of True or false
     */
    public boolean CheckCodeCorrector(boolean[] codecorrector)
    {
	boolean won = true;
	for (int i = 0; i < 4; i++)
	{

	    if (codecorrector[i] == false)

	    {
		won = false;

	    }
	}
	return won;
    }
/**
 * The CodeMaker is the program that choices a code.
 * 4 from the 6 colors avaibel
 *
 * @param CodeMaker
 * 
 * 
 * @return It returns a Colored code of 4 different/equals colors.
 * 
 */
    public String[] CodeMaker()
    {
	String[] Colors = new String[6];

	Colors[0] = "Red";
	Colors[1] = "Purpel, test";
	Colors[2] = "Orange";
	Colors[3] = "Blue";
	Colors[4] = "Green";
	Colors[5] = "Yellow";
	String[] Codemaker = new String[4];
	boolean[] nothing = new boolean[4];
	
	Random random = new Random();
	for (int i = 0; i < 4; i++)
	{
	    int rand = random.nextInt(Colors.length);
	    Codemaker[i] = Colors[rand]; // uitleggen
//	    System.out.println(Codemaker[i]);
	}
	

	return Codemaker;

    }
    

    /**
     * CodeCompare is the proces of the CodeMaker code been compared with the code of the user.
     * Via that it will be decide, if there nees to be place a  blackpin or Whitepin, or nothingh
     * @param Codemaker
     * @param guessfield
     * @return There will be return 4 string values, Blackpin, Whitepin, Nothing
     */
    public String[] CodeCompare(String[] Codemaker, String guessfield[])

    {
	
	String[] resultaat = new String[4];
	

	for (int i = 0; i < guessfield.length; i++)
	{
	    resultaat[i] = "Nothing";
	    if (Codemaker[i].equalsIgnoreCase(guessfield[i]))
	    {
		//System.out.println("BlackPin");
		resultaat[i] ="Blackpin";
	    } else
	    {
		for (int t = 0; t < guessfield.length; t++)
		{
		    if (Codemaker[i].equalsIgnoreCase(guessfield[t]))
		    {
			//System.out.println("WhitePin");
			resultaat[i] ="Whitepin";
			
		    }

		}
	    }

	}
	
	
	return resultaat;

    }

}
