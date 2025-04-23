package org.example.springboot;

import org.example.springboot.book.Book;
import org.example.springboot.book.BookRepository;
import org.example.springboot.config.ApplicationConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringbootApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigurer.class);
        BookRepository bookRepository = context.getBean(BookRepository.class);

        Book book = Book.builder()
                .name("Spring Booot in Action")
                .author("Salomat Xola")
                .build();

        Book book1 = Book.builder()
                .name("Spring Booot in Action2")
                .author("Salomat Xola2")
                .build();
        bookRepository.save(book);
        bookRepository.save(book1);

        bookRepository.deleteById(1);

        //bookRepository.findAll().forEach(System.out::println);

        //bookRepository.findById(1).ifPresentOrElse(System.out::println, () -> System.out.println("Book not found"));
        //bookRepository.findById(3).ifPresentOrElse(System.out::println, () -> System.out.println("Book not found"));
    }
}
