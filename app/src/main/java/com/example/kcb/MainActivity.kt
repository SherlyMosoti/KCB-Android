package com.example.kcb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.kcb.ui.theme.KCBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()

        }
    }
}

@Composable
fun Text(){
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current
        androidx.compose.material3.Text(text = "Annual Car Expo :",

            fontSize = 25.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,

        )
        Spacer(modifier = Modifier.height(20.dp))
        androidx.compose.material3.Text(text = "This year's expo is scheduled for 22nd- 26th of July 2023 .",
            fontSize = 18.sp)

        Spacer(modifier = Modifier.height(16.dp))
        androidx.compose.material3.Text(text = "High-end  Cars",
            fontSize = 23.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .height(40.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.Gray
        )
        androidx.compose.material3.Text(text = "1.Mercedes- Benz")
        androidx.compose.material3.Text(text = "2.Lamborghini")
        androidx.compose.material3.Text(text = "3.Porsche")


        Box {
            //Lottie Animation
            val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.car))
            val progress by animateLottieCompositionAsState(composition)
            LottieAnimation(composition, progress,
                modifier = Modifier.size(300.dp)
            )

        }


        Box( modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center)
        {


             Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                mContext.startActivity(Intent(mContext,formactivity::class.java)) },
                colors = ButtonDefaults.buttonColors(Color.Black)) {
                Text("See More!!")

            }
    }






        Spacer(modifier = Modifier.height(22.dp))
        androidx.compose.material3.Text(text = "Mansory Company",

            fontSize = 27.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center
        )


        androidx.compose.material3.Text(text = "List of projects",
            fontSize = 22.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline)
        androidx.compose.material3.Text(text = "1.Bentley Bentayga",
            fontSize = 15.sp)
        androidx.compose.material3.Text(text = "2.Ferrari 812 GTS",
            fontSize = 15.sp)
        androidx.compose.material3.Text(text = "3.Mercedes G Wagon",
            fontSize = 15.sp)

        Spacer(modifier = Modifier.height(16.dp))
        Divider()


        //Centering an image


        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.mansory10) ,
                contentDescription ="Mansory" ,
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                      mContext.startActivity(Intent(mContext,Layoutactivity::class.java))
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            androidx.compose.material3.Text(text = "Next")
        }


    }


}


@Preview(showBackground = true)
@Composable
fun TextPreview(){
    Text()
}