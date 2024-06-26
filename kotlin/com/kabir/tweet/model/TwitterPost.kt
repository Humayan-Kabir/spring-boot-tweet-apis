package com.kabir.tweet.model

import javax.persistence.*

@Entity
@Table(name="posts")
class TwitterPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    var twitterPostContent: String = ""

    @ManyToOne(fetch = FetchType.LAZY)
    var twitterUser: TwitterUser? = null

    @OneToMany(mappedBy = "twitterPost", cascade = [CascadeType.ALL])
    var twitterComments: List<TwitterComment> = arrayListOf()
}