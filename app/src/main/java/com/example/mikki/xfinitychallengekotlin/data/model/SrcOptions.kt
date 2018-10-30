package com.example.mikki.xfinitychallengekotlin.data.model

import com.google.gson.annotations.SerializedName

data class SrcOptions(

	@field:SerializedName("src_info")
	val srcInfo: String? = null,

	@field:SerializedName("is_mediawiki")
	val isMediawiki: Int? = null,

	@field:SerializedName("is_wikipedia")
	val isWikipedia: Int? = null,

	@field:SerializedName("skip_abstract_paren")
	val skipAbstractParen: Int? = null,

	@field:SerializedName("language")
	val language: String? = null,

	@field:SerializedName("directory")
	val directory: String? = null,

	@field:SerializedName("skip_icon")
	val skipIcon: Int? = null,

	@field:SerializedName("is_fanon")
	val isFanon: Int? = null,

	@field:SerializedName("source_skip")
	val sourceSkip: String? = null,

	@field:SerializedName("min_abstract_length")
	val minAbstractLength: String? = null,

	@field:SerializedName("skip_image_name")
	val skipImageName: Int? = null,

	@field:SerializedName("skip_abstract")
	val skipAbstract: Int? = null,

	@field:SerializedName("skip_qr")
	val skipQr: String? = null,

	@field:SerializedName("skip_end")
	val skipEnd: String? = null
)