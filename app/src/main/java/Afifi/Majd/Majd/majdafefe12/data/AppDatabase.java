package Afifi.Majd.Majd.majdafefe12.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import Afifi.Majd.Majd.majdafefe12.data.MyTasksTable.MyTask;
import Afifi.Majd.Majd.majdafefe12.data.MyTasksTable.MyTaskQuery;
import Afifi.Majd.Majd.majdafefe12.data.SubjectTable.MySubject;
import Afifi.Majd.Majd.majdafefe12.data.SubjectTable.MySubjectQuery;
import Afifi.Majd.Majd.majdafefe12.data.usersTable.MyUser;
import Afifi.Majd.Majd.majdafefe12.data.usersTable.MyUserQuery;

@Database(entities = {MyUser.class, MySubject.class, MyTask.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase db;

    public abstract MyUserQuery getMyUserQuery();

    public abstract MySubjectQuery getMySubjectQuery();

    public abstract MyTaskQuery getMyTaskQuery();

    public static AppDatabase getDb(Context context)
    {
    if(db==null)

    {

        db = Room.databaseBuilder(context, AppDatabase.class, "samihDataBase")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }
    return db;
 }
}