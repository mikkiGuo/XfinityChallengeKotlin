package com.example.mikki.xfinitychallengekotlin.data.model

import com.google.gson.annotations.SerializedName

data class WireCharacter(

	@field:SerializedName("Entity")
	val entity: String? = null,

	@field:SerializedName("Heading")
	val heading: String? = null,

	@field:SerializedName("DefinitionSource")
	val definitionSource: String? = null,

	@field:SerializedName("RelatedTopics")
	val relatedTopics: List<RelatedTopicsItem?>? = null,

	@field:SerializedName("Abstract")
	val abstract: String? = null,

	@field:SerializedName("AbstractURL")
	val abstractURL: String? = null,

	@field:SerializedName("DefinitionURL")
	val definitionURL: String? = null,

	@field:SerializedName("Definition")
	val definition: String? = null,

	@field:SerializedName("Redirect")
	val redirect: String? = null,

	@field:SerializedName("AbstractText")
	val abstractText: String? = null,

	@field:SerializedName("Image")
	val image: String? = null,

	@field:SerializedName("Infobox")
	val infobox: String? = null,

	@field:SerializedName("Answer")
	val answer: String? = null,

	@field:SerializedName("Type")
	val type: String? = null,

	@field:SerializedName("ImageIsLogo")
	val imageIsLogo: Int? = null,

	@field:SerializedName("ImageHeight")
	val imageHeight: Int? = null,

	@field:SerializedName("Results")
	val results: List<Any?>? = null,

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("ImageWidth")
	val imageWidth: Int? = null,

	@field:SerializedName("AbstractSource")
	val abstractSource: String? = null,

	@field:SerializedName("AnswerType")
	val answerType: String? = null
)