package com.kabir.tweet.mapper

import com.example.twitterapplication.dto.TwitterUserRequest
import com.example.twitterapplication.model.TwitterUser

fun TwitterUserRequest.toTwitterUser(): TwitterUser {

    val entity = TwitterUser()
    entity.firstName = this.firstName
    entity.lastName = this.lastName
    entity.email = this.email
    entity.password = this.password
    return entity
}