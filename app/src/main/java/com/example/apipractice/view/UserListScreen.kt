package com.example.apipractice.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun UsersListScreen(viewModel: UsersViewModel = hiltViewModel()){

    val usersData by viewModel.userData.collectAsState()

    Column (
        modifier = Modifier
            .padding(16.dp).padding(top = 90.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        LazyColumn {
            items(usersData?.data ?: emptyList()) { user ->
                Text(text = user?.firstName ?: "No Name")
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun PreviewUsersListScreen(){
    UsersListScreen()
}