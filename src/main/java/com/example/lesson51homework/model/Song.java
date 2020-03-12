package com.example.lesson51homework.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "songs")
@Data
@CompoundIndex(def = "{'singer':1, 'songName':1}")
//добавил составной индекс для лучшего поиска по названию песни и испольнетелю
public class Song {
    @Id
    private String id;
    private String singer;
    private String songName;
}