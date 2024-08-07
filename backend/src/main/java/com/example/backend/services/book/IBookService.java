package com.example.backend.services.book;

import com.example.backend.exceptions.DataNotFoundException;
import com.example.backend.models.dtos.BookDTO;
import com.example.backend.models.responses.BookDetailResponse;
import com.example.backend.models.responses.BookResponse;

import java.util.List;

import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService {

    Page<BookResponse> getByPaging(
            int pageNo, int pageSize, String sortBy, String sortDirection, String keyword);

    BookDetailResponse getById(Long id);

    BookDTO save(BookDTO category);

    BookDTO update(@NonNull BookDTO category);

    BookResponse createBook(@NonNull BookDTO bookDTO) throws Exception;

    BookResponse createLinkAndThumnail(Long id, String thumnail, String Link) throws Exception;

    Page<BookResponse> getByName(String name, Pageable pageable);

    List<BookResponse> getBooksByUserId(@NonNull Long id);

    List<BookResponse> getBooksByCategoryId(@NonNull Long id);
    List<BookResponse> getBooksByAuthorId(@NonNull Long id);

    BookResponse addBookToUser(@NonNull Long userId, @NonNull Long bookId) throws DataNotFoundException;
}
