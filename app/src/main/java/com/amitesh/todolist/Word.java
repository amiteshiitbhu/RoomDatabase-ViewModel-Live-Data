package com.amitesh.todolist;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    @ColumnInfo(name = "timeStamp")
    private long timeStamp;

    public Word(String word, long timeStamp) {
        this.mWord = word;
        this.timeStamp = timeStamp;
    }

    public String getWord() {
        return this.mWord;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
