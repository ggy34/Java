package com.example.myapplication222;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String name;
    private String company;
    private int age;

    public User(String name, String company, int age) {
        this.name = name;
        this.company = company;
        this.age = age;
    }

    protected User(Parcel in) {
        name = in.readString();
        company = in.readString();
        age = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(company);
        dest.writeInt(age);
    }

    public String getName() { return name; }
    public String getCompany() { return company; }
    public int getAge() { return age; }
}