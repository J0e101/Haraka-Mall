package com.j0e101.harakamall.ui.screens.form

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.j0e101.harakamall.R
import com.j0e101.harakamall.navigation.ROUT_HOME
import com.j0e101.harakamall.ui.theme.Orange
import com.j0e101.harakamall.ui.theme.Red
import com.j0e101.harakamall.ui.theme.Sand
import java.nio.file.WatchEvent

@Composable
fun FormScreen(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState())
            .paint(painter = painterResource(R.drawable.purple), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "Create An Account",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.LightGray
        )

        Spacer(modifier = Modifier.height(height = 30.dp))

        //Variables
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }

        //Fullname
        OutlinedTextField(
            value = fullname,
            onValueChange = { fullname = it },
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "",
                    tint = Orange
                )
            },
            label = {
                Text(
                    text = "Fullname",
                    color = Color.LightGray
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Orange,
                focusedLabelColor = Sand,
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )
        //EndFullname

        Spacer(modifier = Modifier.height(height = 10.dp))

        //Username
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "",
                    tint = Orange
                )
            },
            label = {
                Text(
                    text = "Username",
                    color = Color.LightGray
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Orange,
                focusedLabelColor = Sand,
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )
        //EndUsername

        Spacer(modifier = Modifier.height(height = 10.dp))

        //Email
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.MailOutline,
                    contentDescription = "",
                    tint = Orange
                )
            },
            label = {
                Text(
                    text = "Email",
                    color = Color.LightGray
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Orange,
                focusedLabelColor = Orange,
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
        )
        //EndEmail

        Spacer(modifier = Modifier.height(height = 10.dp))

        //Password
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "",
                    tint = Orange
                )
            },
            label = {
                Text(
                    text = "Password",
                    color = Color.LightGray
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Orange,
                focusedLabelColor = Sand,
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = PasswordVisualTransformation()
        )
        //EndPassword

        Spacer(modifier = Modifier.height(height = 10.dp))

        //Confirm
        OutlinedTextField(
            value = confirmpassword,
            onValueChange = { confirmpassword = it },
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "",
                    tint = Orange
                )
            },
            label = {
                Text(
                    text = "Confirm Password",
                    color = Color.LightGray
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Orange,
                focusedLabelColor = Sand,
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = PasswordVisualTransformation()
        )
        //EndConfirm

        Spacer(modifier = Modifier.height(height = 20.dp))

        Button(
            onClick = {
                navController.navigate(ROUT_HOME)
            },
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Orange)

        ) {
            Text(
                text = "Sign Up"
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())
}