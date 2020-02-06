// Lab12avst.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.


import java.util.Scanner;

public class Lab12avst
{
	public static void main(String[] args)
	{
		MagpieLab12a maggie = new MagpieLab12a();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}


class MagpieLab12a
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
    //Add 10 new responses in a dynamic array for 100 point version
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 10;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
    //Add a static array with 10 new responses for 80 point version
    String response[] = {"How are you","I like you","You are a pretty cool dude","Wow that's really cool","Whoa","Did you see that?","What's up","What's going on homie","Sup Homie","What's cooking good looking"};

		public String response {return whichResponse;}
	}
}
