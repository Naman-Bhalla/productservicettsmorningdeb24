package dev.naman.productservicettsmorningdeb24.advices;

import dev.naman.productservicettsmorningdeb24.dtos.ErrorDto;
import dev.naman.productservicettsmorningdeb24.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorDto> handleProductNotFoundExeption(ProductNotFoundException exception) {

        ErrorDto errorDto = new ErrorDto();
        errorDto.setMessage(exception.getMessage());

        return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
//        return null;
    }
}
