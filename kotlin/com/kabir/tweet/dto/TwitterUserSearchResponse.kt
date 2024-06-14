package com.kabir.tweet.dto

data class TwitterUserSearchResponse (
        var twitterUserResponse: TwitterUserResponse,
        var friendRequestId: Long,
        var friendShipStatus: String?
)

