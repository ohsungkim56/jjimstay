package com.jjimstay;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Public on 2016-07-20.
 */
public class Spa implements Parcelable {
    public static Parcelable.Creator<Spa> CREATOR = new ClassLoaderCreator<Spa>() {
        @Override
        public Spa createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new Spa(parcel);
        }

        @Override
        public Spa createFromParcel(Parcel parcel) {
            return new Spa(parcel);
        }

        @Override
        public Spa[] newArray(int i) {
            return new Spa[i];
        }
    };
    private int backGroundImage;
    private String name;
    private String price;
    private String location;

    public Spa(Parcel parcel) {
        backGroundImage = parcel.readInt();
        name = parcel.readString();
        price = parcel.readString();
        location = parcel.readString();
    }

    public Spa(int backGroundImage, String name, String price, String location) {
        this.backGroundImage = backGroundImage;
        this.price = price;
        this.location = location;
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getBackGroundImage() {
        return backGroundImage;
    }

    public void setBackGroundImage(int backGroundImage) {
        this.backGroundImage = backGroundImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(backGroundImage);
        parcel.writeString(price);
        parcel.writeString(location);
        parcel.writeString(name);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("backGroundImage : ").append(this.backGroundImage)
                .append("\nname : ").append(price)
                .append("\nlocation : ").append(location)
                .append("\nprice : ").append(price).toString();

    }
}
