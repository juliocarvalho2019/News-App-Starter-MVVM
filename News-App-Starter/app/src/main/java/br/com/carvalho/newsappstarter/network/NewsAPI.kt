package br.com.carvalho.newsappstarter.network

import br.com.carvalho.newsappstarter.model.NewsResponse
import br.com.carvalho.newsappstarter.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    //@GET("/v2/top-headlines")
    @GET("/v2/everything")
    suspend fun getBreakingNews(
//        @Query("country")
//        countryCode: String = "br",
//        @Query("category")
//        categoryCode: String = "business",
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>

    @GET("/v2/everything")
    suspend fun searchNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>

}