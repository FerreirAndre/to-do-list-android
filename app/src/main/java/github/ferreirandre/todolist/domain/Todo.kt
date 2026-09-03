package github.ferreirandre.todolist.domain

data class Todo(
    val id: Long,
    val title: String,
    val description: String?,
    val isCompleted: Boolean,
)

// fake objects

val todo1 = Todo(
    id = 1,
    title = "primeira tarefa",
    description = "descricao da tarefa 1",
    isCompleted = false
)

val todo2 = Todo(
    id = 2,
    title = "segunda tarefa",
    description = "descricao da tarefa 2",
    isCompleted = true
)

val todo3 = Todo(
    id = 3,
    title = "terceira tarefa",
    description = "descricao da tarefa 3",
    isCompleted = false
)
