package com.example.kcb

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kcb.ui.theme.KCBTheme
import com.example.kcb.ui.theme.Pink

class ChooseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Choose()

        }
    }
}

@Composable
fun Choose(){
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

        ) {
        val mContext = LocalContext.current





        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.shopping2) ,
                contentDescription ="shopping" ,
                modifier = Modifier
                    .size(300.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)



        }
        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(text = "Choose Your products",
            fontSize = 22.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold
            )
        Spacer(modifier = Modifier.height(20.dp))



        androidx.compose.material3.Text(text = "We provide  variety of items  be selected from by customers.Choose any that please you and place your order ",
            fontSize = 18.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,

            )

        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.material3.Text(text = "...",
            fontSize = 32.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold,
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,AddActivity::class.java))
            },
            shape = RoundedCornerShape(22.dp),
            colors = ButtonDefaults.buttonColors(Pink),
            modifier = Modifier
                .fillMaxWidth()

                .padding(start = 30.dp, end = 30.dp)


        ) {
            Text(text = "Next ",
                fontSize = 22.sp)

            Spacer(modifier = Modifier)


        }



    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ChoosePreview(){
    Choose()

}
