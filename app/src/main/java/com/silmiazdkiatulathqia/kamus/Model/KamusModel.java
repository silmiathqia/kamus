package com.silmiazdkiatulathqia.kamus.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class KamusModel implements Parcelable {

    private int id;
    private String kata;
    private String terjemahan;

    public KamusModel() {
    }

    public KamusModel(String kata, String terjemahan) {
        this.kata = kata;
        this.terjemahan = terjemahan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKata() {
        return kata;
    }

    public void setKata(String kata) {
        this.kata = kata;
    }

    public String getTerjemahan() {
        return terjemahan;
    }

    public void setTerjemahan(String translate) {
        this.terjemahan = translate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.kata);
        dest.writeString(this.terjemahan);
    }

    private KamusModel(Parcel in) {
        this.id = in.readInt();
        this.kata = in.readString();
        this.terjemahan = in.readString();
    }

    public static final Parcelable.Creator<KamusModel> CREATOR = new Parcelable.Creator<KamusModel>() {
        @Override
        public KamusModel createFromParcel(Parcel source) {
            return new KamusModel(source);
        }

        @Override
        public KamusModel[] newArray(int size) {
            return new KamusModel[size];
        }
    };
}
