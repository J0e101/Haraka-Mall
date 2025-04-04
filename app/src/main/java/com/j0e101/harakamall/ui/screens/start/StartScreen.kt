package com.j0e101.harakamall.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.j0e101.harakamall.R
import com.j0e101.harakamall.ui.theme.Orange

@Composable
fun StartScreen(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Haraka Mall",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.DarkGray,
        )

        Spacer(modifier = Modifier.height(20.dp))

        //Circular Image
        Image(
            painter = painterResource(R.drawable.mall),
            contentDescription = "Start",
            modifier = Modifier.size(200.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        //It's done!!!

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Find Your Order Here!!",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Orange,
        )

        Text(
            text = "Looking for the perfect place to unwind? Two Rivers Mall is your ultimate family destination! With the largest entertainment park and the biggest screen in East & Central Africa, there's fun for everyone. Explore over 160 stores and indulge in a variety of cuisines at over 20 restaurants.",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                navController.navigate("item")
            },
            colors = ButtonDefaults.buttonColors(Orange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
        ) {
            Text(
                text = "Get Started"
            )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(rememberNavController())
}

