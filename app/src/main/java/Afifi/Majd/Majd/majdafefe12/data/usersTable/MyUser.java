package Afifi.Majd.Majd.majdafefe12.data.usersTable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MyUser
{
    @PrimaryKey(autoGenerate = true)
    public long keyid;
    @ColumnInfo(name = "full_Name")
    public String fullName;
    public String email;
    public String phone;
    public String passw;



    @Override
    public String toString() {
        return "MyUser{" +
                "keyid=" + keyid +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", passw='" + passw + '\'' +
                '}';

      }
    }
