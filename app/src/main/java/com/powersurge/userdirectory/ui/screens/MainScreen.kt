package com.powersurge.userdirectory.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.powersurge.userdirectory.R
import com.powersurge.userdirectory.ui.theme.UserDirectoryTheme

@Composable
fun MainScreen(
    userUiState: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {

}

@Composable
fun ResultScreen(profiles: String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        Text(text = profiles)
    }
}

@Preview(showBackground = true)
@Composable
fun ResultScreenPreview() {
    UserDirectoryTheme {
        ResultScreen(stringResource(R.string.placeholder_result))
    }
}