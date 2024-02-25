package com.example.TodoList.service;

import com.example.TodoList.service.dto.NoteDto;

import java.util.List;
import java.util.UUID;

public interface NoteService {

    List<NoteDto> listAll();


    NoteDto add(NoteDto noteDto);


    void deleteById(UUID id) throws Exception;


    void update(NoteDto noteDto) throws Exception;


    NoteDto getById(UUID id) throws Exception;
}
