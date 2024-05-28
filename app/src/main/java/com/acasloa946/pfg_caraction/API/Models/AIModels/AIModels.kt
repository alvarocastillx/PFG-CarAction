package com.acasloa946.pfg_caraction.API.Models.AIModels

data class ChatRequest(
    val model: String,
    val messages: List<Message>,
    val temperature: Double
)

data class Message(
    val role: String,
    val content: String
)

data class ChatCompletionResponse(
    val id: String? = null,
    val `object`: String? = null,
    val created: Long? = null,
    val model: String? = null,
    val choices: List<ChatChoice>? = null,
    val usage: ChatUsage? = null
)

data class ChatChoice(
    val index: Int,
    val message: ChatMessage,
    val finish_reason: String
)

data class ChatMessage(
    val role: String,
    val content: String
)

data class ChatUsage(
    val prompt_tokens: Int,
    val completion_tokens: Int,
    val total_tokens: Int
)