package com.kabir.tweet.dto

data class FriendRequestReceivedResponse(
    var friendRequestId: Long,
    var sender: TwitterUserResponse,
    var receiverId: Long,
    var accepted: Boolean
)
