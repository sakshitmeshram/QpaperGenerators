package com.assigment.questionpapers;

public class Question {
	
	public String question;
	
	public String subject;
	
	public String topic;
	
	public String difficulty;
	
	public int marks;
	
	public Question() {}

	public Question(String question, String subject, String topic, String difficulty, int marks) {
		super();
		this.question = question;
		this.subject = subject;
		this.topic = topic;
		this.difficulty = difficulty;
		this.marks = marks;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Question [question=" + question + ", subject=" + subject + ", topic=" + topic + ", difficulty="
				+ difficulty + ", marks=" + marks + "]";
	}
	
	
	
	
	
	

}
