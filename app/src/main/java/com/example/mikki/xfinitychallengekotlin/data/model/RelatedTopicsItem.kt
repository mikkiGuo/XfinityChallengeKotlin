package com.example.mikki.xfinitychallengekotlin.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class RelatedTopicsItem(

	@field:SerializedName("Text")
	val text: String? = null,

	@field:SerializedName("Icon")
	val icon: Icon? = null,

	@field:SerializedName("FirstURL")
	val firstURL: String? = null,

	@field:SerializedName("Result")
	val result: String? = null
)