package com.example.announce

import android.os.Parcel
import android.os.Parcelable

data class data(val title:String, val content:String) :Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(content)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<data> {
        override fun createFromParcel(parcel: Parcel): data {
            return data(parcel)
        }

        override fun newArray(size: Int): Array<data?> {
            return arrayOfNulls(size)
        }
    }
}
