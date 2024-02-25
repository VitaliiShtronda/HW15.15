package com.example.TodoList.service.mapper;

import com.example.TodoList.data.entity.NoteEntity;
import com.example.TodoList.service.dto.NoteDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class NoteMapper {

    public NoteEntity toNoneEntity(NoteDto noteDto) {
        NoteEntity noteEntity = new NoteEntity();
        noteEntity.setId(noteDto.getId());
        noteEntity.setTitle(noteDto.getTitle());
        noteEntity.setContent(noteDto.getContent());
        return noteEntity;
    }


    public NoteDto toNoteDto(NoteEntity noteEntity) {
        NoteDto noteDto = new NoteDto();
        noteDto.setId(noteEntity.getId());
        noteDto.setTitle(noteEntity.getTitle());
        noteDto.setContent(noteEntity.getContent());
        return noteDto;
    }


    public List<NoteEntity> toNoteEntities(List<NoteDto> noteDtos) {
        return noteDtos.stream()
                .map(this::toNoneEntity)
                .collect(Collectors.toList());
    }


    public List<NoteDto> toNoteDtos(List<NoteEntity> noteEntities) {
        return noteEntities.stream()
                .map(this::toNoteDto)
                .collect(Collectors.toList());
    }
}
