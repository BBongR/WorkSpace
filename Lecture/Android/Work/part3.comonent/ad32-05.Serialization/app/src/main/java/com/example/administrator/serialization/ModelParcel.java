package com.example.administrator.serialization;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2018-01-17.
 */

public class ModelParcel implements Parcelable {

    private int idata = 0;
    private String sdata = "";

    protected ModelParcel(Parcel in) {
        idata = in.readInt();
        sdata = in.readString();
    }

    public static final Creator<ModelParcel> CREATOR = new Creator<ModelParcel>() {
        @Override
        public ModelParcel createFromParcel(Parcel in) {
            return new ModelParcel(in);
        }

        @Override
        public ModelParcel[] newArray(int size) {
            return new ModelParcel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(idata);
        dest.writeString(sdata);
    }

    public int getIdata() {
        return idata;
    }

    public void setIdata(int idata) {
        this.idata = idata;
    }

    public String getSdata() {
        return sdata;
    }

    public void setSdata(String sdata) {
        this.sdata = sdata;
    }

    public ModelParcel() {
    }

    public ModelParcel(int idata, String sdata) {
        this.idata = idata;
        this.sdata = sdata;
    }

    @Override
    public String toString() {
        return "ModelParcel{" +
                "idata=" + idata +
                ", sdata='" + sdata + '\'' +
                '}';
    }
}
