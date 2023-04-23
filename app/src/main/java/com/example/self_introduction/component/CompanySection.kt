package com.example.self_introduction.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompanySection() {
    Column(
        horizontalAlignment = Alignment.Start,
        /// fillMaxWidth()にすることによって外のカラムを同じ幅になり左寄せが実現
        modifier = Modifier.fillMaxWidth()
    ) {

        /// 会社名
        Text(
            text = "株式会社XXXXX",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        /// スペーサー
        Spacer(modifier = Modifier.height(10.dp))

        /// 部署
        Text(
            text = "開発部",
            fontSize = 16.sp,
            color = Color.LightGray
        )

        /// アドレス
        Label(imageVector = Icons.Default.Email, text = "email")

        /// スペーサー
        Spacer(modifier = Modifier.height(10.dp))

        /// アドレス
        Text(
            text = "sample@a.jp",
            fontSize = 16.sp,
        )

        /// スペーサー
        Spacer(modifier = Modifier.height(5.dp))

        /// 線
        Divider(
            modifier = Modifier.clip(RoundedCornerShape(1000.dp)),
            thickness = 2.dp
        )
    }
}