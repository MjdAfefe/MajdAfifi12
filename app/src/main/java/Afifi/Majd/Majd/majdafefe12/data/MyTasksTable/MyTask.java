package Afifi.Majd.Majd.majdafefe12.data.MyTasksTable;

import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Entity
public class MyTask {
    @PrimaryKey(autoGenerate = true)
    public long keyld;
    public int importance;
    public String shortTitle;
    public String text;
    public long time;
    public boolean isCompleted;
    public long subjld;
    public long userld;

    public long getKeyld() {
        return keyld;
    }

    public void setKeyld(long keyld) {
        this.keyld = keyld;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public long getSubjld() {
        return subjld;
    }

    public void setSubjld(long subjld) {
        this.subjld = subjld;
    }

    public long getUserld() {
        return userld;
    }

    public void setUserld(long userld) {
        this.userld = userld;
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "keyld=" + keyld +
                ", importance=" + importance +
                ", shortTitle='" + shortTitle + '\'' +
                ", text='" + text + '\'' +
                ", time=" + time +
                ", isCompleted=" + isCompleted +
                ", subjld=" + subjld +
                ", userld=" + userld +
                '}';
    }
}


