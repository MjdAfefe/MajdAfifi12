package Afifi.Majd.Majd.majdafefe12.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import Afifi.Majd.Majd.majdafefe12.data.MyTasksTable.MyTask;
import Afifi.Majd.Majd.majdafefe12.data.MyTasksTable.MyTaskQuery;
import Afifi.Majd.Majd.majdafefe12.data.SubjectTable.MySubject;
import Afifi.Majd.Majd.majdafefe12.data.usersTable.MyUser;
import Afifi.Majd.Majd.majdafefe12.data.usersTable.MyUserQuery;

@Database(entities = {MyUser.class, MySubject.class, MyTask.class},version = 1)
public abstract class AppDatabase extends RoomDatabase
{
    private static AppDatabase db;
    public abstract MyUserQuery getMyUserQuery();
    public abstract MyTaskQuery getMyTaskQuery();

}
