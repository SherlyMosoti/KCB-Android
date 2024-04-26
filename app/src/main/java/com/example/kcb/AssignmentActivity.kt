package com.example.kcb

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kcb.ui.theme.KCBTheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assign()

        }
    }
}

@Composable
fun Assign() {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        val mContext = LocalContext.current

        //Row 1



        Card(modifier = Modifier
            .padding(start = 5.dp, end = 10.dp)
            .height(70.dp)
            .width(370.dp),
        shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp),

        ) {
            Row(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
            ) {
                Image(painter = painterResource(id = R.drawable.dog1), contentDescription ="dog",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.width(6.dp))
                Column {
                    androidx.compose.material3.Text(text = "Koda", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray)
                    androidx.compose.material3.Text(text = "2 years old", fontWeight = FontWeight.Normal, fontSize = 15.sp, fontFamily = FontFamily.SansSerif, color = Color.Gray)

                }

            }

        }


        //End of Row1
        Spacer(modifier = Modifier.height(15.dp))

        //Row 2

        Card(modifier = Modifier
            .padding(start = 5.dp, end = 10.dp)
            .height(70.dp)
            .width(370.dp),
            shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp),)
        {
            Row(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
            ) {
                Image(painter = painterResource(id = R.drawable.dog2), contentDescription ="dog",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    androidx.compose.material3.Text(text = "Lola", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray)
                    androidx.compose.material3.Text(text = "16 years old", fontWeight = FontWeight.Normal, fontSize = 15.sp, fontFamily = FontFamily.SansSerif, color = Color.Gray)

                }

            }


        }

        Spacer(modifier = Modifier.height(15.dp))


        Card(modifier = Modifier
            .padding(start = 5.dp, end = 10.dp)
            .height(70.dp)
            .width(370.dp),
            shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp),)

         {
             Row(modifier = Modifier
                 .padding(10.dp)
                 .fillMaxWidth()
             ) {
                 Image(painter = painterResource(id = R.drawable.dog2), contentDescription ="dog",
                     modifier = Modifier
                         .size(50.dp)
                         .clip(CircleShape),
                     contentScale = ContentScale.Crop

                 )
                 Spacer(modifier = Modifier.width(10.dp))
                 Column {
                     androidx.compose.material3.Text(text = "Frankie", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray)
                     androidx.compose.material3.Text(text = "2years old", fontWeight = FontWeight.Normal, fontSize = 15.sp, fontFamily = FontFamily.SansSerif, color = Color.Gray)

                 }

             }


        }


        //end of Row3

        Spacer(modifier = Modifier.height(15.dp))

        Card(modifier = Modifier
            .padding(start = 5.dp, end = 10.dp)
            .height(70.dp)
            .width(370.dp),
            shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp),)

        {
            //Row 4
            Row(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
            ) {
                Image(painter = painterResource(id = R.drawable.dog4), contentDescription ="dog",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    androidx.compose.material3.Text(text = "Nox", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray)
                    androidx.compose.material3.Text(text = "8 years old", fontWeight = FontWeight.Normal, fontSize = 15.sp, fontFamily = FontFamily.SansSerif,
                        color = Color.Gray)

                }

            }

        }
        Spacer(modifier = Modifier.height(15.dp))

        //Row



        Card(modifier = Modifier
            .padding(start = 5.dp, end = 10.dp)
            .height(70.dp)
            .width(370.dp),
            shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp),)

         {



             //Row 5
             Row(modifier = Modifier
                 .padding(10.dp)
                 .fillMaxWidth()
             ) {
                 Image(painter = painterResource(id = R.drawable.dog5), contentDescription ="dog",
                     modifier = Modifier
                         .size(50.dp)
                         .clip(CircleShape),
                     contentScale = ContentScale.Crop

                 )
                 Spacer(modifier = Modifier.width(10.dp))
                 Column {
                     androidx.compose.material3.Text(text = "Faye", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray)
                     androidx.compose.material3.Text(text = "8 years old", fontWeight = FontWeight.Normal, fontSize = 15.sp, fontFamily = FontFamily.SansSerif, color = Color.Gray)

                 }

             }


        }



        Spacer(modifier = Modifier.height(15.dp))
        //

        Card(modifier = Modifier
            .padding(start = 5.dp, end = 10.dp)
            .height(70.dp)
            .width(370.dp),
            shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp)) {
            //Row 6

            Row(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
            ) {
                Image(painter = painterResource(id = R.drawable.dog6), contentDescription ="dog",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    androidx.compose.material3.Text(text = "Bella", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    androidx.compose.material3.Text(text = "14 years old", fontWeight = FontWeight.Normal, fontSize = 15.sp, fontFamily = FontFamily.SansSerif, color = Color.Gray)

                }

            }
            //end of Row 6


        }

        Spacer(modifier = Modifier.height(10.dp))

       Card(modifier = Modifier
           .padding(start = 5.dp, end = 10.dp)
           .height(70.dp)
           .width(370.dp),
           shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp)) {


           //Row 7

           Row(modifier = Modifier
               .padding(10.dp)
               .fillMaxWidth()
           ) {
               Image(painter = painterResource(id = R.drawable.dog7), contentDescription ="dog",
                   modifier = Modifier
                       .size(50.dp)
                       .clip(CircleShape),
                   contentScale = ContentScale.Crop

               )
               Spacer(modifier = Modifier.width(10.dp))

               Column {
                   androidx.compose.material3.Text(text = "Moana", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray)

                   androidx.compose.material3.Text(text = "2 years old", fontWeight = FontWeight.Normal, fontSize = 15.sp, fontFamily = FontFamily.SansSerif, color = Color.Gray)

               }

           }
       }
        //end of row 7

        Spacer(modifier = Modifier.height(15.dp))

        Card(modifier = Modifier
            .padding(start = 5.dp, end = 10.dp)
            .height(70.dp)
            .width(370.dp),
            shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp)) {
            Row(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
            ) {
                Image(painter = painterResource(id = R.drawable.dog8), contentDescription ="dog",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    androidx.compose.material3.Text(text = "Tzeitel", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray)
                    androidx.compose.material3.Text(text = "18 years old", fontWeight = FontWeight.Normal, fontSize = 15.sp, fontFamily = FontFamily.SansSerif, color = Color.Gray)

                }




            }
            //end of Row8
             }
        //End of row 8

        Spacer(modifier = Modifier.height(15.dp))

        Card(modifier = Modifier
            .padding(start = 5.dp, end = 10.dp)
            .height(70.dp)
            .width(370.dp),
            shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp)) {
            //Row 9
            Row(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
            ) {
                Image(painter = painterResource(id = R.drawable.dog9), contentDescription ="dog",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    androidx.compose.material3.Text(text = "Kery", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray)
                    androidx.compose.material3.Text(text = "3 years old", fontWeight = FontWeight.Normal, fontSize = 15.sp, fontFamily = FontFamily.SansSerif, color = Color.Gray)

                }
            }
            //end of Row9
        }
        Spacer(modifier = Modifier.height(10.dp))
    }
}



@Preview(showBackground = true)
@Composable
fun AssignPreview(){
    Assign()
}

