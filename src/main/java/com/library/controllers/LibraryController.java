package com.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.dtos.LibraryDto;
import com.library.services.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {

	@Autowired
	private LibraryService libraryService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createLibrary(@RequestBody LibraryDto libraryDto) {
		libraryService.createLibrary(libraryDto);

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public LibraryDto getLibraryById(@RequestParam(value = "id", required = true) Long libraryId,
			@RequestParam(value = "name", required = false) String name) {
		System.out.println("id  :" + libraryId + " ,name  :" + name);
		return libraryService.getLibraryById(libraryId);
	}
}
