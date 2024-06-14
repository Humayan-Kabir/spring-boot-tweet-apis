package com.kabir.tweet.dto

data class LogInResponse(
    var userId: Long,
    var authorizationToken: String
)