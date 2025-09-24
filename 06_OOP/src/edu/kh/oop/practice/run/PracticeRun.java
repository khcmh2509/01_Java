package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service.BookService;
import edu.kh.oop.practice.model.service.HeroService;

public class PracticeRun {

	public static void main(String[] args) {
		BookService service = new BookService();
		//service.practice();
		
		HeroService heroService = new HeroService();
		heroService.practice();
		
	}
}
