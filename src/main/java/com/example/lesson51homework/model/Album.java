package com.example.lesson51homework.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "albums")
@Data
@CompoundIndex(def = "{'albumName':1, 'realiseDate':1}")
//добавил составной индекс для лучшего поиска альбома по названию и дате выпуска
public class Album {
    private String authorAlbum;
    @Id
    private String id;
    private String albumName;
    //создал лист со ссылками на песни, чтобы был отдельный доступ по всем песням независимо от альбомов
    @DBRef
    private List<Song> songs;
    private String realiseDate;
}
