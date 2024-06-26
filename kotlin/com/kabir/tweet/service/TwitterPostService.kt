package com.kabir.tweet.service

import com.example.twitterapplication.model.TwitterPost

interface TwitterPostService{
    fun getAllTwitterPosts(): List<TwitterPost>
    fun getTwitterPostById(id: Long): TwitterPost
    fun getAllTwitterPostsByUserId(userId: Long): List<TwitterPost>
    fun createTwitterPost(twitterPost: TwitterPost, id: Long): TwitterPost
    fun updateTwitterPost(postId: Long, updatedTwitterPost: TwitterPost): TwitterPost
    fun deleteTwitterPostById(id: Long)
}