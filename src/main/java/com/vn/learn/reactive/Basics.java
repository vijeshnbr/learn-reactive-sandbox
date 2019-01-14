package com.vn.learn.reactive;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import reactor.core.publisher.Flux;

public class Basics {
	private static final Logger LOGGER = LoggerFactory.getLogger(Basics.class);

	@Test
	public void mapping() {
		Flux<Integer> nums = Flux.just(1, 2, 3, 4, 5);
		nums.log()
			.map(i -> i * 5)
			.map(String::valueOf)
			.subscribe(LOGGER::info);
	}
}
