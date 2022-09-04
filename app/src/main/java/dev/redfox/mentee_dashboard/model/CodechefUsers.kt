package dev.refox.trackapp.model

data class CodechefUsers(
//    val contest_ratings: List<ContestRating>,
    val contests: List<Any>,
    val country_rank: String,
    val global_rank: String,
    val highest_rating: Int,
    val rating: Int,
    val stars: String,
    val status: String,
    val user_details: UserDetails
)