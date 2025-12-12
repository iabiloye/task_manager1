fun main() {
    println("Hello, world!")
}
import java.util.Scanner
class TaskManager {
    private val tasks = mutableListOf<String>()

    fun addTask(task: String) {
        tasks.add(task)
        println("Task added: \"$task\"")
    }

    fun removeTask(index: Int) {
        if (index in tasks.indices) {
            println("Removed: \"${tasks[index]}\"")
            tasks.removeAt(index)
        } else {
            println("Invalid task number.")
        }
    }

    fun listTasks() {
        if (tasks.isEmpty()) {
            println("No tasks yet!")
        } else {
            println("Your Tasks:")
            tasks.forEachIndexed { i, task ->
                println("${i + 1}. $task")
            }
        }
    }
}