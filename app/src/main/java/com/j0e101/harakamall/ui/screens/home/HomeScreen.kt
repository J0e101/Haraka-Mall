package com.j0e101.harakamall.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
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
fun HomeScreen(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize().
        paint(painter = painterResource(R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Text(
            text = "Haraka Mall at your Service",
            fontSize = 25.sp,
            color = Color.Blue,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            fontWeight = FontWeight.ExtraBold,

        )

        Image(
            painter = painterResource(R.drawable.ohm),
            contentDescription = "hoem",
            alignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth(),
        )

        Text(
            text = "Welcome bruh...",
            fontSize = 15.sp,
            fontWeight = FontWeight.Thin,
            fontStyle = FontStyle.Italic,
        )

        Text(
            text = "According to Statista, the eCommerce market is massive and is projected to achieve more than \$7.4 trillion worth of sales in 2025. Ever since Amazon launched its online shopping site in 1995, the industry has transformed immensely, giving birth to many popular ecommerce websites. If you’re on the fence about creating an eCommerce website, we advise you not to wait for the right moment. To help you get started, we’ve compiled a list of the top eCommerce websites from which you can take inspiration.",
            fontSize = 10.sp,
        )

        Spacer(modifier = Modifier.height(height = 5.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Orange),
            shape = RoundedCornerShape(size = 5.dp),
            modifier = Modifier.height(height = 50.dp),

        ) {
            Text(
                text = "Learn More...",
                color = Color.White
            )
        }




    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}

