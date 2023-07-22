package com.amit.TodoList.service;

import com.amit.TodoList.model.Status;
import com.amit.TodoList.model.Todo;
import com.amit.TodoList.repository.ITodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    ITodoRepo todoRepo;

    public List<Todo> getAllTodos() {
        return todoRepo.findAll();
    }

    public Todo getTodoById(Integer todoId) {
        return todoRepo.getReferenceById(todoId);
    }
    public String addTodo(Todo todo) {
        todoRepo.save(todo);
        return "Todo Added";
    }

    public String updateTodoStatus(Integer todoId, String status) {
        for(Todo myTodo : todoRepo.findAll())
        {
            if(myTodo.getTodoId().equals(todoId))
            {
                myTodo.setStatus(Status.valueOf(status));
                return "todo updated for todo ID:" + todoId;
            }
        }

        return "todo not found todo ID: " + todoId;
    }

    public String removeTodo(Integer todoId) {
        todoRepo.deleteById(todoId);
        return "Deleted todos";
    }
}
