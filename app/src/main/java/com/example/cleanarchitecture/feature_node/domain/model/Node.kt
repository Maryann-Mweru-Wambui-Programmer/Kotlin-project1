package com.example.cleanarchitecture.feature_node.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cleanarchitecture.ui.theme.Pink40
import com.example.cleanarchitecture.ui.theme.Pink80
import com.example.cleanarchitecture.ui.theme.Purple40
import com.example.cleanarchitecture.ui.theme.Purple80
import com.example.cleanarchitecture.ui.theme.PurpleGrey40
import com.example.cleanarchitecture.ui.theme.PurpleGrey80
import java.sql.Timestamp

@Entity
data class Node(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object {
        val noteColors = listOf(Purple80, Pink40, Purple40, PurpleGrey40, Pink80, PurpleGrey80)
    }
}
