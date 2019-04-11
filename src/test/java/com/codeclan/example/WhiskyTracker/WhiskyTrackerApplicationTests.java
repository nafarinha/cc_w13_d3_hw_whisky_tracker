package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindWhiskiesByYear() {
		List<Whisky> found = whiskyRepository.findWhiskiesByYear(2018);
		assertEquals(2, found.size());
	}

	@Test
	public void canFindDistillersByRegion() {
		List<Distillery> found = distilleryRepository.findDistilleriesByRegion("Speyside");
		assertEquals(2, found.size());
	}

	@Test
	public void canFindWhiskiesByAgeAndDistilleryNamed() {
		List<Whisky> found = whiskyRepository.findWhiskiesByAgeAndDistilleryNamed("Glendronach", 15);
		assertEquals("The Glendronach Revival", found.get(0).getName());
	}

	@Test
	public void canFindWhiskiesByDistilleryRegionNamed() {
		List<Whisky> found = whiskyRepository.findWhiskiesByDistilleryRegionNamed("Highland");
		assertEquals("The Glendronach Revival", found.get(0).getName());
	}

	@Test
	public void canFindDistilleriesByWhiskiesAged12() {
		List<Distillery> found = distilleryRepository.findDistilleriesByWhiskiesAged12();
		assertEquals(2, found.size());
		assertEquals("Rosebank", found.get(0).getName());
		assertEquals("Glendronach", found.get(1).getName());
	}

}
