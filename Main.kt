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

fun main() {
    val taskManager = TaskManager()
    val scanner = Scanner(System.`in`)
    var running = true

    println("=== Kotlin Task Manager ===")

    while (running) {
        print("\nChoose an option: (1) Add (2) List (3) Remove (4) Exit → ")
        when (scanner.nextLine()) {
            "1" -> {
                print("Enter task description: ")
                val task = scanner.nextLine()
                taskManager.addTask(task)
            }
            "2" -> taskManager.listTasks()
            "3" -> {
                print("Enter task number to remove: ")
                val number = scanner.nextLine().toIntOrNull()
                if (number != null) taskManager.removeTask(number - 1)
                else println("Invalid input.")
            }
            "4" -> {
                running = false
                println("Goodbye!")
            }
            else -> println("Invalid option. Try again!")
        }
    }
}

