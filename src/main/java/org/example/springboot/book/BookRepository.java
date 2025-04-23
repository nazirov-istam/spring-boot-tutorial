package org.example.springboot.book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    // Extend olgandan keyin , bu class MAXSUS DAO BEAN yoki MAXSUS Class buladi.

    // CrudRepository - ichidagi methodlarni Spring DATA JPA yozib beradi.


}
