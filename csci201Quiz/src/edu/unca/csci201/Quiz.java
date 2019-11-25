package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {
	
	public void AddQuestion(Question q){
		
		
	
		
		
	}
	
	public double GiveQuiz() {
		
	
		
		Scanner scan = new Scanner(System.in);
		
		double grade;
		double right = 0;
		int i = 0;
		
		
		Question q = new testMC(); 
		Question [] quiz = new Question[25];
	
		
		
		
		
		
		//loop below
			
			System.out.println(q.getTheQuestionText());
			
			if(q.isCorrectAnswer(scan.next())) {
				right ++;
			}
			
			
	
		
		
		
		
		
		grade = right/25;
		
		
		return grade;
	}

}
