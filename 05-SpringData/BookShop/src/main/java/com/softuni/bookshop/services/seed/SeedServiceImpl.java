package com.softuni.bookshop.services.seed;

import com.softuni.bookshop.domain.entities.Author;
import com.softuni.bookshop.services.author.AuthorService;
import com.softuni.bookshop.services.book.BookService;
import com.softuni.bookshop.services.category.CategoryService;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

import static com.softuni.bookshop.Constants.FilePaths.AUTHOR_FILE_NAME;
import static com.softuni.bookshop.Constants.FilePaths.RESOURCE_URL;

@Component
public class SeedServiceImpl implements SeedService {

    private final AuthorService authorService;
    private final BookService bookService;
    private final CategoryService categoryService;

    public SeedServiceImpl(AuthorService authorService, BookService bookService, CategoryService categoryService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.categoryService = categoryService;
    }


    @Override
    public void seedAuthors() throws IOException {
        if (!this.authorService.isDataSeeded()) {
            this.authorService
                    .seedAuthors(Files.readAllLines(Path.of(RESOURCE_URL + AUTHOR_FILE_NAME))
                            .stream()
                            .filter(s -> !s.isBlank())
                            .map(s -> Author.builder()
                                    .firstName(s.split(" ")[0])
                                    .lastName(s.split(" ")[1])
                                    .build())
                            .collect(Collectors.toList()));
        }
    }

    @Override
    public void seedBooks() {

    }

    @Override
    public void seedCategories() {

    }
}
