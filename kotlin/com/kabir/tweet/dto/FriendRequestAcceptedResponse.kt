package com.kabir.tweet.dto

data class FriendRequestAcceptedResponse (
    var friendRequestId: Long,
    var friend: TwitterUserResponse
)