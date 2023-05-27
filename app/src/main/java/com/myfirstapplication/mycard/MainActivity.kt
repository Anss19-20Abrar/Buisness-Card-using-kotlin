package com.myfirstapplication.mycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myfirstapplication.mycard.ui.theme.MyCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,

                ) {
                    Greeting()
                }
            }
        }
    }
}




@Composable
fun Greeting() {

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .fillMaxSize()
            .background(color = Color(230, 202, 113, 255)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
        val imageModifier = Modifier
            .size(150.dp)
            .border(BorderStroke(1.dp, Color.Black))
            .background(Color.Yellow)

        Image(
            painter = painterResource(id = R.drawable.wolf),
            contentDescription = stringResource(id = androidx.compose.ui.R.string.default_error_message),
            contentScale = ContentScale.Fit,
            modifier = imageModifier
            )

        Text(
            text = "Ans Abrar",
            fontSize=30.sp,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = "Best Android Developer",
            fontSize=20.sp,
            color= Color(2, 45, 77, 255)
           
        )


    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()


    ){

        Column {
            Row {
                val image = painterResource(id = R.drawable.baseline_email_24)
                Image(
                    painter = image,
                    contentDescription = null,


                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "20021519-053@gmail.com",
                    fontSize = 20.sp,
                    color = Color(4, 0, 128, 255)

                )
            }

            Row() {
                val image = painterResource(id = R.drawable.baseline_local_phone_24)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.padding(top = 15.dp)

                )
                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = "(+92)3338163085",
                    fontSize = 20.sp,
                    color = Color(3, 23, 85, 255) ,
                    modifier = Modifier.padding(top = 15.dp)

                )
            }
            Row() {
                val image = painterResource(id = R.drawable.baseline_share_24)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.padding(top = 15.dp)

                    )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "@Ans_Abrar",
                    fontSize = 20.sp,
                    color = Color(1, 21, 95, 255),
                    modifier = Modifier.padding(bottom = 50.dp, top = 15.dp)

                )
            }
        }


    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCardTheme {
        Greeting()
    }
}