package com.kabir.tweet.exceptionhandler

import org.springframework.http.HttpStatus

data class FormattedApiError (
    var status: HttpStatus,
    var exceptionMessage: String
    )