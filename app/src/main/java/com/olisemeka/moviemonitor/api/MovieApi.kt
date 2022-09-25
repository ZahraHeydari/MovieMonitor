package com.olisemeka.moviemonitor.api

import com.olisemeka.moviemonitor.MovieListResult
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {
    @GET("list/{list_id}")
    suspend fun getMovieListResults(
        @Path("list_id")
        listId: Int,

        @Query("api_key")
        apiKey: String,

        @Query("sort_by")
        sortBy: String
    ): Response<MovieListResult>
}