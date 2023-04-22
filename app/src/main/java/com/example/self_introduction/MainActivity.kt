package com.example.self_introduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    Column(
                        /// 中央よせ
                        horizontalAlignment = Alignment.CenterHorizontally,

                        /// Viewの上下の端から端まで20ずつの余白を儲ける
                        modifier = Modifier.padding(20.dp)

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

                        /// スペーサー
                        Spacer(modifier = Modifier.height(20.dp))

                        /// 左寄せ
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

                            Row(
                                verticalAlignment = Alignment.CenterVertically,

                            ) {
                                Image(imageVector = Icons.Default.Email, contentDescription = "email")

                                /// スペーサー
                                Spacer(modifier = Modifier.width(10.dp))

                                Text(
                                    text = "E-mail",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
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
                }
            }
        }
    }
}
