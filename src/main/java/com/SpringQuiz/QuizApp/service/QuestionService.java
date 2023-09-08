package com.SpringQuiz.QuizApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SpringQuiz.QuizApp.Question;
import com.SpringQuiz.QuizApp.dao.QuestionDao;

@Service
public class QuestionService 
{
	@Autowired
	QuestionDao questionDao;
	
	public List<Question> getAllQuestions()
	{
		return questionDao.findAll();
		
	}
	
	public List<Question> getQuestionByCategory(String category)
	{
		return questionDao.findByCategory(category);
	}

	public String addQuestion(Question question) {
		questionDao.save(question);
		return "Success";
	}

	public List<Question> getQuestionByFilter(String category, String difficultyLevel) {
		
		return questionDao.findByCategoryAndDifficultyLevel(category, difficultyLevel);
				
	}

	public List<Question> getQuestionByDifficultyLevel(String difficultyLevel) {
		// TODO Auto-generated method stub
		return questionDao.findByDifficultyLevel(difficultyLevel);
	}
}
