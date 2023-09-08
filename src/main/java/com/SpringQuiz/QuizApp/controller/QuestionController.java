package com.SpringQuiz.QuizApp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.SpringQuiz.QuizApp.Question;
import com.SpringQuiz.QuizApp.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController 
{
	@Autowired
	QuestionService questionService;
	
	@GetMapping("/allQuestion")
	public List<Question>  getAllQuestions()
	{
		return questionService.getAllQuestions();
	}
	
	@GetMapping("/category/{category}")
	public List<Question> getQuestionByCategory(@PathVariable String category)
	{
		return questionService.getQuestionByCategory(category);
	}
	
	@GetMapping("/filter/{category}/{difficultyLevel}")
	public List<Question> getQuestionByFilter(@PathVariable String category,@PathVariable String difficultyLevel)
	{	
		return questionService.getQuestionByFilter(category, difficultyLevel);
	}
	
	@GetMapping("/filter/{difficultyLevel}")
	public List<Question> getQuestionByFilter(@PathVariable String difficultyLevel)
	{	
		return questionService.getQuestionByDifficultyLevel(difficultyLevel);
	}
	
	@PostMapping("/addQuestion")
	public String addQuestion(@RequestBody Question question)
	{
		return questionService.addQuestion(question);
		
	}

}
