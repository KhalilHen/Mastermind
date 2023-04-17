package masterMind;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MasterMind
{

    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);

	// CodeMaker field
	
	System.out.println("Progam choice a code");
	boolean[] nothing = new boolean[4];

	
	
	Functions Code = new Functions();
	
	
	String[] Codemaker = Code.CodeMaker();



	ArrayList<String[]> Kleuren = new ArrayList<String[]>();

	// Codemaker finder

	for (int Rounds = 1; Rounds <= 10; Rounds++)
	{

	    // boolean CodeCorrector1 = (false)
	    boolean[] codetest = new boolean[4];
	    boolean[] Codecorrector = new boolean[4];
	    for (int i = 0; i < Codecorrector.length; i++)
	    {
		nothing[i] = false;
		codetest[i] = false;
		Codecorrector[i] = false;

	    }
	   
	    System.out.println("Rounds" + Rounds);
	    System.out.println("Guess the code");
//	    for (Colors[] Colors[] : Colors[].values())
//		{
//		    if (guessfield[i].toLowerCase().equals(Colors.name().toLowerCase()))
//		    {
//			guessesfield[i] = colour;
//		    }
	    String[] guessfield = new String[4];
	    for (int i = 0; i < guessfield.length; i++)
	    {
		guessfield[i] = sc.next();
	    }
//	    Kleuren.add(guessfield);
//
//	    for (String[] kleur : Kleuren)
//	    {
//
//		for (String k : kleur)
//		{
//		    System.out.print(k + "\t" + "\t");
//		}
//	    }

//	    System.out.println("Are you sure of your choice");
//	    sc.next();
//		if()
//		
	    
	    
	    Functions Compare = new Functions();
	    String [] Codecompare = Compare.CodeCompare(Codemaker, guessfield);
	    
	    for(String R: Codecompare)
	    {
		System.out.println(R);
	    }


	    
	    
	    
	    for (int i = 0; i < guessfield.length; i++)
	    {

		if (nothing[i] == true)
		{

		    System.out.println("Nothing");
		}

	    }

	    Functions fn = new Functions();
	    boolean won = fn.CheckCodeCorrector(Codecorrector);

	    if (won == true)
	    {

		System.out.println("---You have won-----");
		Rounds = 10;

	    }

	    else if (Rounds == 10)
	    {
		System.out.println("You have lost");

		System.out.println();

		System.out.println("The code was" + "\t");
		for (String test : Codemaker)
		{

		    System.out.println(test + "\t");

		}
	    }

	}
	sc.close();

    }
}
