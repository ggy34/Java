package com.example.myapplication222;
import android.os.Parcel;
import android.os.Parcelable;
public class Persona implements Parcelable {
    private String name;
    private int imageResource;
    private int imageResource2;

    public Persona(String name, int imageResource, int imageResource2) {
        this.name = name;
        this.imageResource = imageResource;
        this.imageResource2 = imageResource2;
    }

    // Parcelable implementation
    protected Persona(Parcel in) {
        name = in.readString();
        imageResource = in.readInt();
        imageResource2 = in.readInt();
    }

    public static final Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel in) {
            return new Persona(in);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(imageResource);
        dest.writeInt(imageResource2);
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getImageResource2() {
        return imageResource2;
    }
}