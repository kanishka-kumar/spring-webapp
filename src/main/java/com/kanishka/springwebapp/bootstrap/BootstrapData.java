package com.kanishka.springwebapp.bootstrap;

import com.kanishka.springwebapp.domain.Author;
import com.kanishka.springwebapp.domain.Book;
import com.kanishka.springwebapp.repositories.AuthorRepository;
import com.kanishka.springwebapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Inside BootstrapData");
        Author sampleAuthor = new Author();
        sampleAuthor.setFirstName("Uncle");
        sampleAuthor.setLastName("Sam");

        Book sampleBook = new Book();
        sampleBook.setTitle("Sample Book for Spring Framework");
        sampleBook.setIsbn("789456123");

        Author sampleAuthorSaved=authorRepository.save(sampleAuthor);
        Book sampleBookSaved=bookRepository.save(sampleBook);

        Author anotherAuthor = new Author();
        anotherAuthor.setFirstName("Fictional");
        anotherAuthor.setLastName("Author");

        Book anotherBook = new Book();
        anotherBook.setTitle("Fictional world");
        anotherBook.setIsbn("963258741");

        Author anotherAuthorSaved=authorRepository.save(anotherAuthor);
        Book anotherBookSaved=bookRepository.save(anotherBook);

        sampleAuthorSaved.getBooks().add(sampleBookSaved);
        anotherAuthorSaved.getBooks().add(anotherBookSaved);

        authorRepository.save(sampleAuthorSaved);
        authorRepository.save(anotherAuthorSaved);

        System.out.println("Authors Count: "+authorRepository.count());
        System.out.println("Books Count: "+bookRepository.count());

    }
}
