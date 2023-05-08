package com.example.navigation

import androidx.fragment.app.Fragment

interface AddReviewNavigation {
    fun navigate(fragment: Fragment)
}

interface FeedNavigations {
    fun goAddReview()
    fun goProfile()
    fun goComment()
    fun goRestaurant()
    fun goFullImage()
}