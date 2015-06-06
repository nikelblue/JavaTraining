package org.training.threads.example07;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Master extends Philosopher {
	private static final Logger LOGGER = LoggerFactory.getLogger(Master.class);

	private final String[] sentences = {
			"2. Yes my student.",
			"4. So?",
			"6. Look at this chopstick. While I am talking I am holding it",
			"8. As long as you don't hold the chopstick, you are not allowed to speak.",
			"10.Correctly. When I finish what I have to say, I give the chopstick to you.",
			"12.Yes.",
			"14.Very correct!"
	};

	public Master(String name, Object speaker) {
		super(name, speaker);
	}

	@Override
	public void run() {
		for (String sentence : sentences) {
			try {
				synchronized(speaker){
					speaker.wait();
				}
				meditate();
				synchronized(speaker){
					LOGGER.info(sentence);
					speaker.notify();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}



