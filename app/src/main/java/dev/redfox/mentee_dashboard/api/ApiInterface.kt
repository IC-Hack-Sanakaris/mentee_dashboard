package dev.redfox.mentee_dashboard.api

import retrofit2.Response
import dev.refox.trackapp.model.CodechefUsers
import retrofit2.http.GET


interface ApiInterface {

    @GET("/madhurmehta007")
    suspend fun getCodechefUsers() : Response<CodechefUsers>
}