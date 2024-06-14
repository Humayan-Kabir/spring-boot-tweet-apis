package com.kabir.tweet.dto

data class FriendRequestSentResponse (
    var friendRequestId: Long,
    var senderId: Long,
    var receiver: TwitterUserResponse,
    var accepted: Boolean
)