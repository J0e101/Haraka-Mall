package com.j0e101.harakamall.ui.screens.assignment

import android.graphics.fonts.Font
import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.j0e101.harakamall.R
import com.j0e101.harakamall.ui.theme.Deep
import com.j0e101.harakamall.ui.theme.Orange

@Composable
fun SignInScreen(navController: NavHostController) {
    Column (
        modifier = Modifier.background(color = Deep)
            .fillMaxSize()
            .padding(top = 40.dp)
            .verticalScroll(rememberScrollState())
    ){
        Row (
            modifier = Modifier.fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(R.drawable.basket),
                contentDescription = "",
                modifier = Modifier.size(size = 45.dp),
            )

            Text(
                text = "Logo App",
                modifier = Modifier.padding(top = 17.dp, start = 10.dp),
                color = Color.LightGray,
                fontSize = 20.sp
                )
        }

        Spacer(modifier = Modifier.height(height = 35.dp))

        Image(
            painter = painterResource((R.drawable.cart)),
            contentDescription = "",
            modifier = Modifier.size(size = 280.dp)
                .align(alignment = Alignment.CenterHorizontally),

        )

        Spacer(modifier = Modifier.height(height = 35.dp))

        Card (
            colors = CardDefaults.cardColors(Color.White),
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)

        ){
            var UserName by remember { mutableStateOf("") }
            var Password by remember { mutableStateOf("") }
            Column(
                modifier = Modifier.fillMaxSize()
                    .padding(top = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "The Most Worth",
                    color = Orange,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Grocery App",
                    color = Orange,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(height = 25.dp))

                OutlinedTextField(
                    value = UserName,
                    onValueChange = { UserName = it },
                    shape = RoundedCornerShape(20.dp),
                    label = {
                        Text(
                            text = "Username",
                            modifier = Modifier.padding(start = 85.dp),
                        )
                    },
                    modifier = Modifier.padding(start = 40.dp, end = 40.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Orange,
                        focusedLabelColor = Orange,
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    )
                )

                Spacer(modifier = Modifier.height(height = 15.dp))

                OutlinedTextField(
                    value = Password,
                    onValueChange = { Password = it },
                    shape = RoundedCornerShape(size = 28.dp),
                    label = {
                        Text(
                            text = "Password",
                            modifier = Modifier.padding(start = 85.dp),
                        )
                    },
                    modifier = Modifier.padding(start = 40.dp, end = 40.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Orange,
                        focusedLabelColor = Orange
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password
                    ),
                    visualTransformation = PasswordVisualTransformation()
                )

                Spacer(modifier = Modifier.height(height = 30.dp))

                Button(
                    onClick = {},
                    modifier = Modifier.height(height = 55.dp)
                        .fillMaxWidth()
                        .padding(start = 57.dp, end = 57.dp),
                    colors = ButtonDefaults.buttonColors(Orange)
                ) {
                    Text(
                        text = "Sign Up"
                    )
                }

                Spacer(modifier = Modifier.height(height = 30.dp))

                Row {
                    Text(
                        text = "Already are member?"
                    )
                    Text(
                        text = " Log In",
                        color = Orange,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(height = 20.dp))
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun SignInScreenPreview(){
    SignInScreen(rememberNavController())
}