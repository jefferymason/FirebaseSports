package com.mason.firebasesports

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Sports(
    var title: String? = null,
    var originated: String? = null
) : Parcelable