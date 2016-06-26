package Tennis;

public class Tennis {

	private static String[] scoreNote = {"Love", "Fifteen", "Thirty", "Forty"};
	
	private static String scoreBord_Tie(int[] scoreArray){
		if(scoreArray[0] < 3)
			return scoreNote[scoreArray[0]] + " All";
		else
			return "Deuce";
	}
	private static String scoreBord_Range(int[] scoreArray)
	{
		return scoreNote[scoreArray[0]] + " " + scoreNote[scoreArray[1]];
	}
	
	private static String scoreBord_Win_Advantage(int[] scoreArray){
		if(scoreArray[0] - scoreArray[1] > 1)
			return "A Win";
		else if(scoreArray[1] - scoreArray[0] > 1)
			return "B Win";
		if(scoreArray[0] - scoreArray[1] == 1)
		{
			if(scoreArray[0] > 4)
				return "A Win";
			else
				return "A Advantage";		
		}	
		if(scoreArray[1] - scoreArray[0] == 1)
		{
			if(scoreArray[1] > 4)
				return "B Win";
			else
				return "B Advantage";		
		}
		return null;
	}

	public static String scoreBord(int[] scoreArray) {
		if(scoreArray[0] == scoreArray[1])
		{
			return scoreBord_Tie(scoreArray);

		}
		else if(scoreArray[0] > 3 || scoreArray[1] > 3)
		{
			return scoreBord_Win_Advantage(scoreArray);

		}
		return scoreBord_Range(scoreArray);
	}
	
	

}
