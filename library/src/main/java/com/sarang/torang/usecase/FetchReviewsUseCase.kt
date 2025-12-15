package com.sarang.torang.usecase

import com.sarang.torang.data.restaurantreview.Feed


interface FetchReviewsUseCase {
    suspend fun invoke(restaurantId: Int) : List<Feed>
}