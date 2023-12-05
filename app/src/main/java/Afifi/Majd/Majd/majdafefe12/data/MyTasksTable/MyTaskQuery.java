package Afifi.Majd.Majd.majdafefe12.data.MyTasksTable;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MyTaskQuery {


    List<MyTask> getAllTasks();
    @Query("SELECT * FROM MyTask ORDER BY importance DESC")
}
