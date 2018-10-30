package com.example.mikki.xfinitychallengekotlin.data.model

import com.google.gson.annotations.SerializedName

data class Meta(

	@field:SerializedName("src_url")
	val srcUrl: Any? = null,

	@field:SerializedName("js_callback_name")
	val jsCallbackName: String? = null,

	@field:SerializedName("perl_module")
	val perlModule: String? = null,

	@field:SerializedName("example_query")
	val exampleQuery: String? = null,

	@field:SerializedName("repo")
	val repo: String? = null,

	@field:SerializedName("dev_date")
	val devDate: Any? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("unsafe")
	val unsafe: Int? = null,

	@field:SerializedName("src_name")
	val srcName: String? = null,

	@field:SerializedName("blockgroup")
	val blockgroup: Any? = null,

	@field:SerializedName("maintainer")
	val maintainer: Maintainer? = null,

	@field:SerializedName("src_domain")
	val srcDomain: String? = null,

	@field:SerializedName("tab")
	val tab: String? = null,

	@field:SerializedName("is_stackexchange")
	val isStackexchange: Any? = null,

	@field:SerializedName("production_state")
	val productionState: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("src_id")
	val srcId: Int? = null,

	@field:SerializedName("designer")
	val designer: Any? = null,

	@field:SerializedName("dev_milestone")
	val devMilestone: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("attribution")
	val attribution: Any? = null,

	@field:SerializedName("producer")
	val producer: Any? = null,

	@field:SerializedName("signal_from")
	val signalFrom: String? = null,

	@field:SerializedName("topic")
	val topic: List<String?>? = null,

	@field:SerializedName("developer")
	val developer: List<DeveloperItem?>? = null,

	@field:SerializedName("created_date")
	val createdDate: Any? = null,

	@field:SerializedName("live_date")
	val liveDate: Any? = null,

	@field:SerializedName("src_options")
	val srcOptions: SrcOptions? = null,

	@field:SerializedName("status")
	val status: String? = null
)