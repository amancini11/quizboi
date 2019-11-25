package edu.unca.csci201;

public class MultipleChoice implements Question {

	protected String question;
	protected String answer;
	protected boolean correct;
	
	
	public String getTheQuestionText() {
		
		return this.question;
	}

	
	public boolean isCorrectAnswer(String answer) {
		
		if(answer.equals(this.answer)) {
			this.correct = true;
		}else {
			this.correct = false;
		}
		
		return this.correct;
	}

	
	public String getCorrectAnswer() {
		
		return this.answer;
	}

}
