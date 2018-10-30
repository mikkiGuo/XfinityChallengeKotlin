package com.example.mikki.xfinitychallengekotlin.data.model

import com.google.gson.annotations.SerializedName

data class DeveloperItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("url")
	val url: String? = null
)