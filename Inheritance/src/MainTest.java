import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		Question first = new Question();
		first.setText("Who was the inventor of Java?");
		first.setAnswer("James Gosling");
//
//		Question second = new Question();
//		second.setText("Who was your father");
//		second.setAnswer("Murali");
		
		
//		
//        ChoiceQuestion first = new ChoiceQuestion();
//        first.setText("What was the original name of the Java language?");
//        first.addChoice("*7", false);
//        first.addChoice("Duke", false);
//        first.addChoice("Oak", true);
//        first.addChoice("Gosling", false);

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);
        


		int score = 0;
		score = score + presentQuestion(first, in);
		score = score + presentQuestion(second, in);

		// Present the second question
		System.out.println("Your score: " + score);

	}

	/**
	 * Presents a question to the user and obtains a response.
	 * 
	 * @param q
	 *            the question to present
	 * @param in
	 *            the scanner from which to read the user input
	 * @return the score (1 if correct, 0 if incorrect);
	 */
	public static int presentQuestion(Question q, Scanner in) {
		// Display the first question
		q.display();
		System.out.println("Your answer:");
		String response = in.nextLine();
		
		// Check whether the response was correct
		// If so, print "true" and return 1
		// Otherwise, print "false" and return 0
		
		boolean outcome=q.checkAnswer(response);
		if(outcome){
			return 1;
		}
		else{
			return 0;
		}
	}

}
