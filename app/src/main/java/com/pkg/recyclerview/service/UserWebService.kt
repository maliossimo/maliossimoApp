package com.pkg.recyclerview.service

import com.pkg.recyclerview.model.*
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*

interface UserWebService {
    @Multipart
    @PATCH("users/update_avatar")
    suspend fun updateAvatar(@Part avatar: MultipartBody.Part): Response<UserInfo>

    @GET("users/info")
    suspend fun getInfo(): Response<UserInfo>;

    @PATCH("users")
    suspend fun update(@Body user: UserInfo): Response<UserInfo>

    @POST("users/login")
    suspend fun login(@Body user: LoginForm): Response<LoginResponse>

    @POST("users/sign_up")
    suspend fun register(@Body user : RegisterForm): Response<RegisterResponse>
}