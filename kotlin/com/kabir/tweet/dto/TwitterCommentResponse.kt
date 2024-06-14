package com.kabir.tweet.dto

data class TwitterCommentResponse(
    var commentId: Long ,
    var commentContent: String,
    var user: TwitterUserResponse
)
