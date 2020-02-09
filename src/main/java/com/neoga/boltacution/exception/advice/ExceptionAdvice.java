package com.neoga.boltacution.exception.advice;

import com.neoga.boltacution.exception.custom.CAuthEntryPointException;
import com.neoga.boltacution.exception.custom.CEmailLoginFailedException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(CAuthEntryPointException.class)
    public ResponseEntity authEntryPointException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @ExceptionHandler(CEmailLoginFailedException.class)
    public ResponseEntity emailLoginFailedException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity AccessDeniedException() {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}
