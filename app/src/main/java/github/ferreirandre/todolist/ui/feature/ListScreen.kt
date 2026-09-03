package github.ferreirandre.todolist.ui.feature

import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import github.ferreirandre.todolist.domain.Todo
import github.ferreirandre.todolist.domain.todo1
import github.ferreirandre.todolist.domain.todo2
import github.ferreirandre.todolist.domain.todo3
import github.ferreirandre.todolist.ui.theme.TodoListTheme

@Composable
fun ListScreen(
) {
}

@Composable
fun ListContent(
    todos: List<Todo>
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) {
        LazyColumn(modifier = Modifier.consumeWindowInsets(it)) {
            items(todos) {
                Text(text = it.title)
            }
        }
    }
}

@Preview
@Composable
private fun ListContentPreview() {
    TodoListTheme {
        ListContent(
            todos = listOf(todo1, todo2, todo3)
        )
    }
}