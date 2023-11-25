package com.assigment.questionpapers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class FilterAlgo {

	public static List<Question> que() {

		
		 List<Question> questions = QuestionStore.getQuestions();
		    List<Question> selectedQuestions = new ArrayList<>();
		    Map<String, Integer> remainingQuestions = new HashMap<>();
		    remainingQuestions.put("Easy", 5);
		    remainingQuestions.put("Medium", 5);
		    remainingQuestions.put("Hard", 4);

		    Collections.shuffle(questions); // Shuffle the list of questions

		    for (Question question : questions) {
		        String difficulty = question.getDifficulty();
		        if (remainingQuestions.containsKey(difficulty) && remainingQuestions.get(difficulty) > 0) {
		            selectedQuestions.add(question);
		            remainingQuestions.put(difficulty, remainingQuestions.get(difficulty) - 1);
		        }
		    }
		   
		    return selectedQuestions;
	}

}
