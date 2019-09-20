package com.library.services;

import org.springframework.stereotype.Service;

import com.library.dtos.LibraryDto;

@Service
public class LibraryService {

	public void createLibrary(LibraryDto libraryDto) {
		System.out.println(libraryDto.toString());
	}

	public LibraryDto getLibraryById(Long id) {

		LibraryDto library = new LibraryDto();
		library.setName("Harry Potter");
		library.setType("Hard Cover");
		library.setGenre("Fiction");

		return library;

	}

}
