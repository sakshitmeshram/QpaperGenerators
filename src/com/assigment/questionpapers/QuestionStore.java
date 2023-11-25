package com.assigment.questionpapers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuestionStore {
	

		
		 public static List<Question> getQuestions(){
			 
			 Set<Question> questionSet = new HashSet<>();

			// Physics
			questionSet.add(new Question("What is the speed of light?", "Physics", "Waves", "Easy", 5));
			questionSet.add(new Question("Explain Newton's First Law of Motion", "Physics", "Mechanics", "Medium", 7));
			questionSet.add(new Question("Describe the Doppler effect.", "Physics", "Sound", "Hard", 10));
			questionSet.add(new Question("What are the laws of thermodynamics?", "Physics", "Thermodynamics", "Medium", 7));
			questionSet.add(new Question("Explain the concept of quantum entanglement.", "Physics", "Quantum Mechanics", "Hard", 10));

			// Mathematics
			questionSet.add(new Question("Solve the equation x^2 + 5x - 6 = 0", "Mathematics", "Algebra", "Hard", 10));
			questionSet.add(new Question("What is the value of pi (π)?", "Mathematics", "Geometry", "Easy", 5));
			questionSet.add(new Question("Solve the derivative of y = 3x^2 + 4x - 7.", "Mathematics", "Calculus", "Medium", 7));
			questionSet.add(new Question("What are matrices and their operations?", "Mathematics", "Linear Algebra", "Hard", 10));
			questionSet.add(new Question("What is the Pythagorean theorem?", "Mathematics", "Geometry", "Easy", 5));

			// Geography
			questionSet.add(new Question("What is the capital of France?", "Geography", "World Capitals", "Easy", 5));
			questionSet.add(new Question("Name the longest river in the world.", "Geography", "Rivers", "Medium", 7));
			questionSet.add(new Question("Explain the concept of continental drift.", "Geography", "Geology", "Hard", 10));
			questionSet.add(new Question("What are the main climate zones?", "Geography", "Climate", "Medium", 7));
			questionSet.add(new Question("Identify the Seven Wonders of the Ancient World.", "Geography", "History", "Easy", 5));

			// Art
			questionSet.add(new Question("Who painted the Mona Lisa?", "Art", "Renaissance Art", "Medium", 7));
			questionSet.add(new Question("What is surrealism in art?", "Art", "Art Movements", "Hard", 10));
			questionSet.add(new Question("Describe the Baroque style in art.", "Art", "Baroque Art", "Medium", 7));
			questionSet.add(new Question("Who is the creator of the sculpture 'David'?", "Art", "Sculpture", "Easy", 5));
			questionSet.add(new Question("What is pointillism?", "Art", "Art Movements", "Hard", 10));

			// Biology
			questionSet.add(new Question("Explain the concept of photosynthesis.", "Biology", "Cell Biology", "Medium", 7));
			questionSet.add(new Question("What is DNA and its structure?", "Biology", "Genetics", "Hard", 10));
			questionSet.add(new Question("Describe the process of mitosis.", "Biology", "Cell Biology", "Medium", 7));
			questionSet.add(new Question("What is the difference between prokaryotic and eukaryotic cells?", "Biology", "Cell Biology", "Easy", 5));
			questionSet.add(new Question("Discuss the theory of evolution by natural selection.", "Biology", "Evolution", "Hard", 10));

			
			
			return new ArrayList(questionSet);
			
	 }
		
	

}
