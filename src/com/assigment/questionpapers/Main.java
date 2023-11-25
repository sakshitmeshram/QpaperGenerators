package com.assigment.questionpapers;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuestionStore questionStore = new QuestionStore();
        
        
     
        List<Question> questionPaper = FilterAlgo.que();  
        
         questionPaper.stream().forEach(System.out::println);
        
    }
}
