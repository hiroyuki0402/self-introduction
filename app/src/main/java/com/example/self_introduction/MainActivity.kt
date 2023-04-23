package com.example.self_introduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.self_introduction.component.CompanySection
import com.example.self_introduction.component.DetailSection
import com.example.self_introduction.component.Label
import com.example.self_introduction.ui.theme.SelfintroductionTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    /// 基本的にアプリを立ち上げた時に呼ばれる
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /// セットコンテントの中でJetpackComposeを使ってUIを作成する
            SelfintroductionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainContent()
                }
            }
        }
    }
}


@Composable
fun MainContent() {
    Column(
        /// 中央よせ
        horizontalAlignment = Alignment.CenterHorizontally,

        modifier = Modifier
            /// Viewの上下の端から端まで20ずつの余白を儲ける
            .padding(20.dp)
            /// スクロール可能にする
            .verticalScroll(rememberScrollState())

    ) {

        /// 画像
        Image(
            painter = painterResource(id = R.drawable.no_image),
            contentDescription = "プロフィール",
            modifier = Modifier
                /// 縦横指定(縦60, 横60)になる
                .size(60.dp)
                /// 丸み
                .clip(RoundedCornerShape(6.dp))
        )

        /// スペーサー
        Spacer(modifier = Modifier.height(10.dp))

        /// 名前
        Text(
            text = "黒石",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )

        /// スペーサー
        Spacer(modifier = Modifier.height(10.dp))

        /// 職業
        Text(
            text = "iOSエンジニア",
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )

        /// 会社
        CompanySection()

        /// スペーサー
        Spacer(modifier = Modifier.height(20.dp))

        /// 詳細ボタン
        var isShowDetail by remember {
             mutableStateOf(false)
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
            onClick = { isShowDetail = !isShowDetail}
        ) {
            Text(
                text = "詳細表示",
                color = Color.White,
            )
        }

        /// スペーサー
        Spacer(modifier = Modifier.height(20.dp))

        /// 詳細
        if (isShowDetail) {
            DetailSection()
        }
    }
}