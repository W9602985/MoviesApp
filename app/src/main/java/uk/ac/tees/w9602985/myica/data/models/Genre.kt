package uk.ac.tees.w9602985.myica.data.models

import com.google.gson.annotations.SerializedName

data class Genre(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
)

