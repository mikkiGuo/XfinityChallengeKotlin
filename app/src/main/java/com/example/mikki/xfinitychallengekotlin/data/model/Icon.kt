package com.example.mikki.xfinitychallengekotlin.data.model

import com.google.gson.annotations.SerializedName

data class Icon(

	@field:SerializedName("Height")
	val height: String? = null,

	@field:SerializedName("Width")
	val width: String? = null,

	@field:SerializedName("URL")
	val uRL: String? = null
)