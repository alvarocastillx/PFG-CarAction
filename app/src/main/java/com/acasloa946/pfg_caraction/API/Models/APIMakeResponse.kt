package com.acasloa946.pfg_caraction.API.Models

data class Collection(
    val url: String,
    val count: Int,
    val pages: Int,
    val total: Int,
    val next: String,
    val prev: String,
    val first: String,
    val last: String
)

data class APIMakeResponse(
    val collection: Collection,
    val data: List<APIMake>
)