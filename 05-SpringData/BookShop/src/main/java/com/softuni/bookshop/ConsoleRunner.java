package com.softuni.bookshop;

import com.softuni.bookshop.repositories.AuthorRepository;
import com.softuni.bookshop.repositories.BookRepository;
import com.softuni.bookshop.repositories.CategoryRepository;
import com.softuni.bookshop.services.seed.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {
private final SeedService seedService;

    @Autowired
    public ConsoleRunner( SeedService seedService) {
        this.seedService = seedService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.seedService.seedAuthors();
    }
}
