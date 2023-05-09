package com.example.navigation

import android.content.Context
import android.view.View
import androidx.fragment.app.Fragment

interface AddReviewNavigation {
    fun navigate(fragment: Fragment)
}

interface FeedNavigations {
    fun goAddReview(context: Context, view : View)
    fun goProfile(context: Context, view : View)
    fun goComment(context: Context, view : View)
    fun goRestaurant(context: Context, view : View)
    fun goFullImage(context: Context, view : View)
}