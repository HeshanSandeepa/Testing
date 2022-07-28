package com.example.android.architecture.blueprints.todoapp.test

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android.architecture.blueprints.todoapp.tasks.TasksViewModel
import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TasksViewModelTest : TestCase() {

    @Test
    fun addNewTask_setsNewTaskEvent() {

        val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())

        // When adding a new task
        tasksViewModel.addNewTask()
    }
}