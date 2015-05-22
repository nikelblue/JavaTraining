package org.training.threads.example07;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student extends Philosopher {
	private static final Logger LOGGER = LoggerFactory.getLogger(Student.class);
	
	private final String[] sentences = {
			"1. Master?",
			"3. I've notice people don't know how to communicate.",
			"5. Could you please tell me what is the best way to have a dialogue?",
			"7. What I am supposing to do?",
			"9. So, I wait for you to finish what you have to say.",
			"11. So, I get the chopstick and I can speak whatever I like",
			"13.And you are not allowed to speak anymore",
			"15.Wow, in this way each of us will have same chance to speak."
	};
	
	public Student(String name) {
		super(name);
	}


	@Override
	public void run() {
		for (String sentence : sentences) {
			LOGGER.info(sentence);
			meditate();
		}
	}
}
